package com.example.spellingbook;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class about extends AppCompatActivity {
    String[] st_attr = new String[]{
            "<a href='https://www.freepik.com/free-photos-vectors/people'>People vector created by freepik - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/design'>Design vector created by user2104819 - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by cornecoba - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/food'>Food vector created by freepik - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/transport'>Transport vector created by stories - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/food'>Food vector created by user2104819 - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by user2104819 - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/hand'>Hand vector created by vectorpocket - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by Harryarts - www.freepik.com</a>",


            "<a href='https://www.freepik.com/free-photos-vectors/school'>School vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/children'>Children vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/nature'>Nature vector created by ddraw - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/people'>People vector created by valadzionak_volha - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/poster'>Poster vector created by macrovector - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/woman'>Woman vector created by pch.vector - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/people'>People vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/kids'>Kids vector created by nizovatina - www.freepik.com</a>",

            "<a href='https://www.freepik.com/free-photos-vectors/food'>Food vector created by brgfx - www.freepik.com</a>",

            "<a href='https://www.freepik.com/free-photos-vectors/color'>Color photo created by timolina - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by topntp26 - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by whatwolf - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/food'>Food vector created by macrovector_official - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/food'>Food photo created by Racool_studio - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/food'>Food photo created by jcomp - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by dashu83 - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/food'>Food vector created by macrovector_official - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by topntp26 - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by mrsiraphol - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/food'>Food photo created by Racool_studio - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by dashu83 - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/food'>Food photo created by bearfotos - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by macrovector - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by mrsiraphol - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by vectorpocket - www.freepik.com</a>",

            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by user2104819 - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/frame'>Frame vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by rawpixel.com - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/crown'>Crown vector created by freepik - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/design'>Design vector created by freepik - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by wirestock - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/frame'>Frame vector created by macrovector - www.freepik.com</a>",

            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by rawpixel.com - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by rawpixel.com - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by rawpixel.com - www.freepik.com</a>",

            "<a href='https://www.freepik.com/free-photos-vectors/flower'>Flower vector created by grmarc - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by rawpixel.com - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/nature'>Nature vector created by brgfx - www.freepik.com</a>",

            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/food'>Food photo created by Racool_studio - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by jannoon028 - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/food'>Food vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/banner'>Banner vector created by katemangostar - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by asier_relampagoestudio - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by Racool_studio - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by zirconicusso - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by freepik - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/food'>Food photo created by Racool_studio - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/table'>Table photo created by Racool_studio - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by mrsiraphol - www.freepik.com</a>",

            "<a href='https://www.freepik.com/free-photos-vectors/baby'>Baby vector created by user2104819 - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/design'>Design vector created by ddraw - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by user2104819 - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by user2104819 - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by user2104819 - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/banner'>Banner vector created by pch.vector - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/design'>Design vector created by freepik - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/vintage'>Vintage vector created by rawpixel.com - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/frame'>Frame vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/frame'>Frame vector created by brgfx - www.freepik.com</a>",

            "<a href='https://www.freepik.com/free-photos-vectors/flower'>Flower vector created by macrovector - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by macrovector_official - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/flower'>Flower vector created by macrovector - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/flower'>Flower vector created by macrovector - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by rawpixel.com - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/flowers'>Flowers photo created by timolina - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/flower'>Flower vector created by upklyak - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by macrovector_official - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/floral'>Floral photo created by freepik - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/flower'>Flower vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/flower'>Flower vector created by colorfuelstudio - www.freepik.com</a>",


            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by freepik - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/vintage'>Vintage vector created by dgim-studio - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/business'>Business vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/car'>Car vector created by upklyak - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/sea'>Sea vector created by stories - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/business'>Business photo created by kjpargeter - www.freepik.com</a>",

            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by freepik - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/dog'>Dog photo created by timolina - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/sport'>Sport vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/baby'>Baby vector created by freepik - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/frame'>Frame vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/kids'>Kids vector created by brgfx - www.freepik.com</a>",

            "<a href='https://www.freepik.com/free-photos-vectors/design'>Design vector created by macrovector - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/food'>Food vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/black'>Black vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/Animal'>Animal photo created by jigsawstocker - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/tree'>Tree vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/design'>Design vector created by macrovector - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/tree'>Tree vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/nature'>Nature vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by user2104819 - www.freepik.com</a>",

            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by macrovector - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by brgfx - www.freepik.com</a>",


            "<a href='https://www.freepik.com/free-photos-vectors/school'>School vector created by colorfuelstudio - www.freepik.com</a>",

            "<a href='https://www.freepik.com/free-photos-vectors/design'>Design vector created by freepik - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by macrovector - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/fish'>Fish vector created by freepik - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/food'>Food vector created by pikisuperstar - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/car'>Car vector created by studiogstock - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/nature'>Nature vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background photo created by topntp26 - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by freepik - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/business'>Business vector created by macrovector - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by vectorgraphit - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by brgfx - www.freepik.com</a>",
            "<a href='https://www.freepik.com/free-photos-vectors/background'>Background vector created by brgfx - www.freepik.com</a>",


            "Icons made by <a href='https://www.flaticon.com/authors/freepik' title='Freepik'>Freepik</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='https://www.flaticon.com/authors/freepik' title='Freepik'>Freepik</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='https://www.flaticon.com/authors/freepik' title='Freepik'>Freepik</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='https://www.flaticon.com/authors/freepik' title='Freepik'>Freepik</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='https://www.flaticon.com/authors/freepik' title='Freepik'>Freepik</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='https://www.flaticon.com/authors/srip' title='srip'>srip</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='http://www.freepik.com/' title='Freepik'>Freepik</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='https://www.flaticon.com/free-icon/pirate_3118016' title='smalllikeart'>smalllikeart</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='https://www.flaticon.com/authors/smashicons' title='Smashicons'>Smashicons</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='https://www.flaticon.com/authors/freepik' title='Freepik'>Freepik</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='https://www.flaticon.com/authors/pixel-perfect' title='Pixel perfect'>Pixel perfect</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='https://www.flaticon.com/authors/pixel-perfect' title='Pixel perfect'>Pixel perfect</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='https://www.flaticon.com/authors/freepik' title='Freepik'>Freepik</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='https://www.flaticon.com/authors/freepik' title='Freepik'>Freepik</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='https://www.flaticon.com/authors/freepik' title='Freepik'>Freepik</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",
            "Icons made by <a href='https://www.flaticon.com/authors/freepik' title='Freepik'>Freepik</a> from <a href='https://www.flaticon.com/' title='Flaticon'> www.flaticon.com</a>",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ListView listViewDemo = findViewById(R.id.listattr);

        final ArrayAdapter<String> adapterDemo = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, st_attr);
        listViewDemo.setAdapter(adapterDemo);

        listViewDemo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = adapterDemo.getItem(position);
                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
            }

        });

    }
}