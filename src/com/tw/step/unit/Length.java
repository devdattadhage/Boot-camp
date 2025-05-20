package com.tw.step.unit;

import java.util.Objects;

public class Length {
    public static final int FEET_TO_CM = 30;
    public static final double INCH_TO_CM = 2.5;
    public static final int CM = 1;
    public static final double CM_TO_MM = 0.1;
    private final double value;

    private Length(double value) {
        this.value = value;
    }

    private static Length getLength(int value, double multiplicand) {
        return new Length(value * multiplicand);
    }

    public static Length createFromFeet(int value) throws InvalidMeasurement {
        if (value < 0) throw new InvalidMeasurement("Invalid Feet Value");

        return getLength(value, FEET_TO_CM);
    }

    public static Length createFromInch(int value) throws InvalidMeasurement {
        if (value < 0) throw new InvalidMeasurement("Invalid Inch Value");

        return getLength(value, INCH_TO_CM);
    }

    public static Length createCentimeter(int value) throws InvalidMeasurement {
        if (value < 0) throw new InvalidMeasurement("Invalid Centimeter Value");

        return getLength(value, CM);
    }

    public static Length createFromMillimeter(int value) throws InvalidMeasurement {
        if (value < 0) throw new InvalidMeasurement("Invalid Millimeter Value");

        return getLength(value, CM_TO_MM);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(value, length.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Length add(Length otherLength) throws InvalidMeasurement {
        return new Length(value + otherLength.value);
    }
}
