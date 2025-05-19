package com.tw.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    @Test
    void testAddTwoNum() {
        Sum sum = new Sum(2,4);
        assertEquals(6, sum.addTwoNum());
    }
}