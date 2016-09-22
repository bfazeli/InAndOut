package edu.orangecoastcollege.cs273.bfazeli.inandout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Currency;

public class OrderActivity extends AppCompatActivity {

    private EditText doubleDoubleEditText, cheeseburgerEditText, frenchFriesEditText,
                        shakesEditText, smallDrinksEditText, mediumDrinksEditText,
                        largeDrinksEditText;

    private Order currentOrder;

    private String totalText, itemsOrderedText, subTotalText, taxText;

    private Intent orderIntent;

    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        doubleDoubleEditText = (EditText) findViewById(R.id.doubleDoubleEditText);
        cheeseburgerEditText = (EditText) findViewById(R.id.cheeseburgerEditText);
        frenchFriesEditText = (EditText) findViewById(R.id.frenchFriesEditText);
        shakesEditText = (EditText) findViewById(R.id.shakesEditText);
        smallDrinksEditText = (EditText) findViewById(R.id.smallDrinksEditText);
        mediumDrinksEditText = (EditText) findViewById(R.id.mediumDrinksEditText);
        largeDrinksEditText = (EditText) findViewById(R.id.largeDrinksEditText);

        currentOrder = new Order();
    }

    //Button for sending order
    private void sendOrder (View view) {
        setOrder();

        constructOrderText();
        setUpIntent();

        //Start the new Activity w/ the intent data
        startActivity(orderIntent);
    }

    private void setOrder() {
        int doubleDouble, cheeseburger, frenchfries, shakes,
                smallDrinks, mediumDrinks, largeDrinks;

        try {
            doubleDouble = Integer.parseInt(doubleDoubleEditText.getText().toString());
            cheeseburger = Integer.parseInt(cheeseburgerEditText.getText().toString());
            frenchfries = Integer.parseInt(frenchFriesEditText.getText().toString());
            shakes = Integer.parseInt(shakesEditText.getText().toString());
            smallDrinks = Integer.parseInt(smallDrinksEditText.getText().toString());
            mediumDrinks = Integer.parseInt(mediumDrinksEditText.getText().toString());
            largeDrinks = Integer.parseInt(largeDrinksEditText.getText().toString());
        }
        catch (NumberFormatException e) {
            doubleDouble = 0;
            cheeseburger = 0;
            frenchfries = 0;
            shakes = 0;
            smallDrinks = 0;
            mediumDrinks = 0;
            largeDrinks = 0;
        }

        currentOrder.setDoubleDoubles(doubleDouble);
        currentOrder.setCheeseburgers(cheeseburger);
        currentOrder.setFrenchFries(frenchfries);
        currentOrder.setShakes(shakes);
        currentOrder.setSmallDrinks(smallDrinks);
        currentOrder.setMediumDrinks(mediumDrinks);
        currentOrder.setLargeDrinks(largeDrinks);
    }

    private void constructOrderText() {
        totalText = getString(R.string.total) + " " + currency.format(currentOrder.calculateTotal());
        itemsOrderedText = getString(R.string.item_count) + " " + currentOrder.getNumberItemsOrdered();
        subTotalText = getString(R.string.subtotal) + " " + currency.format(currentOrder.calculateSubtotal());
        taxText = getString(R.string.tax) + " " + currency.format(currentOrder.calculateTax());
    }

    private void setUpIntent() {
        orderIntent = new Intent(this, SummaryActivity.class);

        orderIntent.putExtra("Total", totalText);
        orderIntent.putExtra("ItemCount", itemsOrderedText);
        orderIntent.putExtra("Subtotal", subTotalText);
        orderIntent.putExtra("Tax", taxText);
    }
}
