package com.company;

public class Dog extends Pet {
    String breed;

    public Dog() {
        super("Joni", 25, 7, 0.7);
        super.amountOfFood = 600;
        this.breed = "Mops";
    }
    public Dog(String breed) {
        super("Max", 30, 4, 0.7);
        super.amountOfFood = 700;
        this.breed = "husky";

    }

    @Override
    public void eat() {
        System.out.println("After eating " + this.amountOfFood + " gr. of food  the dog "
                + name + ", " + breed + " breed became " + (this.weight + amountOfFood * foodAssimilation / 1000) + " kg.");
    }

    @Override
    void makeSound() {
        System.out.println(name + " dog make sound : bau, bau");
    }
    public void play(int num, String toy, String day) {
        System.out.println(name + " dog play with " + num + " " +toy+ " only " + day);
    }
}
