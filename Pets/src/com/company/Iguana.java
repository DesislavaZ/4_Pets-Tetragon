package com.company;

public class Iguana extends Pet{
    double length;
    public Iguana(double length){
        super ("Igi", 1, 2, 0.9);
        super.amountOfFood = 50;
        this.length = length;
    }

    @Override
    public void eat() {
        System.out.println("After eating " + this.amountOfFood + " gr. of food  the iguana "
                + name + " with length " + length + " sm. became " + (this.weight + amountOfFood * foodAssimilation / 1000) + " kg.");
    }
    @Override
    void makeSound() {
        System.out.println(name + " iguana with length " + length+ " makes not sound ");
    }
    public void play() {
        System.out.println(name + " iguana doesn't play with toys" );
    }
}
