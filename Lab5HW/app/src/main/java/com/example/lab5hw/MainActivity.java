package com.example.lab5hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count;
    private TextView counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 0;
        counter = findViewById(R.id.counter_label);

        // Restore the state.
        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("counter");
            counter.setText(Integer.toString(count));
        }
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", count);
    }

    public void increaseCount(View view) {
        count++;
        counter.setText(Integer.toString(count));
    }
}