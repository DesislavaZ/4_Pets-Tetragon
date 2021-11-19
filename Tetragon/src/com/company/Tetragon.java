package com.company;

public class Tetragon {
    double a;
    double b;
    double c;
    double d;

    public Tetragon (){
        a = 4;
        b = 7;
        c = 2;
        d= 8;
    }
    public Tetragon (double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }


    public double calculatePerimeter(){
        double perimeterTetragon = a+b+c+d;
        return perimeterTetragon;
    }

    @Override
    public String toString() {
        return "Tetragon{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
