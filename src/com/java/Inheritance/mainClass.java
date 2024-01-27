package com.java.Inheritance;

import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {
////        Animal animal = new Animal();
//        Cat cat = new Cat();
////        animal.makeSound();
//        cat.makeSound();
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the shape: ");
        String Shape=scanner.nextLine();
        System.out.print("enter the side: ");
        int side=scanner.nextInt();
        Shape shape=new Square(Shape, side) ;
        System.out.println(shape.getShape().toUpperCase());
        shape.area();

    }
}
