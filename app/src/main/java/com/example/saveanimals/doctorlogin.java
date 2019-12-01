package com.example.saveanimals;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class doctorlogin extends AppCompatActivity {

     TextView name;
    TextView age;
    TextView ser;
     TextView gender;
     DatabaseReference databaseReference;
     TextView time;
    TextView mob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorlogin);


        name=(TextView)findViewById(R.id.name);
        age=(TextView)findViewById(R.id.age);
        ser=(TextView)findViewById(R.id.ser);
        gender=(TextView)findViewById(R.id.gender);
        time=(TextView)findViewById(R.id.time);
        mob=(TextView)findViewById(R.id.mob);

        databaseReference= FirebaseDatabase.getInstance().getReference().child("AppointmentMade");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                String name1=dataSnapshot.child("Aman").child("name").getValue().toString();
                String age1=dataSnapshot.child("Aman").child("age").getValue().toString();
                String gen1=dataSnapshot.child("Aman").child("gender").getValue().toString();
                String mobi1=dataSnapshot.child("Aman").child("mobile").getValue().toString();
                String ser1=dataSnapshot.child("Aman").child("service").getValue().toString();
                String time1=dataSnapshot.child("Aman").child("time").getValue().toString();

                name.setText(name1);
                age.setText(age1);
                ser.setText(ser1);
                time.setText(time1);
                mob.setText(mobi1);
                gender.setText(gen1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



    }
}
