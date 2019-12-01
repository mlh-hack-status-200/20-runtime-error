package com.example.saveanimals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Appointment extends AppCompatActivity {

    private EditText name;
    private EditText age;
    private EditText mobile;
    private EditText gender;
    private EditText time;
    private Button button;
    private EditText ss;
    private DatabaseReference databaseReference;
    private appointmentDetail AppointmentDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);

        gender = findViewById(R.id.Gender);
        age = findViewById(R.id.age);
        mobile = findViewById(R.id.mobile);
        name = findViewById(R.id.name);
        time = findViewById(R.id.time);
        button = findViewById(R.id.done);
          ss=findViewById(R.id.SS);

        AppointmentDetail = new appointmentDetail();
        databaseReference = FirebaseDatabase.getInstance().getReference().child("AppointmentMade");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

          //      int mob = Integer.parseInt(mobile.getText().toString().trim());
                int age1 = Integer.parseInt(age.getText().toString().trim());
                AppointmentDetail.setTime(time.getText().toString().trim());
                AppointmentDetail.setAge(age1);
                AppointmentDetail.setService(ss.getText().toString().trim());
                AppointmentDetail.setName(name.getText().toString().trim());
                AppointmentDetail.setMobile(mobile.getText().toString().trim());
                AppointmentDetail.setGender(gender.getText().toString().trim());

                databaseReference.child(name.getText().toString().trim()).setValue(AppointmentDetail);

if(name==null||age==null||time==null||mobile==null||gender==null||ss==null){
    Toast.makeText(Appointment.this,"Please Fill All the fiels ",Toast.LENGTH_LONG).show();
}



                boolean connected = false;
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    connected = true;
                }
                else
                    connected = false;

                if(connected==false)
                    Toast.makeText(Appointment.this,"No Internet Connection ",Toast.LENGTH_LONG).show();
                else {
                    Toast.makeText(Appointment.this,"Appointment Made Successfully ",Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(Appointment.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
