package com.example.universalconverter;

import java.util.ArrayList;

public class Energy {
    ArrayList<String> energy;
    double j2cal;
    double j2kcal;
    double j2eV;

    double cal2kcal;
    double cal2eV;

    double kcal2eV;
    public ArrayList<String> getEnergyUnits() {
        return energy;
    }

    public Energy() {
        this.energy = new ArrayList<>();

        this.energy.add("joule");
        this.energy.add("calorie");
        this.energy.add("kcal");
        this.energy.add("eV");

        this.j2cal=0.239006;
        this.j2kcal=0.000239006;
        this.j2eV=6.242e+18;

        this.cal2kcal=0.001;
        this.cal2eV=2.611e+19;

        this.kcal2eV=2.611e+22;
    }

    public double convertJoules(double val, String toUnit){
        switch (toUnit){
            case "joule":
                return val;
            case "calorie":
                return val*this.j2cal;
            case "kcal":
                return val*this.j2kcal;
            case "eV":
                return val*this.j2eV;
        }
        return -1;
    }
     public double convertCalories(double val, String toUnit){
        switch (toUnit){
            case "joule":
                return val/j2cal;
            case "calorie":
                return val;
            case "kcal":
                return val*this.cal2kcal;
            case "eV":
                return val*this.cal2eV;
        }
        return -1;
    }
     public double convertKiloCalories(double val, String toUnit){
        switch (toUnit){
            case "joule":
                return val/j2kcal;
            case "calorie":
                return val/cal2kcal;
            case "kcal":
                return val;
            case "eV":
                return val*this.kcal2eV;
        }
        return -1;
    }
      public double convertElectronVolts(double val, String toUnit){
        switch (toUnit){
            case "joule":
                return val/j2kcal;
            case "calorie":
                return val/cal2kcal;
            case "kcal":
                return val/kcal2eV;
            case "eV":
                return val;
        }
        return -1;
    }



}
