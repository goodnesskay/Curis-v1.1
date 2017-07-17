package me.goodnesskayode.curis;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    private int SPLASH_SCREEN_TIMEOUT=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent auth = new Intent(getApplicationContext(),SignupActivity.class);
                startActivity(auth);
                finish();
            }
        },SPLASH_SCREEN_TIMEOUT);
    }
}
