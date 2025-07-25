package com.example.runnablehandler;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int number;
    Runnable runnable;
    Handler handler;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        number = 0;

    }

    public void start (View view) {

        handler = new Handler();

        runnable = new Runnable() {
            @Override               // burası kendi geldi
            public void run() {
                textView.setText("Time: " + number);    //runnable içinde çalıştırmak aslında o 1 saniye sleep yapmamamızı sağlıyor
                number++;
                textView.setText("Time: " + number);
                handler.postDelayed( runnable, 1000);
            }
        };

        handler.post(runnable);         //handler çalıştırdık
        button.setEnabled(false);       // buton pasif hale geldi


    }

    public void stop (View view) {
        button.setEnabled(true);        // buton aktif hale geldi

        handler.removeCallbacks(runnable);  //handler kapattık

        number = 0;
        textView.setText("Time: " + number);

    }
    
}