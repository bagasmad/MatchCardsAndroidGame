package com.example.matchcardsandroidgame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Randomize randomize = new Randomize(this);
    public static ImageView imageViewUniversal;
    public static ImageView imageViewPrevious;
    public static List listIdImageView = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Collections.addAll(listIdImageView,R.id.C00,R.id.C01,R.id.C02,R.id.C03,R.id.C10,R.id.C11,
                R.id.C12,R.id.C13,R.id.C20,R.id.C21,R.id.C22,R.id.C23,R.id.C30,R.id.C31,R.id.C32,
                R.id.C33);
        randomize.shuffleCard();
    }


    public void selectCard(View view)
    {
        imageViewUniversal = findViewById(view.getId());
        imageViewUniversal.animate().alpha(1f).setDuration(500);
        if (imageViewPrevious!=null)
        {
            if(imageViewPrevious==imageViewUniversal && imageViewUniversal.getAlpha()!=0)
            {imageViewPrevious.animate().alpha(0).setDuration(500);}
            else if(imageViewPrevious!=imageViewUniversal )
            {imageViewPrevious.animate().alpha(0).setDuration(500);}
        }
        imageViewPrevious = imageViewUniversal;

    }




}
