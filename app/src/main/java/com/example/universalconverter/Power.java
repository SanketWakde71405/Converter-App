package com.example.universalconverter;

import java.util.ArrayList;

public class Power {
    ArrayList<String> power;
    double W2kW;
    double W2MW;
    double W2hp;

    double kW2MW;
    double kW2hp;

    double MW2hp;

    public ArrayList<String> getPowerUnits() {
        return power;
    }

    public Power() {
        this.power = new ArrayList<>();

        this.power.add("W");
        this.power.add("kW");
        this.power.add("MW");
        this.power.add("hp");

        this.W2kW=0.001;
        this.W2MW=1e-6;
        this.W2hp=0.00134102;

        this.kW2MW=0.001;
        this.kW2hp=1.341022;

        this.MW2hp=1341.02;
    }

    public double convertWatt(double val, String toUnit){
        switch (toUnit){
            case "W":
                return val;
            case "kW":
                return val*this.W2kW;
            case "MW":
                return val*this.W2MW;
            case "hp":
                return val*this.W2hp;
        }
        return -1;
    }
    public double convertKiloWatt(double val, String toUnit){
        switch (toUnit){
            case "W":
                return val/W2kW;
            case "kW":
                return val;
            case "MW":
                return val*this.kW2MW;
            case "hp":
                return val*this.kW2hp;
        }
        return -1;
    }
    public double convertMegaWatt(double val,String toUnit){
        switch (toUnit){
            case "W":
                return val/W2MW;
            case "kW":
                return val/kW2MW;
            case "MW":
                return val;
            case "hp":
                return val*this.MW2hp;
        }
        return -1;
    }
    public double convertHorsePower(double val, String toUnit){
        switch (toUnit){
            case "W":
                return val/W2hp;
            case "kW":
                return val/kW2hp;
            case "MW":
                return val/MW2hp;
            case "hp":
                return val;
        }
        return -1;
    }

}
