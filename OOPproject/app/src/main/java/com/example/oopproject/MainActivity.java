package com.example.oopproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.sql.SQLOutput;

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

        //Encapsulation
        System.out.println(james.getName());
        james.setAge(60, "beyto");
        System.out.println(james.getAge());


        //Inheritance
        SuperMusician lars = new SuperMusician("Lars", "Drums", 55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());


        //Polymorphism

        //Static Polymorphism --- aynı objeyle aynı method ismiyle farklı sonuçlar elde edebiliyoruz

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,3,4));

        //Dinamic Polymorphism --- aynı method ve aynı isimle farklı işlemlerde kullanabildik
        Animal myAnimal = new Animal();
        myAnimal.sing();
        Dog myDog = new Dog();
        myDog.sing();
        myDog.test();

        
    }
}