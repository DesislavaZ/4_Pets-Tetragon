package com.company;

public class Main_array {
    public static void main(String[] args) {
        Tetragon[] tetra = new Tetragon[6];
        tetra[0] = new Tetragon();
        tetra[1] = new Tetragon(2,6,4,10);
        tetra[2] = new Rectangle();
        tetra[3] = new Rectangle(41, 35);
        tetra[4] = new Square();
        tetra[5] = new Square(50);
        for (int i = 0; i < 6; i++) {
            System.out.println(tetra[i].toString());
            System.out.println(tetra[i].calculatePerimeter());
            System.out.println(" ");
        }
    }

}
