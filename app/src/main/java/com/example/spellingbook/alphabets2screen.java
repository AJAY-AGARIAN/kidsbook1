package com.example.spellingbook;


        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.speech.tts.TextToSpeech;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.GridView;
        import android.widget.Toast;

        import java.util.Locale;

        import static com.example.spellingbook.eachAlphabet3.t1;

public class alphabets2screen extends AppCompatActivity {
    GridView grill;
    public static String[] eachWord={"","","","","","","","","","","","","","","","","","","","",
            "","","","","",""};
    public static String[] eachWord2={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T",
            "U","V","W","X","Y","Z"};
   public static int[] wordImage={
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l,
            R.drawable.m,
            R.drawable.n,
            R.drawable.o,
            R.drawable.p,
            R.drawable.q,
            R.drawable.r,
            R.drawable.s,
            R.drawable.t,
            R.drawable.u,
            R.drawable.v,
            R.drawable.w,
            R.drawable.x,
            R.drawable.y,
            R.drawable.z};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets2screen);
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });
        grill=findViewById(R.id.gridview);
        mainAdapter adapter= new mainAdapter(alphabets2screen.this,eachWord,wordImage);
        grill.setAdapter(adapter);



        grill.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                t1.speak(eachWord2[position], TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(getApplicationContext(),"You Clicked"+eachWord[+position],
                        Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(alphabets2screen.this,eachAlphabet3.class);
                intent.putExtra("position",position+"");
                startActivity(intent);
            }
        });

    }
}