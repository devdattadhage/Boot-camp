package com.tw.step.model;

public class Square implements ClosedShape{
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return this.side * this.side;
    }

    @Override
    public int perimeter() {
        return 4 * this.side;
    }
}
