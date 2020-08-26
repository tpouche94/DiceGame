package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll_button = (Button) findViewById(R.id.roll_button);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);

        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        roll_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dice","The button has been pressed!");

                Random RandomNumberGenerator = new Random();

                int number = RandomNumberGenerator.nextInt(6);
                int number2 = RandomNumberGenerator.nextInt(6);

                 final int diceArray[] =
                        {R.drawable.dice1,
                        R.drawable.dice2,
                        R.drawable.dice3,
                        R.drawable.dice4,
                        R.drawable.dice5,
                        R.drawable.dice6};

                Log.d("Dice","The random number is: " + number);
                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[number2]);




            }
        });
    }


}