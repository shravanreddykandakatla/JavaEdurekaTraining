package com.java.Inheritance;

public class Square extends Shape {
    int side;

    public Square(String shape,int side) {
        super(shape);
        this.side=side;
    }

    void area(){
        System.out.println("Area of sqaure: "+ side*side);

    }
}
