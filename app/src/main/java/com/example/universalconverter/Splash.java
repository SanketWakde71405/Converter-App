package com.example.universalconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Splash extends AppCompatActivity {

    ImageView logoHolder;
    private static final int SPLASH_SCREEN=5000;
    Animation top_anim,bottom_anim;
    RelativeLayout appNameHolder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        logoHolder=findViewById(R.id.AppLogoHolder);
        appNameHolder=findViewById(R.id.AppNameHolder);

        bottom_anim= AnimationUtils.loadAnimation(this,R.anim.bottom_to_top);

        logoHolder.setAnimation(top_anim);
        appNameHolder.setAnimation(bottom_anim);

        new Handler().postDelayed(() -> {


            Intent intent=new Intent(Splash.this,MainActivity.class);
            startActivity(intent);
            finish();
        },SPLASH_SCREEN);

    }
}