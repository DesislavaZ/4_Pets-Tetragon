package com.company;

public class Rectangle extends Tetragon{
    public Rectangle(){
        super();
    }

    public Rectangle (double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculatePerimeter( ){
        double perimeterRectangle = 2*a +2*b;
        return perimeterRectangle;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +"}";
    }

}
