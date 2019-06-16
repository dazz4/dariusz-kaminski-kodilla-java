package com.kodilla.testing.shape;

public class Square implements Shape {
    int a;
    int b;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getField() {
        return a * b;
    }


}
