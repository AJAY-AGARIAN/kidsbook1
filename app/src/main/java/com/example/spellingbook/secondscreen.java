package com.example.spellingbook;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class secondscreen extends AppCompatActivity {
    GridView grill;
    String[] numberword={"Alphabets","Numbers","Family","Body Parts","Fruits","Vegetables","Wild Animals","Domestic Animals","Birds","Insects",
            "Flowers","Colors","Maths Symbols","Shapes","Transport"};
    int[] numberimage={
            R.drawable.abc,
            R.drawable.numberr,
            R.drawable.family,
            R.drawable.body,
            R.drawable.fruits,
            R.drawable.veg,
            R.drawable.lion,
            R.drawable.cow,
            R.drawable.bird,
            R.drawable.insects,
            R.drawable.flower,
            R.drawable.color,
            R.drawable.mathss,
            R.drawable.shapes,
            R.drawable.vechicle};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondscreen);

        grill=findViewById(R.id.gridview);
        mainAdapter adapter= new mainAdapter(secondscreen.this,numberword,numberimage);
        grill.setAdapter(adapter);



        grill.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You Clicked"+numberword[+position],
                        Toast.LENGTH_SHORT).show();
                if (position==0){
                    startActivity(new Intent(secondscreen.this,alphabets2screen.class));
                }
                if (position==1){
                    startActivity(new Intent(secondscreen.this,number2.class));
                }
                if (position==2){
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

    }
}