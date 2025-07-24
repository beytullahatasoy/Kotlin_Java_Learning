package com.example.countdowntimer;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);


        // bu kısım implement method diyerek geliyor
        new CountDownTimer(10000, 1000) {    // gelecekte milisaniye, geri sayım aralığı
            @Override
            public void onFinish() {

                Toast.makeText(getApplicationContext(), "Done!", Toast.LENGTH_LONG).show();     // toast ekleyerek alta done! ekliyoruz
                textView.setText("Finished!");                  // ekrana bitince yazdırıyoruz

            }

            @Override
            public void onTick(long millisUntilFinished) {

                textView.setText("Left: " + millisUntilFinished / 1000);   // ilk kısımda left: 10,9,8.. diye geriye sayıyor
                                                                            // bölü 1000 yapıyoruz ki saniye cinsinden olsun
            }
        } .start();     // sonradan biz ekliyoruz


    }
}