package com.example.saveanimals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class doc3 extends AppCompatActivity {

    private LinearLayout linearLayout;
    private LinearLayout linearLayout2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc3);

        linearLayout=(LinearLayout)findViewById(R.id.type10);
        linearLayout2=(LinearLayout)findViewById(R.id.type11);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(doc3.this,doctor3.class);
                startActivity(intent);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(doc3.this,doctor4.class);
                startActivity(intent);
            }
        });
    }
}
