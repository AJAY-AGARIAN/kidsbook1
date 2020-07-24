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

public class veg2 extends AppCompatActivity {
    GridView grill;
    String[] numberword = {"Tomato", "Onion", "Potato", "Chilli", "Lemon", "Carrot", "Cucumber", "Mushroom", "Corn", "Ginger", "Beans", "Cabbage", "Cauliflower", "Garlic"};
    int[] numberimage = {
            R.drawable.toma,
            R.drawable.onion,
            R.drawable.potato,
            R.drawable.chilli,
            R.drawable.lemon,
            R.drawable.carrot,
            R.drawable.cucu,
            R.drawable.mush,
            R.drawable.corn,
            R.drawable.ginger,
            R.drawable.beans,
            R.drawable.caba,
            R.drawable.caul,
            R.drawable.garlic};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg2);


        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });

        grill = findViewById(R.id.gridview3);
        mainAdapter adapter = new mainAdapter(veg2.this, numberword, numberimage);
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