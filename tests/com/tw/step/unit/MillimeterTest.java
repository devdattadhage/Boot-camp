package com.tw.step.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MillimeterTest {
    @Test
    void checkEqualityBetweenCentimeterAndMillimeter() throws Exception {
        Millimeter mm = Millimeter.create(10);
        assertEquals(1, mm.toBase());
    }
}