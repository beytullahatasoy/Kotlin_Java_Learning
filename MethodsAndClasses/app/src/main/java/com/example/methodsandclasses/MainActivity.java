package com.example.methodsandclasses;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {       // hoca meyhod dedi ama fonk gibi düşün

    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("onCreate called");

        testMethod();
        System.out.println(math(3, 5));
        System.out.println(newMethod("Beytullah"));

        username = "beyto";             // yukardaki tanımladığına gider
        String username = "atasoy";     // bunu burda tanımladık

        makeMusicians();
        makeSimpsons();
    }

            // Önemli
    public void makeMusicians() {

        // instance

        Musicians kaan = new Musicians("kaan", "Guitar", 50);
        System.out.println(kaan.instrument);

    }

    public void makeSimpsons() {

        Simpsons homer = new Simpsons("simpons", 50, "Nuclear");

        System.out.println(homer.getAge());
        homer.setAge(51);
        System.out.println(homer.getAge());

    }




    public void testMethod(){
        int x = 4 + 4;
        System.out.println("value of x: " + x);
    }

    public int math(int a, int b) {

        return a + b;
    }

    public String newMethod(String string) {
        return string + " new Method";
    }







    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("onResume called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("onStop called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("onPause called");
    }
}

