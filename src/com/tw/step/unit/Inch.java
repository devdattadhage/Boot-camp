package com.tw.step.unit;

public class Inch {
    private final int inch;

    public Inch(int inch) {
        this.inch = inch;
    }

    public static Inch create(int inch) throws Exception {
        if (inch > 0) return new Inch(inch);

        throw new Exception("Invalid Inch value");
    }

    public short toBase() {
        return (short) (inch * 2.5);
    }
}
