package com.example.ayaali.builditbigger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myandroidlibrary.DisplayJoke;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity implements jokeTeller{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, "ca-app-pub-1266428039068299~1512693161");
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
