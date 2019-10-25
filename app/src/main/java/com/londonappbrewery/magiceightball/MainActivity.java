package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ballDisplay = (ImageView) findViewById(R.id.id_imgEightBall);

        final int[] ballArray = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };
        Button myButton = (Button)findViewById(R.id.id_btnAsk);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNG = new Random();
                int number = randomNG.nextInt(5);
                int imageRrsoureceId = ballArray[number];
                ballDisplay.setImageResource(imageRrsoureceId);
            }
        });

    }
}
