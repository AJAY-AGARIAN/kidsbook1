package com.example.spellingbook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCreen = 3000;
    Animation topanim, bottomanim;
    ImageView image;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        topanim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomanim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        image = findViewById(R.id.imageView);
//        text = findViewById(R.id.textview);

        image.setAnimation(topanim);
//        text.setAnimation(bottomanim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, secondscreen.class));
                finish();
            }

        },SPLASH_SCreen);


    }
}
