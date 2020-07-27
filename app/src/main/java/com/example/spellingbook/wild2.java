package com.example.spellingbook;


import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

import static com.example.spellingbook.eachAlphabet3.t1;

public class wild2 extends AppCompatActivity {
    GridView grill;
    Button btnwild;
    String[] numberword = {"Lion", "Tiger", "Elephant", "Giraffe", "Monkey", "Deer", "Snake", "Panda", "Zebra", "Bear", "Rabbit", "Yak"};
    int[] numberimage = {
            R.drawable.lion,
            R.drawable.tiger,
            R.drawable.eleph,
            R.drawable.gira,
            R.drawable.monkey,
            R.drawable.de,
            R.drawable.snake,
            R.drawable.panda,
            R.drawable.ze,
            R.drawable.bear,
            R.drawable.rabbit,
            R.drawable.yark};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wild2);

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });

        btnwild = findViewById(R.id.button_wild);
        btnwild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        grill = findViewById(R.id.gridview6);

        mainAdapter adapter = new mainAdapter(wild2.this, numberword, numberimage);
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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Intent.ACTION_MAIN);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        finish();
    }
}