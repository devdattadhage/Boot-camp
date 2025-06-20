package com.tw.step.unit;

public enum Units {
    FEET(12), INCH(1), CM(0.4), MM(0.04);

    private final double multiplicand;

    Units(double Multiplicand) {
        multiplicand = Multiplicand;
    }

    public double toBase(double value) {
        return value * multiplicand;
    }
}
