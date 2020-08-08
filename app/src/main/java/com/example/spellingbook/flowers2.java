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

import static com.example.spellingbook.eachAlphabet3.t1;

public class flowers2 extends AppCompatActivity {
    GridView grill;
    Button btnflower;
    String[] numberword = {"Lotus", "Rose", "Water Lily", "Sunflower", "Daffodil", "Daisy", "Iris", "Hibiscus", "Jasmine", "Calendula",
            "Orchid"};
    int[] numberimage = {
            R.drawable.lotus,
            R.drawable.rose,
            R.drawable.waterlily,
            R.drawable.sunf,
            R.drawable.daff,
            R.drawable.daisy,
            R.drawable.iris,
            R.drawable.hibi,
            R.drawable.jasmi,
            R.drawable.cale,
            R.drawable.orch,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers2);

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });
        btnflower = findViewById(R.id.back_button_flower);
        btnflower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        grill = findViewById(R.id.gridview);
        mainAdapter adapter = new mainAdapter(flowers2.this, numberword, numberimage);
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