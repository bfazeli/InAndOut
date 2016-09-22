package edu.orangecoastcollege.cs273.bfazeli.inandout;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Currency;

/**
 * OrderActivity class, serves as controller between Order.java and activity_order.xml.
 *
 * @author bijanfazeli
 */
public class OrderActivity extends Activity {

    // Declarations
    private EditText doubleDoubleEditText, cheeseburgerEditText, frenchFriesEditText,
                        shakesEditText, smallDrinksEditText, mediumDrinksEditText,
                        largeDrinksEditText;

    private Order currentOrder;

    private String totalText, itemsOrderedText, subTotalText, taxText;

    // Setting up currency region specific
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

    /**
     * sendOrder   Sends an intent to SummaryActivity.
     * @param view
     */
    public void sendOrder (View view) {
        setOrder();

        constructOrderText();

        Intent summaryIntent = new Intent(this, SummaryActivity.class);
        summaryIntent.putExtra("Total", totalText);
        summaryIntent.putExtra("ItemCount", itemsOrderedText);
        summaryIntent.putExtra("Subtotal", subTotalText);
        summaryIntent.putExtra("Tax", taxText);

        resetAllFields();

        //Start the new Activity w/ the intent data
        startActivity(summaryIntent);
    }

    private void setOrder() {
        int doubleDouble, cheeseburger, frenchFries, shakes,
                smallDrinks, mediumDrinks, largeDrinks;

        try {
            doubleDouble = Integer.parseInt(doubleDoubleEditText.getText().toString());
        } catch (NumberFormatException e) {
            doubleDouble = 0;
        }

        try {
            cheeseburger = Integer.parseInt(cheeseburgerEditText.getText().toString());
        } catch (NumberFormatException e) {
            cheeseburger = 0;
        }

        try {
            frenchFries = Integer.parseInt(frenchFriesEditText.getText().toString());
        } catch (NumberFormatException e) {
            frenchFries = 0;
        }

        try {
            shakes = Integer.parseInt(shakesEditText.getText().toString());
        } catch (NumberFormatException e) {
            shakes = 0;
        }

        try {
            smallDrinks = Integer.parseInt(smallDrinksEditText.getText().toString());
        } catch (NumberFormatException e) {
            smallDrinks = 0;
        }

        try {
            mediumDrinks = Integer.parseInt(mediumDrinksEditText.getText().toString());
        } catch (NumberFormatException e) {
            mediumDrinks = 0;
        }

        try {
            largeDrinks = Integer.parseInt(largeDrinksEditText.getText().toString());
        } catch (NumberFormatException e) {
            largeDrinks = 0;
        }

        currentOrder.setDoubleDoubles(doubleDouble);
        currentOrder.setCheeseburgers(cheeseburger);
        currentOrder.setFrenchFries(frenchFries);
        currentOrder.setShakes(shakes);
        currentOrder.setSmallDrinks(smallDrinks);
        currentOrder.setMediumDrinks(mediumDrinks);
        currentOrder.setLargeDrinks(largeDrinks);
    }

    // Build the order
    private void constructOrderText() {
        totalText = getString(R.string.total) + " " + currency.format(currentOrder.calculateTotal());
        itemsOrderedText = getString(R.string.item_count) + " " + currentOrder.getNumberItemsOrdered();
        subTotalText = getString(R.string.subtotal) + " " + currency.format(currentOrder.calculateSubtotal());
        taxText = getString(R.string.tax) + " " + currency.format(currentOrder.calculateTax());
    }

    // Reset all the fields in our order
    private void resetAllFields() {
        // Reset all field values in the Order model
        currentOrder.setLargeDrinks(0);
        currentOrder.setCheeseburgers(0);
        currentOrder.setMediumDrinks(0);
        currentOrder.setSmallDrinks(0);
        currentOrder.setShakes(0);
        currentOrder.setFrenchFries(0);
        currentOrder.setDoubleDoubles(0);

        // Reset all text fields in our view
        doubleDoubleEditText.setText("");
        cheeseburgerEditText.setText("");
        frenchFriesEditText.setText("");
        shakesEditText.setText("");
        largeDrinksEditText.setText("");
        mediumDrinksEditText.setText("");
        smallDrinksEditText.setText("");
    }
}
