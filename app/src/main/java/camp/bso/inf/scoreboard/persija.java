package camp.bso.inf.scoreboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class persija extends AppCompatActivity {
    Button link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persija);

        link=findViewById(R.id.link);

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW);
                String urllink="https://vennoagustianelektronika.wordpress.com/sejarah-persija-jakarta-beserta-prestasinya/";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });
    }
}
