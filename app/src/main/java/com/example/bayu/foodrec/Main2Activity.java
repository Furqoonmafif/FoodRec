package com.example.bayu.foodrec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String Nama_saya="INGREDIENTS";
        Intent intent = getIntent();
        Nama_saya = intent.getStringExtra("Nama");
        TextView nama_view = (TextView) findViewById(R.id.Nama_saya);
        nama_view.setText(Nama_saya);


    }
}
