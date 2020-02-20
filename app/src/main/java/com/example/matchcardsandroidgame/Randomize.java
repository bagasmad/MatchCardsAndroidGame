package com.example.matchcardsandroidgame;

import android.app.Activity;
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Randomize extends AppCompatActivity {
    public Activity activity;
    int levelNumber;
    List Cards= new ArrayList<>();
    public Randomize(Activity activ)
    {
        this.activity = activ;
    }
    public void shuffleCard()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(8);
        while (Cards.size()<16)
        {
            if (Collections.frequency(Cards,randomNumber)<2)
            {
                Cards.add(randomNumber);
                ImageView imageView = activity.findViewById(Integer.parseInt(MainActivity.listIdImageView.get(Cards.size()-1).toString()));
                if (randomNumber==0)
                    imageView.setImageResource(R.drawable.a);
                else if (randomNumber==1)
                {
                    imageView.setImageResource(R.drawable.b);
                }
                else if (randomNumber==2)
                {
                    imageView.setImageResource(R.drawable.c);
                }
                else if (randomNumber==3)
                {
                    imageView.setImageResource(R.drawable.d);
                }
                else if (randomNumber==4)
                {
                    imageView.setImageResource(R.drawable.e);
                }
                else if (randomNumber==5)
                {
                    imageView.setImageResource(R.drawable.f);
                }
                else if (randomNumber==6)
                {
                    imageView.setImageResource(R.drawable.g);
                }
                else if (randomNumber==7)
                {
                    imageView.setImageResource(R.drawable.h);
                }
                Log.i("kontol",  Integer.toString(randomNumber));
                shuffleCard();
            }
            else
            {
                shuffleCard();
            }
        }
    }

}
