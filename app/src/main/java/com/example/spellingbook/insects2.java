package com.example.spellingbook;


import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

import static com.example.spellingbook.eachAlphabet3.t1;

public class insects2 extends AppCompatActivity {
    GridView grill;
    String[] numberword = {"Ant", "Butterfly", "Dragonfly", "Honey Bee", "Spider", "Ladybird", "Mosquito", "Snail", "Cockroach", "Grasshopper", "Lizard",
            "Wasp"};
    int[] numberimage = {
            R.drawable.ant,
            R.drawable.butt,
            R.drawable.dragon,
            R.drawable.honey,
            R.drawable.spid,
            R.drawable.ladyb,
            R.drawable.mosq,
            R.drawable.snail,
            R.drawable.cock,
            R.drawable.grass,
            R.drawable.lizard,
            R.drawable.wasp
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insects2);

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });

        grill = findViewById(R.id.gridview9);
        mainAdapter adapter = new mainAdapter(insects2.this, numberword, numberimage);
        grill.setAdapter(adapter);

        grill.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                t1.speak(numberword[position], TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(getApplicationContext(), "You Clicked" + numberword[+position],
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}