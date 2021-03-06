package com.sathish.code.splashscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
                Toast.makeText(getApplicationContext(),"Start New Activity from the Android Studio..",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                finish();
                Log.w("Given Log View","Success");
                //finish();
            }
        }, SPLASH_OUT);
    }


    public void funGame(){
        Toast.makeText(getApplicationContext(),"This is the new Toast indicator",Toast.LENGTH_SHORT).show();
    }
}
