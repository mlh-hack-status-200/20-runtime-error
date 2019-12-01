package com.example.saveanimals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class doc2 extends AppCompatActivity {


    private LinearLayout linearLayout2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc2);


        linearLayout2=(LinearLayout)findViewById(R.id.type11);


        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(doc2.this,doctor2.class);
                startActivity(intent);
            }
        });

    }
}
