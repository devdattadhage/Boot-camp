package com.tw.step.unit;

public class Millimeter {
    private final int mm;

    private Millimeter(int mm) {
        this.mm = mm;
    }

    public static Millimeter create(int mm) throws Exception {
        if (mm > 0) return new Millimeter(mm);

        throw new Exception("Invalid Millimeter value");
    }

    public int toBase() {
        return (int) (mm * 0.1);
    }
}
