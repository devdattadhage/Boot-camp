package com.tw.step.unit;

import java.util.Objects;

public class Volume {
    public static final double GALLON_TO_LITRE = 3.78;
    public static final int LITRE = 1;
    private final double value;

    public Volume(double value) {
        this.value = value;
    }

    private static Volume getVolume(double value, double multiplicand) {
        return new Volume(value * multiplicand);
    }

    public static Volume createFromGallon(int value) throws InvalidMeasurement {
        if (value < 0) throw new InvalidMeasurement("Invalid Gallon Value");

        return getVolume(value, GALLON_TO_LITRE);
    }

    public static Volume createLitre(double value) throws InvalidMeasurement {
        if (value < 0) throw new InvalidMeasurement("Invalid Litre Value");

        return getVolume(value, LITRE);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(value, volume.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
