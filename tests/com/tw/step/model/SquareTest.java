package com.tw.step.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void area() {
        Square square = new Square(4);
        assertEquals(16, square.area());
    }

    @Test
    void calculateAreaWhenSideIsZero() {
        Square square = new Square(0);
        assertEquals(0, square.area());
    }

    @Test
    void perimeter() {
        Square square = new Square(4);
        assertEquals(16, square.perimeter());
    }

    @Test
    void calculatePerimeterWhenSideIsZero() {
        Square square = new Square(0);
        assertEquals(0, square.perimeter());
    }
}