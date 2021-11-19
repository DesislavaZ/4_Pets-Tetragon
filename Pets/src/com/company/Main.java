package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pet pet1 = new Pet();
        Pet pet2 = new Pet("Kali", 25, 5, 0);

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(" kangal");
        Iguana igu = new Iguana(30);


        pet1.eat();
        pet1.makeSound();
        pet1.play("Duck");
        System.out.println("");

        cat1.play(2, "fish");
        cat1.eat();
        cat1.makeSound();
        System.out.println("");

        dog1.play("Bone");
        dog1.eat();
        dog1.play(4, "Bones", "night");
        System.out.println("");
        dog2.play("tyre");
        dog2.eat();
        System.out.println("");

        igu.play();
        igu.eat();
        igu.makeSound();

    }
}
