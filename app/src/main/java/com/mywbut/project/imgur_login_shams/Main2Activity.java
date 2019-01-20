package com.mywbut.project.imgur_login_shams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button snUp,hvA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        snUp=(Button)findViewById(R.id.snUp);
        hvA=(Button)findViewById(R.id.hvA);
        snUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this,"SignUp Done",Toast.LENGTH_LONG).show();

            }
        });
        hvA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(i);

            }
        });
    }
}
