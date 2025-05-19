package com.tw.step.probability;

import java.util.Objects;

public class Probability {
    private static final double IMPOSSIBILITY = 0.0;
    private static final double CERTAINTY = 1.0;
    private final double probability;

    public static Probability create(double chance) throws Exception {
        if (chance > IMPOSSIBILITY && chance < CERTAINTY) return new Probability(chance);

        throw new Exception("Invalid Probability");
    }

    private Probability(double probability) {
        this.probability = probability;
    }

    public Probability not() {
        return new Probability(CERTAINTY - probability);
    }

    public Probability and(Probability otherProbability) {
        return new Probability(this.probability * otherProbability.probability);
    }


    public Probability or(Probability otherProbability) {
        return new Probability(this.probability + otherProbability.probability - (this.probability * otherProbability.probability));
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(probability, that.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }
}
