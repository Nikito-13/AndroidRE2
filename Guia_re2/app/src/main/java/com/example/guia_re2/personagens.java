package com.example.guia_re2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class personagens extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagens);


        ImageButton ibtncasa = (ImageButton) findViewById(R.id.ibtncasa);

        ibtncasa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(personagens.this, Home.class);
                startActivity(it);
                finish();
            }
        });

        ImageButton ibtnvoltar = (ImageButton) findViewById(R.id.ibtnvoltar);

        ibtnvoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(personagens.this, Historia.class);
                startActivity(it);
                finish();
            }
        });

    }
}