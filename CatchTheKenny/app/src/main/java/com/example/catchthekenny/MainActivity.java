package com.example.catchthekenny;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;

    ImageView[] imageArray;     //dizi tanımladık


    Handler handler;
    Runnable runnable;



    TextView textView;
    TextView textView3;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView3 = findViewById(R.id.textView3);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);

        // dizi tanımladık
        imageArray = new ImageView[] {imageView, imageView2, imageView3, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView8, imageView9};

        hideImages();

        score = 0;

        new CountDownTimer(10000, 1000) {
            @Override
            public void onFinish() {

                textView.setText("Time Off");
                handler.removeCallbacks(runnable);

                for (ImageView image : imageArray){     // görünmez yapma komudu
                    image.setVisibility(View.INVISIBLE);
                }

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                
                alert.setTitle("Restart Game");
                alert.setMessage("Are you sure to restart game?");
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        //Restart - bu çok kullanılmaz - tek yolu bu değil

                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);

                    }
                });

                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                        
                    }
                });

                alert.show();


            }

            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("Time: " + millisUntilFinished/1000);
            }
        }.start();
    }

    public void increaseScore(View view){

        score++;
        textView3.setText("Score: " + score);

    }

    public void hideImages() {

        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {

                for (ImageView image : imageArray){     //bu dizi içindeki her image'ı loop a sok diyoruz
                    image.setVisibility(View.INVISIBLE);    // görselleri görünmez yapar
                }

                Random random = new Random();
                int i = random.nextInt(9);
                imageArray[i].setVisibility(View.VISIBLE);

                handler.postDelayed(this, 500);

            }
        };


        handler.post(runnable);


    }

}