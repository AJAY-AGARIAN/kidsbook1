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

public class transport2 extends AppCompatActivity {
    GridView grill;
    Button btntran;
    String[] numberword = {"Airplane", "Car", "Bike", "Cycle", "Train", "Bus", "Ship", "Van", "Jeep", "Boat", "Truck"};
    int[] numberimage = {
            R.drawable.aero,
            R.drawable.vechicle,
            R.drawable.bike,
            R.drawable.cycle,
            R.drawable.train,
            R.drawable.bus,
            R.drawable.ship,
            R.drawable.van,
            R.drawable.jeep,
            R.drawable.boat,
            R.drawable.truck};
    private TextToSpeech t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport2);


        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });

        btntran = findViewById(R.id.back_button_tran);
        btntran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        grill = findViewById(R.id.gridview14);
        mainAdapter adapter = new mainAdapter(transport2.this, numberword, numberimage);
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