package com.example.universalconverter;

import java.util.ArrayList;

public class Pressure {
    ArrayList<String> pressure;
    double pa2bar;
    double pa2atm;
    double pa2Hg;
    double pa2psi;
    double pa2kPa;

    double bar2atm;
    double bar2Hg;
    double bar2psi;
    double bar2kPa;

    double atm2Hg;
    double atm2psi;
    double atm2kPa;

    double Hg2psi;
    double Hg2kPa;

    double psi2kPa;

    public ArrayList<String> getPressureUnits() {
        return pressure;
    }
    public Pressure() {
        this.pressure = new ArrayList<>();
        this.pressure.add("Pascal");
        this.pressure.add("bar");
        this.pressure.add("atm");
        this.pressure.add("mm of Hg");
        this.pressure.add("psi");
        this.pressure.add("kPa");

        this.pa2bar=0.00001;
        this.pa2atm=0.00000986923;
        this.pa2Hg=0.007502;
        this.pa2psi=0.000145;
        this.pa2kPa=0.001;

        this.bar2atm=0.986923;
        this.bar2Hg=750.1875;
        this.bar2psi=14.50377;
        this.bar2kPa=100;

        this.atm2Hg=760.1275;
        this.atm2psi=14.69595;
        this.atm2kPa=101.325;

        this.Hg2psi=0.019334;
        this.Hg2kPa=0.1333;

        this.psi2kPa=6.894757;

    }

    public double convertPascal(double val, String toUnit){
          switch (toUnit){
              case "Pascal":
                  return val;
              case "bar":
                  return val*this.pa2bar;
              case "atm":
                  return val*this.pa2atm;
              case "mm of Hg":
                  return val*this.pa2Hg;
              case "psi":
                  return val*this.pa2psi;
              case "kPa":
                  return val*this.pa2kPa;
          }
          return -1;
    }
    public double convertBar(double val, String toUnit){
          switch (toUnit){
              case "Pascal":
                  return val/pa2bar;
              case "bar":
                  return val;
              case "atm":
                  return val*this.bar2atm;
              case "mm of Hg":
                  return val*this.bar2Hg;
              case "psi":
                  return val*this.bar2psi;
              case "kPa":
                  return val*this.bar2kPa;
          }
          return -1;
    }
     public double convertAtm(double val, String toUnit){
          switch (toUnit){
              case "Pascal":
                  return val/pa2atm;
              case "bar":
                  return val/bar2atm;
              case "atm":
                  return val;
              case "mm of Hg":
                  return val*this.atm2Hg;
              case "psi":
                  return val*this.atm2psi;
              case "kPa":
                  return val*this.atm2kPa;
          }
          return -1;
    }
        public double convertMercury(double val, String toUnit){
          switch (toUnit){
              case "Pascal":
                  return val/pa2Hg;
              case "bar":
                  return val/bar2Hg;
              case "atm":
                  return val/atm2Hg;
              case "mm of Hg":
                  return val;
              case "psi":
                  return val*this.Hg2psi;
              case "kPa":
                  return val*this.Hg2kPa;
          }
          return -1;
    }
    public double convertPSI(double val, String toUnit){
          switch (toUnit){
              case "Pascal":
                  return val/pa2psi;
              case "bar":
                  return val/bar2psi;
              case "atm":
                  return val/atm2psi;
              case "mm of Hg":
                  return val/Hg2psi;
              case "psi":
                  return val;
              case "kPa":
                  return val*this.psi2kPa;
          }
          return -1;
    }
       public double convertKiloPascal(double val, String toUnit){
          switch (toUnit){
              case "Pascal":
                  return val/pa2kPa;
              case "bar":
                  return val/bar2kPa;
              case "atm":
                  return val/atm2kPa;
              case "mm of Hg":
                  return val/Hg2kPa;
              case "psi":
                  return val/psi2kPa;
              case "kPa":
                  return val;
          }
          return -1;
    }


}
