package com.tw.step.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void checkEqualityBetweenFeetAndInch() throws InvalidMeasurement {
        Length feet = Length.createFromFeet(1);
        Length inch = Length.createFromInch(12);

        assertEquals(feet, inch);
    }

    @Test
    void checkEqualityBetweenInchAndCentimeter() throws InvalidMeasurement {
        Length cm = Length.createCentimeter(5);
        Length inch = Length.createFromInch(2);

        assertEquals(cm, inch);
    }

    @Test
    void checkEqualityBetweenCentimeterAndMillimeter() throws InvalidMeasurement {
        Length cm = Length.createCentimeter(5);
        Length mm = Length.createFromMillimeter(50);

        assertEquals(cm, mm);
    }

    @Test
    void addTwoUnits() throws InvalidMeasurement {
        Length twoInch = Length.createFromInch(2);
        Length oneInch = Length.createFromInch(1);
        Length threeInch = Length.createFromInch(3);

        assertEquals(threeInch, twoInch.add(oneInch));
    }
    @Test
    void addTwoDifferentUnits() throws InvalidMeasurement {
        Length twoInch = Length.createFromInch(2);
        Length fiveCentimeter = Length.createCentimeter(5);
        Length fourInch = Length.createFromInch(4);

        assertEquals(fourInch, twoInch.add(fiveCentimeter));
    }
}
