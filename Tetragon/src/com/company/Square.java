package com.company;

public class Square extends Tetragon {
    public Square(){
        super(6,5,12,25);
    }

    public Square (double a){
        this.a = a;
    }
    @Override
    public double calculatePerimeter( ){
        double perimeterSquare = 4*a;
        return perimeterSquare;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                "}";
    }


}
