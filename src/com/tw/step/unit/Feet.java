package com.tw.step.unit;

public class Feet {
    private final int feet;

    private Feet(int feet) {
        this.feet = feet;
    }

    public static Feet create(int feet) throws Exception {
        if (feet > 0) return new Feet(feet);

        throw new Exception("Invalid Feet value");
    }

    public short toBase() {
        return (short) (feet * 12 * 2.5);
    }
}
