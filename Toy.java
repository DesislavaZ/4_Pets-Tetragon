package com.company;

public class Toy {

    String name;
    String color;
    double funRate;

    public Toy(){
        this.name="Piano";
        this.color="brown";
        funRate=5;
    }
    public void play(int minutes){
        System.out.println("The child play with the toy "+minutes+" minutes");
    }
}
