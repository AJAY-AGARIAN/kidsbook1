package com.example.spellingbook;


import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Locale;



public class secondscreen extends AppCompatActivity {
    GridView grill;
    String[] numberword = {"Alphabets", "Numbers", "Family", "Body Parts", "Fruits", "Vegetables", "Wild Animals", "Domestic Animals", "Birds", "Insects",
            "Flowers", "Colors", "Maths Symbols", "Shapes", "Transport"};
    int[] numberimage = {
            R.drawable.abc,
            R.drawable.numb,
            R.drawable.family,
            R.drawable.body,
            R.drawable.fruits,
            R.drawable.veg,
            R.drawable.wild,
            R.drawable.cow,
            R.drawable.bird,
            R.drawable.insects,
            R.drawable.flower,
            R.drawable.colorr,
            R.drawable.mathss,
            R.drawable.shapes,
            R.drawable.vechicle};
    private TextToSpeech t1;

    Dialog popupDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.BLUE);
        }

        setContentView(R.layout.activity_secondscreen);

        //POPUP WINDOW
        popupDialog=new Dialog(this);
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });
        grill=findViewById(R.id.gridview);
        mainAdapter adapter= new mainAdapter(secondscreen.this,numberword,numberimage);
        grill.setAdapter(adapter);



        grill.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getApplicationContext(),"You Clicked"+numberword[+position],
//                        Toast.LENGTH_SHORT).show();


                t1.speak(numberword[position], TextToSpeech.QUEUE_FLUSH, null);
                if (position == 0) {
                    startActivity(new Intent(secondscreen.this, alphabets2screen.class));

                }
                if (position == 1) {
                    startActivity(new Intent(secondscreen.this, number2.class));
                }
                if (position == 2) {
                    startActivity(new Intent(secondscreen.this,family2.class));
                }
                if (position==3){
                    startActivity(new Intent(secondscreen.this,body2.class));
                }
                if (position==4){
                    startActivity(new Intent(secondscreen.this,fruits2.class));
                }
                if (position==5){
                    startActivity(new Intent(secondscreen.this,veg2.class));
                }
                if (position==6){
                    startActivity(new Intent(secondscreen.this,wild2.class));
                }
                if (position==7){
                    startActivity(new Intent(secondscreen.this,domestic2.class));
                }
                if (position==8){
                    startActivity(new Intent(secondscreen.this,birds2.class));
                }
                if (position==9){
                    startActivity(new Intent(secondscreen.this,insects2.class));
                }
                if (position==10){
                    startActivity(new Intent(secondscreen.this,flowers2.class));
                }
                if (position==11){
                    startActivity(new Intent(secondscreen.this,colour2.class));
                }
                if (position==12){
                    startActivity(new Intent(secondscreen.this,maths2.class));
                }
                if (position==13){
                    startActivity(new Intent(secondscreen.this,shapes2.class));
                }
                if (position==14){
                    startActivity(new Intent(secondscreen.this,transport2.class));
                }


            }
        });
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                showPopup();
            }

        });

    }
    //POPUP
    private void showPopup() {
        popupDialog.setContentView(R.layout.alert_box);

        ImageButton rate = popupDialog.findViewById(R.id.imageButton);
        ImageButton share = popupDialog.findViewById(R.id.imageButton2);
        ImageButton aboutUs = popupDialog.findViewById(R.id.imageButton4);

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(secondscreen.this, "Rate us.", Toast.LENGTH_SHORT).show();
            }
        });
        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(secondscreen.this, about.class));
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Hey! Download Kids Picture Book from Google play store.Visit https://play.google.com/store/apps/ to download app now.";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });
        popupDialog.show();
    }
}

