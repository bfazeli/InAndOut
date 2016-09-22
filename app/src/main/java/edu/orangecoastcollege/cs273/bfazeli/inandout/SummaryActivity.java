package edu.orangecoastcollege.cs273.bfazeli.inandout;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SummaryActivity extends Activity {

    TextView totalTextView, itemCountTextView, subtotalTextView, taxTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // Hook-up view components with the TextView fields of the class
        totalTextView = (TextView) findViewById(R.id.totalTextView);
        itemCountTextView = (TextView) findViewById(R.id.itemCountTextView);
        subtotalTextView = (TextView) findViewById(R.id.subtotalTextView);
        taxTextView = (TextView) findViewById(R.id.taxTextView);


        // Get the intent that was sent
        Intent orderIntent = getIntent();

        // Set appropriate TextView texts to the text that was sent
        totalTextView.setText(orderIntent.getStringExtra("Total"));
        itemCountTextView.setText(orderIntent.getStringExtra("ItemCount"));
        subtotalTextView.setText(orderIntent.getStringExtra("Subtotal"));
        taxTextView.setText(orderIntent.getStringExtra("Tax"));
    }

    public void returnToOrderEntry(View view) { this.finish(); }
}
