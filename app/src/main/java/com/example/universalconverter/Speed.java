package com.example.universalconverter;

import java.util.ArrayList;

public class Speed {
    public ArrayList<String> getSpeedUnits() {
        return speed;
    }

    ArrayList<String> speed;
    double ms2kmh;
    double ms2mph;
    double ms2fts;

    double kmh2mph;
    double kmh2fts;

    double mph2fts;

    public Speed() {
        this.speed = new ArrayList<>();

        this.speed.add("m/s");
        this.speed.add("km/h");
        this.speed.add("mph");
        this.speed.add("ft/s");

        this.ms2kmh=3.6;
        this.ms2mph=2.237136;
        this.ms2fts=3.28084;

        this.kmh2mph=0.621427;
        this.kmh2fts=0.911344;

        this.mph2fts=1.466535;

    }

    public double convertMetresPerSecond(double val, String toUnit){

        switch (toUnit){
            case "m/s":
                return val;
            case "km/h":
                return val*this.ms2kmh;
            case "mph":
                return val*this.ms2mph;
            case "ft/s":
                return val*this.ms2fts;
        }
        return -1;
    }
     public double convertKiloMetresPerHour(double val, String toUnit){

        switch (toUnit){
            case "m/s":
                return val/ms2kmh;
            case "km/h":
                return val;
            case "mph":
                return val*this.kmh2mph;
            case "ft/s":
                return val*this.kmh2fts;
        }
        return -1;
    }
     public double convertMilesPerHour(double val, String toUnit){

        switch (toUnit){
            case "m/s":
                return val/ms2mph;
            case "km/h":
                return val/kmh2mph;
            case "mph":
                return val;
            case "ft/s":
                return val*this.mph2fts;
        }
        return -1;
    }
     public double convertFeetPerSecond(double val, String toUnit){
        switch (toUnit){
            case "m/s":
                return val/ms2mph;
            case "km/h":
                return val/kmh2mph;
            case "mph":
                return val/mph2fts;
            case "ft/s":
                return val;
        }
        return -1;
    }




}
