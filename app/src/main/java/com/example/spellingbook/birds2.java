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

public class birds2 extends AppCompatActivity {
    GridView grill;
    Button backbuttion;
    String[] numberword = {"Peacock", "Parrot", "Duck", "Hen", "Owl", "Pigeon", "Swan", "Toucan", "Sparrow", "Vulture", "Eagle", "Hornbill", "Pheasant"};
    int[] numberimage = {
            R.drawable.peacock,
            R.drawable.parr,
            R.drawable.duck,
            R.drawable.hen,
            R.drawable.owl,
            R.drawable.pigeon,
            R.drawable.swan,
            R.drawable.toucan,
            R.drawable.sparrow,
            R.drawable.vulture,
            R.drawable.eag,
            R.drawable.horn,
            R.drawable.phea};
    private TextToSpeech t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds2);
        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });
        backbuttion = findViewById(R.id.back_button);
        backbuttion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        grill = findViewById(R.id.gridview8);
        mainAdapter adapter = new mainAdapter(birds2.this, numberword, numberimage);
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