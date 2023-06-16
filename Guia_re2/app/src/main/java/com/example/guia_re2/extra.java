package com.example.guia_re2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class extra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);


        ImageButton ibtncasa = (ImageButton) findViewById(R.id.ibtncasa);

        ibtncasa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(extra.this, Home.class);
                startActivity(it);
                finish();
            }
        });

        ImageButton ibtnvoltar = (ImageButton) findViewById(R.id.ibtnvoltar);

        ibtnvoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(extra.this, boss.class);
                startActivity(it);
                finish();
            }
        });
    }
    public void suporte(View view) throws UnsupportedEncodingException {

        String uriText =
                "mailto:brlimacaitano@gmail.com" +
                        "?subject=" + URLEncoder.encode("Deixe sua sugestão!", "utf-8") +

                        "&body=" + URLEncoder.encode("Ajude-nos a melhorar sua experiência", "utf-8");
        Uri uri = Uri.parse(uriText);
        Intent suporte = new Intent(Intent.ACTION_SENDTO);
        suporte.setData(uri);
        startActivity(suporte);
    }
    public void verMapa(View view)
    {
        Uri location = Uri.parse("geo:34.6875237,135.4413252,12z");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }
    public void trailer (View view) {
        Uri uri = Uri.parse("https://youtu.be/u3wS-Q2KBpk");
        Intent Trailer = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/u3wS-Q2KBpk"));
        startActivity(Trailer);
    }
    public void Pesquisa (View view){
        Intent pesquisa = new Intent(Intent.ACTION_WEB_SEARCH);
        String query = "Resident Evil 2";
        pesquisa.putExtra(SearchManager.QUERY, query);
        startActivity(pesquisa);
    }
}
