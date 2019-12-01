package com.example.saveanimals.ui.home;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.saveanimals.Appointment;
import com.example.saveanimals.R;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class HomeFragment extends Fragment {

    TextView newthought;
    Button button;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        newthought=root.findViewById(R.id.thought);
        button=root.findViewById(R.id.makeanapp);

        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), Appointment.class);
                startActivity(intent);
            }
        });

        String dayOfMonthStr = String.valueOf(dayOfMonth);
        String t1="\"The total amount of suffering per year in the natural world is beyond all decent contemplation.\"";
        String tt1="\"~ Mahatma Gandhi\"";
        String t2="\"We can judge the heart of a man by his treatment of animals.\"";
        String tt2="\" ~ Immanuel Kant\"";
        String t3="\"Animals are such agreeable friends - they ask no questions; they pass no criticisms.\"";
        String tt3="\" ~ George Eliot\"";
        String t4="\"An animal's eyes have the power to speak a great language.\"";
        String tt4="\" ~ Martin Buber\"";
        String t5="\"Everyday, I have the choice to live a life of compassion that not only saves animals, but helps the environment.\"";
        String tt5="\" ~ Kat Von D\"";
        String t6="\"Love the animals: God has given them the rudiments of thought and joy untroubled.\"";
        String tt6="\" ~ Fyodor Dostoevsky\"";
        String t7="\"Life is life's greatest gift. Guard the life of another creature as you would your own because it is your own. On life's scale of values, the smallest is no less precious to the creature who owns it than the largest.\"";
        String tt7="\" ~ Lloyd Biggle, Jr.\"";
        String t8="\"Until one has loved an animal a part of one's soul remains unawakened.\"";
        String tt8="\" ~ Anatole France\"";
        String t9="\"Saving animals is as simple as choosing synthetic alternatives instead of real fur.\"";
        String tt9="\" ~ Natalie Imbruglia\"";
        String t10="\"Animals are my friends... and I don't eat my friends.\"";
        String tt10="\" ~ George Bernard Shaw\"";
        String t11="\"The more clearly we can focus our attention on the wonders and realities of the universe about us, the less taste we shall have for destruction.\"";
        String tt11="\" ~ Rachel Carson\"";
        String t12="\"Climb the mountain so you can see the world, not so the world can see you\"";
        String tt12="\" ~ George Bernard Shaw\"";
        String t13="\"A dog is the only thing on earth that loves you more than you love yourself.\"";
        String tt13="\" ~ Josh Billings\"";
        String t14="\"I have from an early age abjured the use of meat, and the time will come when men such as I will look upon the murder of animals as they now look upon the murder of men.\"";
        String tt14="\" ~ Leonardo da Vinci\"";
        String t15="\"Those who wish to pet and baby wild animals 'love' them. But those who respect their natures and wish to let them live normal lives, love them more.\"";
        String tt15="\" ~ Edwin Way Teale\"";
        String t16="\"Man is the only creature that consumes without producing. He does not give milk, he does not lay eggs, he is too weak to pull the plough, he cannot run fast enough to catch rabbits. Yet he is lord of all the animals.\"";
        String tt16="\" ~ George Orwell\"";
        String t17="\"You think dogs will not be in heaven? I tell you, they will be there long before any of us.\"";
        String tt17="\" ~ Robert Louis Stevenson\"";
        String t18="\"Dogs are not our whole life, but they make our lives whole.\"";
        String tt18="\" ~ Roger Caras\"";
        String t19="\"I care not much for a man's religion whose dog and cat are not the better for it.\"";
        String tt19="\" ~ Abraham Lincoln\"";
        String t20="\"It is horrifying that we have to fight our own government to save the environment.\"";
        String tt20="\" ~ Ansel Adams\"";
        String t21="\"The great pleasure of a dog is that you may make a fool of yourself with him and not only will he not scold you, but he will make a fool of himself too.\"";
        String tt21="\" ~ Samuel Butler\"";
        String t22="\"God loved the birds and invented trees. Man loved the birds and invented cages.\"";
        String tt22="\" ~ Jacques Deval\"";
        String t23="\"...he will be our friend for always and always and always.\"";
        String tt23="\" ~ Rudyard Kipling\"";
        String t24="\"The average dog is a nicer person than the average person.\"";
        String tt24="\" ~ Andy Rooney\"";
        String t25="\"Man is the only creature that consumes without producing\"";
        String tt25="\" ~ George Orwell\"";
        String t26="\"I have a history of saving animals. I started years ago with a cow.\"";
        String tt26="\" ~ Peter Max\"";
        String t27="\"The greatness of a nation can be judged by the way its animals are treated.\"";
        String tt27="\" ~ Mahatma Gandhi\"";
        String t28="\"An animal's eyes have the power to speak a great language.\"";
        String tt28="\" ~ Martin Buber\"";
        String t29="\"Animals are my friends... and I don't eat my friends.\"";
        String tt29="\" ~ George Bernard Shaw\"";
        String t30="\"The total amount of suffering per year in the natural world is beyond all decent contemplation.\"";
        String tt30="\" ~ Roger Caras\"";
        String t31="\"A dog is the only thing on earth that loves you more than you love yourself.\"";
        String tt31="\" ~ Josh Billings\"";

        if(dayOfMonthStr.contentEquals("1")){
            newthought.setText(t1);
          //  man.setText(tt1);
        }
        if(dayOfMonthStr.contentEquals("2")){
            newthought.setText(t2);
            //man.setText(tt2);
        }
        if(dayOfMonthStr.contentEquals("3")){
            newthought.setText(t3);
            //man.setText(tt3);
        }

        if(dayOfMonthStr.contentEquals("4")){
            newthought.setText(t4);
            //man.setText(tt4);
        }

        if(dayOfMonthStr.contentEquals("5")){
            newthought.setText(t5);
   //         man.setText(tt5);
        }

        if(dayOfMonthStr.contentEquals("6")){
            newthought.setText(t6);
     //       man.setText(tt6);
        }

        if(dayOfMonthStr.contentEquals("7")){
            newthought.setText(t7);
       //     man.setText(tt7);
        }
        if(dayOfMonthStr.contentEquals("8")){
            newthought.setText(t8);
         //   man.setText(tt8);
        }
        if(dayOfMonthStr.contentEquals("9")){
            newthought.setText(t9);
           /// man.setText(tt9);
        }

        if(dayOfMonthStr.contentEquals("10")){
            newthought.setText(t10);
//            man.setText(tt10);
        }

        if(dayOfMonthStr.contentEquals("11")){
            newthought.setText(t11);
  //          man.setText(tt11);
        }

        if(dayOfMonthStr.contentEquals("12")){
            newthought.setText(t12);
    //        man.setText(tt12);
        }

        if(dayOfMonthStr.contentEquals("13")){
            newthought.setText(t13);
      //      man.setText(tt13);
        }

        if(dayOfMonthStr.contentEquals("14")){
            newthought.setText(t14);
        //    man.setText(tt14);
        }

        if(dayOfMonthStr.contentEquals("15")){
            newthought.setText(t15);
          //  man.setText(tt15);
        }

        if(dayOfMonthStr.contentEquals("16")){
            newthought.setText(t16);
            //man.setText(tt16);
        }

        if(dayOfMonthStr.contentEquals("17")){
            newthought.setText(t17);
//            man.setText(tt17);
        }

        if(dayOfMonthStr.contentEquals("18")){
            newthought.setText(t18);
  //          man.setText(tt18);
        }

        if(dayOfMonthStr.contentEquals("19")){
            newthought.setText(t19);
    //        man.setText(tt19);
        }

        if(dayOfMonthStr.contentEquals("20")){
            newthought.setText(t20);
      //      man.setText(tt20);
        }

        if(dayOfMonthStr.contentEquals("21")){
            newthought.setText(t21);
        //    man.setText(tt21);
        }
        if(dayOfMonthStr.contentEquals("22")){
            newthought.setText(t22);
          //  man.setText(tt22);
        }

        if(dayOfMonthStr.contentEquals("23")){
            newthought.setText(t23);
            //man.setText(tt23);
        }

        if(dayOfMonthStr.contentEquals("24")){
            newthought.setText(t24);
//            man.setText(tt24);
        }

        if(dayOfMonthStr.contentEquals("25")){
            newthought.setText(t25);
  //          man.setText(tt25);
        }

        if(dayOfMonthStr.contentEquals("26")){
            newthought.setText(t26);
    //        man.setText(tt26);
        }

        if(dayOfMonthStr.contentEquals("27")){
            newthought.setText(t27);
      //      man.setText(tt27);
        }

        if(dayOfMonthStr.contentEquals("28")){
            newthought.setText(t28);
        //    man.setText(tt28);
        }

        if(dayOfMonthStr.contentEquals("29")){
            newthought.setText(t29);
          //  man.setText(tt29);
        }

        if(dayOfMonthStr.contentEquals("30")){
            newthought.setText(t30);
            //man.setText(tt30);
        }

        if(dayOfMonthStr.contentEquals("31")){
            newthought.setText(t31);
         //   man.setText(tt31);
        }

        return root;
    }
}