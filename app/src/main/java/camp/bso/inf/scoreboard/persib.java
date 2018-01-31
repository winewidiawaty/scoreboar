package camp.bso.inf.scoreboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class persib extends AppCompatActivity {
    Button link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persib);

        link=findViewById(R.id.link);

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW);
                String urllink="http://www.pikiran-rakyat.com/persib/2016/03/30/365288/sejarah-singkat-persib-bandung-dari-masa-ke-masa";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });
    }


}
