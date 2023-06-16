package com.example.guia_re2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class boss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss);


        ImageButton ibtncasa = (ImageButton) findViewById(R.id.ibtncasa);

        ibtncasa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(boss.this, Home.class);
                startActivity(it);
                finish();
            }
        });

        ImageButton ibtnvoltar = (ImageButton) findViewById(R.id.ibtnvoltar);

        ibtnvoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(boss.this, personagens.class);
                startActivity(it);
                finish();
            }
        });

    }
}