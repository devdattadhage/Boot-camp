package com.tw.step.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void create() throws Exception {
        Probability chancesOfGettingTail = Probability.create(0.5);
        assertInstanceOf(Probability.class, chancesOfGettingTail);
    }

    @Test
    void invalidProbability() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> Probability.create(2));
        assertEquals("Invalid Probability", exception.getMessage());
    }

    @Test
    void not() throws Exception {
        Probability chancesOfGettingTail = Probability.create(0.2);
        assertInstanceOf(Probability.class, chancesOfGettingTail.not());
        assertEquals(chancesOfGettingTail.not(), Probability.create(0.8));
    }

    @Test
    void andTwoProbability() throws Exception {
        Probability p1 = Probability.create(0.5);
        Probability p2 = Probability.create(0.5);
        Probability p3 = p1.and(p2);

        assertEquals(p3, Probability.create(0.25));
    }

    @Test
    void orTail() throws Exception {
        Probability p1 = Probability.create(0.5);
        Probability p2 = Probability.create(0.5);
        Probability p3 = p1.or(p2);

        assertEquals(p3, Probability.create(0.75));
    }
}