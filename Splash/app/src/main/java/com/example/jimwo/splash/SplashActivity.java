package com.example.jimwo.splash;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;

/**
 * Created by jimwo on 2016-08-04.
 */
public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        startActivity(new Intent(this, Splash.class));
        finish();
    }
}
