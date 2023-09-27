package com.example.universalconverter;

import java.util.ArrayList;

public class Volume {
    public ArrayList<String> getVolumeUnits() {
        return volume;
    }

    ArrayList<String> volume;
    double l2ml;
    double l2cum;
    double l2cucm;
    double l2gal;
    double l2qt;
    double l2pt;
    double l2floz;

    double ml2cum;
    double ml2cucm;
    double ml2gal;
    double ml2qt;
    double ml2pt;
    double ml2floz;

    double cum2cucm;
    double cum2gal;
    double cum2qt;
    double cum2pt;
    double cum2floz;

    double cucm2gal;
    double cucm2qt;
    double cucm2pt;
    double cucm2floz;

    double gal2qt;
    double gal2pt;
    double gal2floz;

    double qt2pt;
    double qt2floz;

    double pt2floz;


    public Volume() {
        this.volume = new ArrayList<>();
        this.volume.add("l");
        this.volume.add("ml");
        this.volume.add("m³");
        this.volume.add("cm³");
        this.volume.add("gallons (US)");
        this.volume.add("quarts (US)");
        this.volume.add("pints (US)");
        this.volume.add("fluid-oz (US)");

        this.l2ml=1000;
        this.l2cum=0.001;
        this.l2cucm=1000;
        this.l2gal=0.264172;
        this.l2qt=1.056688;
        this.l2pt=2.113376;
        this.l2floz=33.81402;

        this.ml2cum=0.000001;
        this.ml2cucm=1;
        this.ml2gal=0.000264;
        this.ml2qt=0.001057;
        this.ml2pt=0.002113;
        this.ml2floz=0.033814;

        this.cum2cucm=1000000;
        this.cum2gal=264.1721;
        this.cum2qt=1056.688;
        this.cum2pt=2113.376;
        this.cum2floz=33814.02;

        this.cucm2gal=0.000264;
        this.cucm2qt=0.001057;
        this.cucm2pt=0.002113;
        this.cucm2floz=0.033814;

        this.gal2qt=4;
        this.gal2pt=8;
        this.gal2floz=128;

        this.qt2pt=2;
        this.qt2floz=32;

        this.pt2floz=16;


    }

    public double convertLitres(double val, String toUnit){
        switch (toUnit){
            case "l":
                return val;
            case "ml":
                return val*this.l2ml;
            case "m³":
                return val*this.l2cum;
            case "cm³":
                return val*this.l2cucm;
            case "gallons (US)":
                return val*this.l2gal;
            case "quarts (US)":
                return val*this.l2qt;
            case "pints (US)":
                return val*this.l2pt;
            case "fluid-oz (US)":
                return val*this.l2floz;
        }
        return -1;
    }

     public double convertMilliLitres(double val, String toUnit){
        switch (toUnit){
            case "l":
                return val/l2ml;
            case "ml":
                return val;
            case "m³":
                return val*this.ml2cum;
            case "cm³":
                return val*this.ml2cucm;
            case "gallons (US)":
                return val*this.ml2gal;
            case "quarts (US)":
                return val*this.ml2qt;
            case "pints (US)":
                return val*this.ml2pt;
            case "fluid-oz (US)":
                return val*this.ml2floz;
        }
        return -1;
    }

    public double convertCubicMetres(double val, String toUnit){
        switch (toUnit){
            case "l":
                return val/l2cum;
            case "ml":
                return val/ml2cum;
            case "m³":
                return val;
            case "cm³":
                return val*this.cum2cucm;
            case "gallons (US)":
                return val*this.cum2gal;
            case "quarts (US)":
                return val*this.cum2qt;
            case "pints (US)":
                return val*this.cum2pt;
            case "fluid-oz (US)":
                return val*this.cum2floz;
        }
        return -1;
    }

    public double convertCubicCentiMetres(double val, String toUnit){
        switch (toUnit){
            case "l":
                return val/l2cucm;
            case "ml":
                return val/ml2cucm;
            case "m³":
                return val/cum2cucm;
            case "cm³":
                return val;
            case "gallons (US)":
                return val*this.cucm2gal;
            case "quarts (US)":
                return val*this.cucm2qt;
            case "pints (US)":
                return val*this.cucm2pt;
            case "fluid-oz (US)":
                return val*this.cucm2floz;
        }
        return -1;
    }

    public double convertGallons(double val, String toUnit){
        switch (toUnit){
            case "l":
                return val/l2gal;
            case "ml":
                return val/ml2gal;
            case "m³":
                return val/cum2gal;
            case "cm³":
                return val/cucm2gal;
            case "gallons (US)":
                return val;
            case "quarts (US)":
                return val*this.gal2qt;
            case "pints (US)":
                return val*this.gal2pt;
            case "fluid-oz (US)":
                return val*this.gal2floz;
        }
        return -1;
    }
    public double convertQuarts(double val, String toUnit){
        switch (toUnit){
            case "l":
                return val/l2qt;
            case "ml":
                return val/ml2qt;
            case "m³":
                return val/cum2qt;
            case "cm³":
                return val/cucm2qt;
            case "gallons (US)":
                return val/gal2qt;
            case "quarts (US)":
                return val;
            case "pints (US)":
                return val*this.qt2pt;
            case "fluid-oz (US)":
                return val*this.qt2floz;
        }
        return -1;
    }

    public double convertPints(double val, String toUnit){
        switch (toUnit){
            case "l":
                return val/l2pt;
            case "ml":
                return val/ml2pt;
            case "m³":
                return val/cum2pt;
            case "cm³":
                return val/cucm2pt;
            case "gallons (US)":
                return val/gal2pt;
            case "quarts (US)":
                return val/qt2pt;
            case "pints (US)":
                return val;
            case "fluid-oz (US)":
                return val*this.pt2floz;
        }
        return -1;
    }
    public double convertFluidOunces(double val, String toUnit){
        switch (toUnit){
            case "l":
                return val/l2floz;
            case "ml":
                return val/ml2floz;
            case "m³":
                return val/cum2floz;
            case "cm³":
                return val/cucm2floz;
            case "gallons (US)":
                return val/gal2floz;
            case "quarts (US)":
                return val/qt2floz;
            case "pints (US)":
                return val/pt2floz;
            case "fluid-oz (US)":
                return val;
        }
        return -1;
    }


}
