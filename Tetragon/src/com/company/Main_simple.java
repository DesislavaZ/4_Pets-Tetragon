package com.company;

public class Main_simple {

    public static void main(String[] args) {
        Tetragon tetra1 = new Tetragon();
        Tetragon tetra2 = new Tetragon(18, 25, 16, 24);
        System.out.println(tetra1.toString());
        System.out.println(tetra1.calculatePerimeter());
        System.out.println(tetra2.toString());
        System.out.println(tetra2.calculatePerimeter());
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(23, 7);
        System.out.println(rect1.toString());
        System.out.println(rect1.calculatePerimeter());
        System.out.println(rect2.toString());
        System.out.println(rect2.calculatePerimeter());

    }
}
