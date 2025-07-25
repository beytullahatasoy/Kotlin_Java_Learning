package com.example.oopproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        user myUser = new user();
        myUser.name = "Beyto";
        myUser.job = "instructor";
                                            //bu biraz daha ilkel
        user newUser = new user();
        newUser.name = "Kirk";
        newUser.job = "Musician";
        */

        user myUser = new user("beyto", "student");

        System.out.println(myUser.name);
        System.out.println(myUser.job);


        Musician james = new Musician("James", "Guitar", 50);

        System.out.println(james.getName());
        james.setAge(60, "beyto");
        System.out.println(james.getAge());



    }
}