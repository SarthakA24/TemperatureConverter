package com.niit.jap;

public class TemperatureConverter {
    /**
     * This method takes temperature input in celsius and converts it in fahrenheit.
     *
     * @param temperatureInCelsius the temperature in celsius.
     * @return the converted temperature in fahrenheit.
     */
    public double convertCelsiusToFahrenheit(double temperatureInCelsius) {
        return temperatureInCelsius * 1.8 + 32;
    }

    /**
     * This method takes temperature input in fahrenheit and converts it in celsius.
     *
     * @param temperatureInFahrenheit the temperature in fahrenheit.
     * @return the converted temperature in celsius.
     */
    public double convertFahrenheitToCelsius(double temperatureInFahrenheit) {
        return (temperatureInFahrenheit-32) / 1.8;
    }
}
