package com.tw.step.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void checkEqualityBetweenGallonAndLitre() throws InvalidMeasurement {
        Volume gallon = Volume.createFromGallon(1);
        Volume litre = Volume.createLitre(3.78);

        assertEquals(gallon, litre);
    }
}