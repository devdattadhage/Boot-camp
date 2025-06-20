package com.tw.step.unit;

import java.util.Objects;

public class Length {
    private final double value;
    private final Units unit;

    private Length(double value, Units unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length createFromFeet(int value) throws InvalidMeasurement {
        if (value < 0) throw new InvalidMeasurement("Invalid Feet Value");

        return new Length(value, Units.FEET);
    }

    public static Length createFromInch(int value) throws InvalidMeasurement {
        if (value < 0) throw new InvalidMeasurement("Invalid Inch Value");

       return new Length(value, Units.INCH);
    }

    public static Length createCentimeter(int value) throws InvalidMeasurement {
        if (value < 0) throw new InvalidMeasurement("Invalid Centimeter Value");

       return new Length(value, Units.CM);
    }

    public static Length createFromMillimeter(int value) throws InvalidMeasurement {
        if (value < 0) throw new InvalidMeasurement("Invalid Millimeter Value");

       return new Length(value, Units.MM);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(unit.toBase(value), length.unit.toBase(length.value)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    public Length add(Length otherLength) throws InvalidMeasurement {
        return new Length(unit.toBase(value) + otherLength.unit.toBase(otherLength.value), Units.INCH);
    }
}
