package com.example.attendancemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    EditText emailId,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final DatabaseHelper helper = new DatabaseHelper(this);
//        name = findViewById(R.id.name);
//        salary = findViewById(R.id.salary);

        btn1=findViewById(R.id.btnLogin);
        emailId=findViewById(R.id.edit1);
        password=findViewById(R.id.edit2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,DetailActivity.class);
                startActivity(i);

                String value=emailId.getText().toString();


                Intent intent =new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str=password.getText().toString().trim();
                //String str2=edit.getText().toString().trim();
                if(str.length()==0 || str==null){
                    password.setError("Enter Strong Password");
                }else{
                    Intent i=new Intent(MainActivity.this,DetailActivity.class);
                    startActivity(i);

                    String value=password.getText().toString();
                    value=password.getText().toString();

                    Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                    intent.putExtra("key", value);
                    startActivity(intent);
                }
            }
        });
    }
}