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


public class shapes2 extends AppCompatActivity {
    GridView grill;
    Button btnshapes;
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
    private TextToSpeech t1;

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

        btnshapes = findViewById(R.id.back_button_shapes);
        btnshapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        grill = findViewById(R.id.gridview12);
        mainAdapter adapter = new mainAdapter(shapes2.this, numberword, numberimage);
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






