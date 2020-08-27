package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
int count = 0;
int player1 = 0;
int player2 = 0;
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
                count++;
                Log.d("Dice","The button has been pressed!");

                Random RandomNumberGenerator = new Random();

                int number = RandomNumberGenerator.nextInt(6);
                int number2 = RandomNumberGenerator.nextInt(6);





                TextView left_player = (TextView) findViewById(R.id.left_player);
                TextView right_player = (TextView) findViewById(R.id.right_player);




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


                    if(number>number2) {
                        player1++;
                    }
                    left_player.setText("Left Player " + String.valueOf(player1));
                    if(number2>number)
                {
                    player2++;

                }
                right_player.setText("Right Player " + String.valueOf(player2));


                    Log.d("num", "score is " + player1);


                    Log.d("num", "score2 is " + player2);
                }














        });
    }


}