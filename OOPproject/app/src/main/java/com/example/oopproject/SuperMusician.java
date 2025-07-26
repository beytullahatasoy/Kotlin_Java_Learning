package com.example.oopproject;

public class SuperMusician extends Musician {   //kalıtım aldığın yerde constructor olduğu için burda da olmazsa hata verir
    public SuperMusician(String name, String instrument, int age) {
        super(name, instrument, age);

    }

    public String sing() {
        return "Nothing Else Mathers";
    }

}
