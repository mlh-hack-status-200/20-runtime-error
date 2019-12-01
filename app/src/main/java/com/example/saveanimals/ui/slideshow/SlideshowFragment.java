package com.example.saveanimals.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.saveanimals.Login;
import com.example.saveanimals.R;
import com.example.saveanimals.doctor1;
import com.example.saveanimals.doctor2;
import com.example.saveanimals.doctor3;
import com.example.saveanimals.doctor4;
import com.example.saveanimals.ui.AnimalFragment;
import com.example.saveanimals.ui.gallery.GalleryFragment;
import com.example.saveanimals.ui.share.ShareFragment;

public class SlideshowFragment extends Fragment {

  private LinearLayout type1;
    private LinearLayout type2;
    private LinearLayout type3;
    private LinearLayout type4;
    private LinearLayout type5;
    private LinearLayout type;
    private LinearLayout type6;
    private LinearLayout type7;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);

        type1=root.findViewById(R.id.type);
        type=root.findViewById(R.id.type1);
        type2=root.findViewById(R.id.type2);
        type3=root.findViewById(R.id.type3);
        type4=root.findViewById(R.id.type4);
        type5=root.findViewById(R.id.type5);
        type6=root.findViewById(R.id.type6);
        type7=root.findViewById(R.id.type7);


       type1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(getActivity(), doctor1.class);
               startActivity(intent);
           }
       });

        type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), doctor2.class);
                startActivity(intent);
            }
        });
        type2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), doctor3.class);
                startActivity(intent);
            }
        });
        type3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), doctor4.class);
                startActivity(intent);
            }
        });
        type4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), doctor4.class);
                startActivity(intent);
            }
        });
        type5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), doctor1.class);
                startActivity(intent);
            }
        });
        type6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), doctor4.class);
                startActivity(intent);
            }
        });
        type7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), doctor1.class);
                startActivity(intent);
            }
        });




        return root;
    }
}