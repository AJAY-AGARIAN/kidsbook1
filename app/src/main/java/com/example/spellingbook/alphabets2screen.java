package com.example.spellingbook;


import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;



public class alphabets2screen extends AppCompatActivity {
    GridView grill;
    Button btnalpah2;
    public static String[] eachWord = {"Apple", "Ball", "Cat", "Drum", "Egg", "Fish", " Gloves", "House", "Iglu", "Jug", "Key", "Lock", "Mug", "Nest", "Orange",
            "Pumpkin", "Queen", "Robot", "Snake", "Tree",
            "Umbrella", "Volcano", "Watch", "Xylophone", "Yoyo", "Zip"};
    public static String[] eachWord2 = {"a for Apple", "b for Boll", "c for Cat", "d for Drum", "e for Egg", " f for Fish", "g for  gloves", "h for House",
            "i for iglu", "j for Jug", "k for Key", "l for Lock", "m for Mug", "n for Nest", "o for Orange", "p for Pumpkin", "q for Queen",
            "r for robot", "s for Snake", "t for Tree",
            "u for Umbrella", "v for volcano", "w for Watch", "x for Xylophone", "y for YoYo", "z for Zip"};
    public static int[] wordImage = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l,
            R.drawable.m,
            R.drawable.n,
            R.drawable.o,
            R.drawable.p,
            R.drawable.q,
            R.drawable.r,
            R.drawable.s,
            R.drawable.t,
            R.drawable.u,
            R.drawable.v,
            R.drawable.w,
            R.drawable.x,
            R.drawable.y,
            R.drawable.z};
    private TextToSpeech t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets2screen);
        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });
        btnalpah2 = findViewById(R.id.back_button2);
        btnalpah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        grill = findViewById(R.id.gridview);
        alphaAdapter adapter = new alphaAdapter(alphabets2screen.this, eachWord, wordImage);
        grill.setAdapter(adapter);


        grill.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                t1.speak(eachWord2[position], TextToSpeech.QUEUE_FLUSH, null);

//
//                Toast.makeText(getApplicationContext(), "You Clicked" + eachWord[+position],
//                        Toast.LENGTH_SHORT).show();


//                Intent intent = new Intent(alphabets2screen.this, eachAlphabet3.class);
//                intent.putExtra("position", position + "");
//                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Intent.ACTION_MAIN);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        finish();
    }

}
