package com.example.spellingbook;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class family2 extends AppCompatActivity {
    GridView grill;
    String[] numberword={"Father","Mother","Brother","Sister","Grand Mother","Grand Father","Uncle","Auntie","Cousin"};
    int[] numberimage={
            R.drawable.father,
            R.drawable.mom,
            R.drawable.bro,
            R.drawable.sis,
            R.drawable.grandma,
            R.drawable.grandfather,
            R.drawable.profile,
            R.drawable.person,
            R.drawable.cousin};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family2);

        grill=findViewById(R.id.gridview);
        mainAdapter adapter= new mainAdapter(family2.this,numberword,numberimage);
        grill.setAdapter(adapter);



        grill.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You Clicked"+numberword[+position],
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}