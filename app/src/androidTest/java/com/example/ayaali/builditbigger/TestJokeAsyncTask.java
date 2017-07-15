package com.example.ayaali.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class TestJokeAsyncTask {
    private jokeTeller jokeTeller = new jokeTeller() {
        @Override
        public void tellJoke(String joke) {
            // ignore this
        }
    };

    @Test
    public void verifyAsyncTask() {
        JokeAsyncTask asyncTask = new JokeAsyncTask();
        String result = asyncTask.doInBackground(jokeTeller);
        assertEquals("Why did the Beagle roll toilet paper down the hill?\n" +
                "So it could get to the bottom!", result);
    }
}
