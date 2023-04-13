package com.example.attendancemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //String value=getIntent().getExtras().getString("key");

        img=findViewById(R.id.imgattendance);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(DetailActivity.this,MarkActivity.class);
                startActivity(i);
            }
        });

        img=findViewById(R.id.imgleave);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(DetailActivity.this,ApplyActivity.class);
                startActivity(i);
            }
        });
    }
}