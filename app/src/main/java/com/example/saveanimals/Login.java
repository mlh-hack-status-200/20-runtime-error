package com.example.saveanimals;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.saveanimals.ui.gallery.GalleryFragment;
import com.example.saveanimals.ui.slideshow.SlideshowFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {

    private EditText name;
    private EditText pass;
    private Button loginpage;
    private TextView login;
    private TextView logi;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name=(EditText)findViewById(R.id.name);
        pass=(EditText)findViewById(R.id.pass);
        login=(TextView)findViewById(R.id.login);
        loginpage=(Button)findViewById(R.id.loginpage);
        logi=(TextView)findViewById(R.id.logi);

        loginpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


        databaseReference= FirebaseDatabase.getInstance().getReference().child("DoctorDetail");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                String pass1=dataSnapshot.child(name.getText().toString()).child("pass").getValue().toString();
                if(pass1.contentEquals(pass.getText().toString()))
                {

//                    String name1=name.getText().toString();
//                    String age1=dataSnapshot.child(name.getText().toString()).child("age").getValue().toString();
//                    String gender1=dataSnapshot.child(name.getText().toString()).child("gender").getValue().toString();
                   Intent intent=new Intent(Login.this,doctorlogin.class);
//                    intent.putExtra("Name",name1);
//                    intent.putExtra("Age",age1);
//                    intent.putExtra("Gender",gender1);
                    startActivity(intent);
                }
                else
                    Toast.makeText(Login.this," Wrong Password ",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this, signUp.class);
                startActivity(intent);


            }
        });

        logi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }

}
