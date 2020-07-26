package com.example.spellingbook;


import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

import static com.example.spellingbook.eachAlphabet3.t1;

public class body2 extends AppCompatActivity {
    GridView grill;
    Button btnbody;
    ImageView image;
    TextView text;
    TextToSpeech textToSpeech;
    String[] numberword = {"Face", "Eye", "Nose", "Ear", "Lips", "Tongue", "Neck", "Hand", "Shoulder", "Arm", "Stomach", "Leg", "Knee", "Foot",
    };
    int[] numberimage = {
            R.drawable.face,
            R.drawable.eye,
            R.drawable.nose,
            R.drawable.ear,
            R.drawable.lips,
            R.drawable.mouth,
            R.drawable.neck,
            R.drawable.hand,
            R.drawable.sholder,
            R.drawable.arm,
            R.drawable.stomach,
            R.drawable.leg,
            R.drawable.knee,
            R.drawable.foot
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body2);
        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });
        btnbody = findViewById(R.id.back_button_body);
        btnbody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


////-----------------------------------------
//        text=findViewById(R.id.text_view6);
//        image=findViewById(R.id.image_view6);
//        textToSpeech= new TextToSpeech(getApplicationContext()
//                , new TextToSpeech.OnInitListener() {
//            @Override
//            public void onInit(int i) {
//                if (i==TextToSpeech.SUCCESS){
//                    int lang=textToSpeech.setLanguage(Locale.ENGLISH);
//                }
//            }
//        });
//        image.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s = text.getText().toString();
//                int speech = textToSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null);
//
//            }
//        });

//---------------------------------------------------------------------
        grill = findViewById(R.id.gridview8);
        mainAdapter adapter = new mainAdapter(body2.this, numberword, numberimage);
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