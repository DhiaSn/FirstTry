package com.isamm.firsttry;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_AppCompat_Light);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        // button3.setBackgroundColor(getResources().getColor(R.color.red));
    }
}