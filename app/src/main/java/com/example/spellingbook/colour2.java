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

public class colour2 extends AppCompatActivity {
    GridView grill;
    String[] numberword = {"Red", "Green", "Blue", "Yellow", "Purple", "Brown", "Orange", "Pink", "Grey", "White", "Gold",
            "Silver"};
    int[] numberimage = {
            R.color.red,
            R.color.green,
            R.color.blue,
            R.color.yellow,
            R.color.purple,
            R.color.brown,
            R.color.orange,
            R.color.pink,
            R.color.gray,
            R.color.white,
            R.color.gold,
            R.color.silver};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour2);

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });

        grill = findViewById(R.id.gridview11);
        mainAdapter adapter = new mainAdapter(colour2.this, numberword, numberimage);
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