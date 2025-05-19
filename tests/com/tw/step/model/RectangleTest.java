package com.tw.step.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void area() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.area());
    }

    @Test
    void areaWithNoLength() {
        Rectangle rectangle = new Rectangle(0, 3);
        assertEquals(0, rectangle.area());
    }

    @Test
    void areaWithNoBreath() {
        Rectangle rectangle = new Rectangle(2, 0);
        assertEquals(0, rectangle.area());
    }
}