package com.tw.step.probability;

import java.util.Objects;

public class Probability {
    private final double chance;

    public static Probability createProbability(double chance) throws Exception {
        if (chance > 0 && chance < 1) return new Probability(chance);

        throw new Exception("Invalid Probability");
    }

    private Probability(double chance) {
        this.chance = chance;
    }

    public Probability compliment() {
        double complimentaryChance = 1 - this.chance;
        return new Probability(complimentaryChance);
    }

    public Probability add(Probability p2) {
        return new Probability(this.chance * p2.chance);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(chance, that.chance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }

    public Probability atLeastOne(Probability p2) {
        return new Probability(this.chance + p2.chance - (this.chance * p2.chance));
    }
}
