package com.example.klola.proyekjava;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder (View view) {
        int numberOfCoffe = 2;
        int harga =  numberOfCoffe * 5;
        int gelas = numberOfCoffe * 2;
        int gTotal = gelas + harga;
        display (harga);
        displayPrice(gTotal);
    }

    private void display(int i) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + i);
    }

    private void displayPrice(int j) {
        TextView displayTextView = (TextView) findViewById(R.id.price_text_view);
        displayTextView.setText(NumberFormat.getCurrencyInstance().format(j));
    }

}
