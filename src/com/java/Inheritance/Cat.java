package com.java.Inheritance;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("The cat quarrels.");
    }
}