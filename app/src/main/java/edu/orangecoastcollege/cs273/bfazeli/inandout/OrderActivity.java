package edu.orangecoastcollege.cs273.bfazeli.inandout;

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

    private void sendOrder (View view) {
        setOrder();


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
        //totalText = getString(R.string.id)
    }
}
