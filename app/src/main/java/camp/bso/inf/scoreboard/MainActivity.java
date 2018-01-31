package camp.bso.inf.scoreboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnpersib;
    Button btnpersija;
    Button minuspersib,pluspersib;
    Button minuspersija,pluspersija;
    TextView skorpersib,skorpersija;
    int skorValPersib,skorValPersija;
    Button reset;
    Button berita;
    Button maps;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        skorpersib=findViewById(R.id.s1);
        skorpersija=findViewById(R.id.s2);

        btnpersib=findViewById(R.id.btn_persib);
        btnpersija=findViewById(R.id.btn_persija);
        minuspersib=findViewById(R.id.pluspersib);
        pluspersib=findViewById(R.id.minuspersib);
        minuspersija=findViewById(R.id.pluspersija);
        pluspersija=findViewById(R.id.minuspersija);

        skorValPersib=0;
        skorValPersija=0;

        maps=findViewById(R.id.maps);
        reset=findViewById(R.id.reset);
        berita=findViewById(R.id.berita);

        btnpersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),persib.class);
                startActivity(i);
            }
        });

        btnpersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplicationContext(),persija.class);
                startActivity(j);
            }
        });

        pluspersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(skorValPersib>0) {
                    skorValPersib = skorValPersib - 1;
                    skorpersib.setText(String.valueOf(skorValPersib));
                }

            }
        });

        minuspersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                skorValPersib=skorValPersib+1;
                skorpersib.setText(String.valueOf(skorValPersib));


            }
        });

        pluspersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(skorValPersija>0) {
                    skorValPersija = skorValPersija - 1;
                    skorpersija.setText(String.valueOf(skorValPersija));
                }

            }
        });

        minuspersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorValPersija=skorValPersija+1;
                skorpersija.setText(String.valueOf(skorValPersija));


            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorValPersib=0;
                skorValPersija=0;
                skorpersib.setText(String.valueOf(skorValPersib));
                skorpersija.setText(String.valueOf(skorValPersija));
            }
        });

        berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW);
                String urllink="http://simamaung.com/category/berita-persib/";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });


        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri=Uri.parse("geo:-6.957489, 107.710924");
                Intent mapsIntent=new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                mapsIntent.setPackage("com.google.android.apps.maps");
                if(mapsIntent.resolveActivity(getPackageManager())!=null){
                    startActivity(mapsIntent);
                }
            }
        });




    }
}
