package com.tw.step.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {
    @Test
    void checkEqualityBetweenFeetAndInch() throws Exception {
        Feet feet = Feet.create(1);
        Inch inch = Inch.create(12);
        assertEquals(feet.toBase(), inch.toBase());
    }
}