package com.company;

import java.util.Scanner;

public class Cat extends Pet {
    String color;

    public Cat() {
        super("Tom", 9, 2, 0.5);
        super.amountOfFood = 200;
        color = "white";
    }
    public Cat(String color){
        super ();
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("After eating "+ this.amountOfFood+ " gr. of food  the cat "
                + name + ", "+ color + " color became " + (this.weight + amountOfFood*foodAssimilation/1000)+ " kg.");
    }

    @Override
    void makeSound() {
        System.out.println(name + " cat make sound : mqu, mqu");
    }

    public void play(int num, String nameToy) {
        System.out.println(name + " cat plays with " + num +" "+ nameToy);
    }
}
