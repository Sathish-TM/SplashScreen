package com.sathish.code.splashscreen;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Splash Screen time
    private static int SPLASH_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                // Create Intent for next Activity navigation
                Toast.makeText(getApplicationContext(),"Start New Activity",Toast.LENGTH_SHORT).show();
                finish();
            }
        }, SPLASH_OUT);
    }
}