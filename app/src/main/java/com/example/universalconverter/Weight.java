package com.example.universalconverter;

import java.util.ArrayList;

public class Weight {
    ArrayList<String> weight;
    double kg2g;
    double kg2mg;
    double kg2microg;
    double kg2tonnes;
    double kg2lb;
    double kg2oz;

    double g2mg;
    double g2microg;
    double g2tonnes;
    double g2lb;
    double g2oz;


    double mg2microg;
    double mg2tonnes;
    double mg2lb;
    double mg2oz;

    double microg2tonnes;
    double microg2lb;
    double microg2oz;

    double tonnes2lb;
    double tonnes2oz;

    double lb2oz;

    public Weight() {
        this.weight = new ArrayList<>();
        this.weight.add("kg");
        this.weight.add("g");
        this.weight.add("mg");
        this.weight.add("µg");
        this.weight.add("tonnes");
        this.weight.add("lb");
        this.weight.add("ounces");

        this.kg2g=1000;
        this.kg2mg=1000000;
        this.kg2microg=1000000000;
        this.kg2tonnes=0.001;
        this.kg2lb=2.204623;
        this.kg2oz=35.27396;

        this.g2mg=1000;
        this.g2microg=1000000;
        this.g2tonnes=0.000001;
        this.g2lb=0.002205;
        this.g2oz=0.035274;

        this.mg2microg=1000;
        this.mg2tonnes=0.000000001;
        this.mg2lb=0.0000022046224;
        this.mg2oz=0.00003527396;

        this.microg2tonnes=0.000000000001;
        this.microg2lb=2.2046e-9;
        this.microg2oz=3.5274e-8;

        this.tonnes2lb=2204.62;
        this.tonnes2oz=35274;

        this.lb2oz=16;


    }

    public ArrayList<String> getWeightUnits() {
        return weight;
    }

    public double convertKiloGrams(double val, String toUnit){
          switch (toUnit){
              case "kg":
                  return val;
              case "g":
                  return val*this.kg2g;
              case "mg":
                  return val*this.kg2mg;
              case "µg":
                  return val*this.kg2microg;
              case "tonnes":
                  return val*this.kg2tonnes;
              case "lb":
                  return val*this.kg2lb;
              case "ounces":
                  return val*this.kg2oz;
          }

          return -1;
    }

    public double convertGrams(double val, String toUnit){
          switch (toUnit){
              case "kg":
                  return val/kg2g;
              case "g":
                  return val;
              case "mg":
                  return val*this.g2mg;
              case "µg":
                  return val*this.g2microg;
              case "tonnes":
                  return val*this.g2tonnes;
              case "lb":
                  return val*this.g2lb;
              case "ounces":
                  return val*this.g2oz;
          }

          return -1;
    }

    public double convertMilliGrams(double val, String toUnit){
          switch (toUnit){
              case "kg":
                  return val/kg2mg;
              case "g":
                  return val/g2mg;
              case "mg":
                  return val;
              case "µg":
                  return val*this.mg2microg;
              case "tonnes":
                  return val*this.mg2tonnes;
              case "lb":
                  return val*this.mg2lb;
              case "ounces":
                  return val*this.mg2oz;
          }

          return -1;
    }

    public double convertMicroGrams(double val, String toUnit){
          switch (toUnit){
              case "kg":
                  return val/kg2microg;
              case "g":
                  return val/g2microg;
              case "mg":
                  return val/mg2microg;
              case "µg":
                  return val;
              case "tonnes":
                  return val*this.microg2tonnes;
              case "lb":
                  return val*this.microg2lb;
              case "ounces":
                  return val*this.microg2oz;
          }

          return -1;
    }

    public double convertTonnes(double val, String toUnit){
          switch (toUnit){
              case "kg":
                  return val/kg2tonnes;
              case "g":
                  return val/g2tonnes;
              case "mg":
                  return val/mg2tonnes;
              case "µg":
                  return val/microg2tonnes;
              case "tonnes":
                  return val;
              case "lb":
                  return val*this.tonnes2lb;
              case "ounces":
                  return val*this.tonnes2oz;
          }

          return -1;
    }

    public double convertPounds(double val, String toUnit){
          switch (toUnit){
              case "kg":
                  return val/kg2lb;
              case "g":
                  return val/g2lb;
              case "mg":
                  return val/mg2lb;
              case "µg":
                  return val/microg2lb;
              case "tonnes":
                  return val/tonnes2lb;
              case "lb":
                  return val;
              case "ounces":
                  return val*this.lb2oz;
          }

          return -1;
    }

 public double convertOunces(double val, String toUnit){
          switch (toUnit){
              case "kg":
                  return val/kg2oz;
              case "g":
                  return val/g2oz;
              case "mg":
                  return val/mg2oz;
              case "µg":
                  return val/microg2oz;
              case "tonnes":
                  return val/tonnes2oz;
              case "lb":
                  return val/lb2oz;
              case "ounces":
                  return val;
          }

          return -1;
    }


}
