package com.example.saveanimals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signUp extends AppCompatActivity {

    private EditText name;
    private EditText qua;
    private EditText gender;
    private EditText spe;
    private EditText loc;
    private EditText pass;
    private EditText cpass;
    private TextView login;
    private Button button;
    private DatabaseReference databaseReference;
    private MemberDetail memberDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name=(EditText)findViewById(R.id.name);
        qua=(EditText)findViewById(R.id.edu);
        loc=(EditText)findViewById(R.id.loc);
        spe=(EditText)findViewById(R.id.spe);
        gender=(EditText)findViewById(R.id.gender);
        pass=(EditText)findViewById(R.id.pass);
        cpass=(EditText)findViewById(R.id.cpass);
        login=(TextView) findViewById(R.id.login);
        button=(Button)findViewById(R.id.bu);

        memberDetail=new MemberDetail();
        databaseReference= FirebaseDatabase.getInstance().getReference().child("DoctorDetail");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pass.getText().toString().contentEquals(cpass.getText().toString())) {

                    memberDetail.setQualification(qua.getText().toString().trim());
                    memberDetail.setLoc(loc.getText().toString().trim());
                    memberDetail.setSpe(spe.getText().toString().trim());
                    memberDetail.setName(name.getText().toString().trim());
                    memberDetail.setPass(pass.getText().toString().trim());
                    memberDetail.setGender(gender.getText().toString().trim());

                    databaseReference.child(name.getText().toString().trim()).setValue(memberDetail);

                    Toast.makeText(signUp.this, "Registered Successfully", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(signUp.this, Login.class);
                    startActivity(intent);

                }
                else
                    Toast.makeText(signUp.this, "Confirm Password is not matching", Toast.LENGTH_LONG).show();
            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(signUp.this,Login.class);
                startActivity(intent);
            }
        });

    }
}
