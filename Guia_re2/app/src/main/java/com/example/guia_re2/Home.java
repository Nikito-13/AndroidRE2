package com.example.guia_re2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnhistoria = (Button) findViewById(R.id.btnhistoria);

        btnhistoria.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Home.this, Historia.class);
                startActivity(it);
                finish();
            }
        });

        Button btnpersonagem = (Button) findViewById(R.id.btnpersonagem);

        btnpersonagem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Home.this, personagens.class);
                startActivity(it);
                finish();
            }
        });

        Button btnboss = (Button) findViewById(R.id.btnboss);

        btnboss.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Home.this, boss.class);
                startActivity(it);
                finish();
            }
        });

        Button btnextra = (Button) findViewById(R.id.btnextra);

        btnextra.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Home.this, extra.class);
                startActivity(it);
                finish();
            }
        });

    }
    public void jogos (View view) {
        Uri uri = Uri.parse("https://www.residentevildatabase.com/jogos/");
        Intent Jogos = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.residentevildatabase.com/jogos/"));
        startActivity(Jogos);
    }
}