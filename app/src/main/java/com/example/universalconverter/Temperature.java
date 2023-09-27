package com.example.universalconverter;

import java.util.ArrayList;

public class Temperature {
    ArrayList<String> temperature;
    public ArrayList<String> getTemperatureUnits() {
        return temperature;
    }

    public Temperature() {
        this.temperature = new ArrayList<>();
        this.temperature.add("°C");
        this.temperature.add("°F");
        this.temperature.add("K");
    }

    public double convertCelsius(double val, String toUnit){
        switch (toUnit){
            case "°C":
                return val;
            case "°F":
                return ((val*9)/5)+32;
            case "K":
                return val+ 273.15;
        }
        return -1;
    }
    public double convertFahrenheit(double val, String toUnit){
        switch (toUnit){
            case "°C":
                return ((val-32)*5)/9;
            case "°F":
                return val;
            case "K":
                return (((val-32)*5)/9)+ 273.15;
        }
        return -1;
    }
    public double convertKelvin(double val, String toUnit){
        switch (toUnit){
            case "°C":
                return val-273.15;
            case "°F":
                return (((val-273.15)*9)/5)+32;
            case "K":
                return val;
        }
        return -1;
    }
}
