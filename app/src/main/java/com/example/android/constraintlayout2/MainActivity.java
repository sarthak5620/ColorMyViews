package com.example.android.constraintlayout2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.android.constraintlayout2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding b;

    private int BackgroundColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
    }

    public void changeBgColorBlue(View view) {
        BackgroundColor = getResources().getColor(R.color.blue);
        b.BoxOne.setBackgroundColor(BackgroundColor);
    }
    //Change the background color of textView to black
    public void changeBgColorBlack(View view) {
        BackgroundColor = getResources().getColor(R.color.black);
        b.BoxTwo.setBackgroundColor(BackgroundColor);
    }
    //Change the background color of textView to green
    public void changeBgColorGreen(View view) {
        BackgroundColor = getResources().getColor(R.color.green);
        b.BoxThree.setBackgroundColor(BackgroundColor);
    }
    //Change the background color of textView to red
    public void changeBgColorRed(View view) {
        BackgroundColor = getResources().getColor(R.color.red);
        b.BoxFour.setBackgroundColor(BackgroundColor);
    }
    //Change the background color of textView to teal
    public void changeBgColorTeal(View view) {
        BackgroundColor = getResources().getColor(R.color.teal_700);
        b.BoxFive.setBackgroundColor(BackgroundColor);
    }
    //Change the background color of textView to green
    public void changeBgColorYellow(View view) {
        BackgroundColor = getResources().getColor(R.color.yellow);
        b.BoxFive.setBackgroundColor(BackgroundColor);
    }
    //Change the background color of textView to green
    public void changeBgColorLightBlue(View view) {
        BackgroundColor = getResources().getColor(R.color.lightBlue);
        b.BoxThree.setBackgroundColor(BackgroundColor);
    }
    //Change the background color of textView to green
    public void changeBgColorDarkGreen(View view) {
        BackgroundColor = getResources().getColor(R.color.darkGreen);
        b.BoxFour.setBackgroundColor(BackgroundColor);
    }
}