package edu.matc.entjava;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paulawaite on 1/26/16.
 */
public class TemperatureUtilityTest {

    @Test
    public void testConvertCelsiusToFahrenheit() throws Exception {
        TemperatureUtility tempUtility = new TemperatureUtility();
        double result = tempUtility.convertCelsiusToFahrenheit(0);
        // assertEquals compares expected double to actual double within a delta - 0 in this case
        assertEquals(32.0, result, 0);
    }

    @Test
    public void testConvertFahrenheitToCelsius() throws Exception {

    }

    @Test
    public void testGenerateFahrenheitTemperatureComment() throws Exception {

    }

    @Test
    public void testGenerateCelsiusTemperatureComment() throws Exception {

    }
}