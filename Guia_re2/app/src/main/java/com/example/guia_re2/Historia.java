package com.example.guia_re2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Historia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);

        ImageButton ibtncasa = (ImageButton) findViewById(R.id.ibtncasa);

        ibtncasa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Historia.this, Home.class);
                startActivity(it);
                finish();
            }
        });

        ImageButton ibtnvoltar = (ImageButton) findViewById(R.id.ibtnvoltar);

        ibtnvoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Historia.this, Home.class);
                startActivity(it);
                finish();
            }
        });
    }
}