package com.company;

public class Main2 {
    public static void main(String[] args) {

        Pet[] pets = new Pet[6];
        pets[0] = new Cat();
        pets[1] = new Cat("black");
        pets [2] = new Dog();
        pets [3] = new Dog("");
        pets [4] = new Iguana(30);
        pets [5] = new Iguana(10);
        for (int i = 0; i < 6; i++) {
            pets [i].makeSound();
            pets[i].play("toy for everyone");
            pets[i].eat();
            System.out.println("");
        }
    }
}
