package edu.matc.entjava;

/**
 * Created by paulawaite on 1/26/16.
 */
public class TemperatureUtility {

    public static String FREEZING_COMMENT = "Brrrrrrr!";
    public static String COOL_COMMENT = "It's a little chilly, grab a coat!!";
    public static String WARM_COMMENT = "It's perfect outside!";
    public static String HOT_COMMENT = "It's gettin' hot in here!";


    public double convertCelsiusToFahrenheit(double celsiusTemperature) {
        return (celsiusTemperature * 1.8000) + 32;
    }

    public double convertFahrenheitToCelsius(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) * 1.8000;
    }

    public String generateFahrenheitTemperatureComment(double fahrenheitTemperature) {
        if (fahrenheitTemperature <= 32) {
            return FREEZING_COMMENT;
        } else if (fahrenheitTemperature < 55) {
            return COOL_COMMENT;
        } else if (fahrenheitTemperature < 75) {
            return WARM_COMMENT;
        } else {
            return HOT_COMMENT;
        }
    }

    public String generateCelsiusTemperatureComment(double celsiusTemperature) {
        return generateFahrenheitTemperatureComment(convertCelsiusToFahrenheit(celsiusTemperature));
    }

}
