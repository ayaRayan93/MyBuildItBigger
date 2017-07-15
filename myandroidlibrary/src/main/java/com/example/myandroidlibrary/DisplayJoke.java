package com.example.myandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView jokeTextView = (TextView) findViewById(R.id.text);
        if (getIntent().getExtras() != null) {
            Bundle intentData = getIntent().getExtras();
            String joke = intentData.getString("jokeToDisplay", "Default joke");
            jokeTextView.setText(joke);
        } else {
            jokeTextView.setText("no joke found");
        }

    }
}
