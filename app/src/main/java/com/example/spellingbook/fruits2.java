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



public class fruits2 extends AppCompatActivity {
    GridView grill;
    Button btnfruits;
    String[] numberword = {"Apple", "Orange", "Grapes", "Strawberry", "Cherry", "Watermelon", "Banana", "Papaya", "Pomegranate",
            "Kiwi", "Pineapple", "Mango"};
    int[] numberimage = {
            R.drawable.apple,
            R.drawable.orange,
            R.drawable.grap,
            R.drawable.straw,
            R.drawable.cher,
            R.drawable.water,
            R.drawable.bana,
            R.drawable.pap,
            R.drawable.pom,
            R.drawable.kiwi,
            R.drawable.pine, R.drawable.mango};
    private TextToSpeech t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits2);

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });

        btnfruits = findViewById(R.id.back_button_fruits);
        btnfruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        grill = findViewById(R.id.gridview4);
        mainAdapter adapter = new mainAdapter(fruits2.this, numberword, numberimage);
        grill.setAdapter(adapter);

        grill.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                t1.speak(numberword[position], TextToSpeech.QUEUE_FLUSH, null);


//                Toast.makeText(getApplicationContext(), "You Clicked" + numberword[+position],
//                        Toast.LENGTH_SHORT).show();
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