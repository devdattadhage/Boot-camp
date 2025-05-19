package com.tw.step.probability;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void createProbability() throws Exception {
        Probability probability = Probability.createProbability(0.5);
        assertInstanceOf(Probability.class, probability);
    }

    @Test
    void invalidProbability() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> Probability.createProbability(2));
        assertEquals("Invalid Probability", exception.getMessage());
    }

    @Test
    void compliment() throws Exception {
        Probability probability = Probability.createProbability(0.5);
        assertInstanceOf(Probability.class, probability.compliment());
    }

    @Test
    void addTwoProbability() throws Exception {
        Probability p1 = Probability.createProbability(0.5);
        Probability p2 = Probability.createProbability(0.5);
        Probability p3 = p1.add(p2);

        assertTrue(p3.equals(Probability.createProbability(0.25)));
    }
}