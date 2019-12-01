package com.example.saveanimals.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.saveanimals.MainActivity;
import com.example.saveanimals.MemberDetail;
import com.example.saveanimals.R;
import com.example.saveanimals.appointmentDetail;
import com.example.saveanimals.doc;
import com.example.saveanimals.doc1;
import com.example.saveanimals.doc2;
import com.example.saveanimals.doc3;
import com.example.saveanimals.doc4;
import com.example.saveanimals.signUp;
import com.example.saveanimals.ui.slideshow.SlideshowFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class GalleryFragment extends Fragment {

   private LinearLayout linearLayout;
    private LinearLayout linearLayout2;
    private LinearLayout linearLayout3;
    private LinearLayout linearLayout4;
    private LinearLayout linearLayout5;
    private LinearLayout linearLayout6;
    private LinearLayout linearLayout10;
    private LinearLayout linearLayout11;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

       linearLayout=root.findViewById(R.id.type);
        linearLayout2=root.findViewById(R.id.type1);
        linearLayout3=root.findViewById(R.id.type2);
        linearLayout4=root.findViewById(R.id.type3);
        linearLayout5=root.findViewById(R.id.type4);
        linearLayout6=root.findViewById(R.id.type5);
        linearLayout10=root.findViewById(R.id.type10);
        linearLayout11=root.findViewById(R.id.type11);

       linearLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(getActivity(), doc.class);
               startActivity(intent);
           }
       });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), doc1.class);
                startActivity(intent);
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), doc2.class);
                startActivity(intent);
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), doc1.class);
                startActivity(intent);
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), doc2.class);
                startActivity(intent);
            }
        });
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), doc3.class);
                startActivity(intent);
            }
        });

        linearLayout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), doc3.class);
                startActivity(intent);
            }
        });
        linearLayout11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), doc4.class);
                startActivity(intent);
            }
        });


        return root;
    }
}