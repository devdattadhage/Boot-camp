package com.tw.step.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {
    @Test
    void checkEqualityBetweenInchAndCentimeter() throws Exception {
        assertEquals(5, Inch.create(2).toBase());
    }
}