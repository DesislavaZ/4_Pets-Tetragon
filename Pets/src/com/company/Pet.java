package com.company;

import java.util.Scanner;

public class Pet {
    String name;
    double weight;
    int age;
    double foodAssimilation;
    double amountOfFood;

    public Pet() {
        this.name = "Peti";
        this.weight = 12.5;
        this.age = 6;

    }

    public Pet(String name, int weight, int age, double foodAssimilation) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.foodAssimilation = foodAssimilation;
    }

    void eat() {
        System.out.println(name + " eat");
    }

    void makeSound() {
        System.out.println(name + " make sound");
    }

    void play(String nameToy) {
        System.out.println(name + " plays with " + nameToy);
    }
}
