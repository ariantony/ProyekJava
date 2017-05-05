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
    public void increment (View view) {
        int quantity = 3 ;
        display (quantity);
    }

    public void submitOrder (View view) {
        display ((77*2)+1);
        displayPrice ((77*2)+1);
    }

    private void display(int i) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + i);
    }

    private void displayPrice(int j) {
        TextView displayTextView = (TextView) findViewById(R.id.price_text_view);
        displayTextView.setText(NumberFormat.getCurrencyInstance().format(j));

    }
    private void dispay1(int k) = (TextView) findViewById(R.id.quantity_text_view)};

