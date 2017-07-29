package com.example.ayaali.builditbigger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myandroidlibrary.DisplayJoke;


public class MainActivity extends AppCompatActivity implements jokeTeller{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void tellJoke(String joke) {
        Intent intent = new Intent(this, DisplayJoke.class);
        intent.putExtra("jokeToDisplay", joke);
        startActivity(intent);
    }
    public void triggerApi(View view)
    {
        new JokeAsyncTask().execute(this);
    }
}
