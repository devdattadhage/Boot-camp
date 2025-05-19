package com.tw.step.model;

public class Rectangle implements ClosedShape {
    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return this.length * this.breadth;
    }

    public int perimeter() {
        return 2 * (this.length + this.breadth);
    }
}
