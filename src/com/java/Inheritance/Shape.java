package com.java.Inheritance;

public abstract class Shape {
    private String shape;

    public Shape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    abstract void area();
}
