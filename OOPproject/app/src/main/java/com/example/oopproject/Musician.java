package com.example.oopproject;

public class Musician {

    private String name;
    private String instrument;
    private int age;

    public Musician(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, String password) {  // yaygın değil ama gücünü görmek istedik
        if (password.matches("beyto")){
            this.age = age;
        }
    }

}
