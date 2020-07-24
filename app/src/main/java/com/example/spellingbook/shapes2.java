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

public class shapes2 extends AppCompatActivity {
    GridView grill;
    String[] numberword = {"Circle", "Square", "Triangle", "Rectangle", "Hexagon", "Pentagon", "Octagon", "Cone", "Cube", "Cylinder", "Pyramid", "Sphere", "Star"};
    int[] numberimage = {
            R.drawable.circle,
            R.drawable.square,
            R.drawable.triangle,
            R.drawable.rectangle,
            R.drawable.hexagon,
            R.drawable.pentagon,
            R.drawable.octagon,
            R.drawable.cone,
            R.drawable.cube,
            R.drawable.cylinder,
            R.drawable.pyramid,
            R.drawable.sphere,
            R.drawable.star};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes2);

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });

        grill = findViewById(R.id.gridview12);
        mainAdapter adapter = new mainAdapter(shapes2.this, numberword, numberimage);
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






