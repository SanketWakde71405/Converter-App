package com.example.universalconverter;

import java.util.ArrayList;

public class Length {
    ArrayList<String> length;
    double m2cm;
    double m2mm;
    double m2km;
    double m2in;
    double m2ft;
    double m2yd;
    double m2mi;
    double m2nmi;

    double km2cm;
    double km2mi;
    double km2nmi;
    double km2yd;
    double km2ft;
    double km2in;
    double km2mm;


    double mi2yd;
    double mi2ft;
    double mi2in;
    double mi2mm;
    double mi2cm;
    double mi2nmi;


    double yd2ft;
    double yd2in;
    double yd2mm;
    double yd2cm;
    double yd2nmi;


    double ft2in;
    double ft2cm;
    double ft2mm;
    double ft2nmi;

    double in2cm;
    double in2mm;
    double in2nmi;

    double cm2mm;
    double cm2nmi;

    double mm2nmi;


    public Length() {
        this.length = new ArrayList<>();
        this.length.add("m");
        this.length.add("km");
        this.length.add("mile");
        this.length.add("yard");
        this.length.add("ft");
        this.length.add("in");
        this.length.add("cm");
        this.length.add("mm");
        this.length.add("nmiles");

        this.m2mm = 1000;
        this.m2cm = 100;
        this.m2km = 0.001;
        this.m2in = 39.37;
        this.m2ft = 3.281;
        this.m2yd = 1.0936;
        this.m2mi = 0.00062;
        this.m2nmi = 0.00053;

        this.km2cm = 100000;
        this.km2mi = 0.62137;
        this.km2nmi = 0.5399;
        this.km2yd = 1093.613;
        this.km2ft = 3280.84;
        this.km2in = 39370.08;
        this.km2mm = 1000000;


        this.mi2mm = 1609344;
        this.mi2cm = 160934.4;
        this.mi2nmi = 0.8689;
        this.mi2yd = 1760;
        this.mi2ft = 5280;
        this.mi2in = 63360;


        this.yd2ft = 3;
        this.yd2in = 36;
        this.yd2cm = 91.44;
        this.yd2mm = 914.4;
        this.yd2nmi = 0.00049;

        this.ft2nmi = 0.000165;
        this.ft2mm = 304.8;
        this.ft2cm = 30.48;
        this.ft2in = 12;

        this.in2cm = 2.54;
        this.in2mm = 25.4;
        this.in2nmi = 0.000014;

        this.cm2mm = 10;
        this.cm2nmi = 0.000005;

        this.mm2nmi = 0.0000005399;

    }

    public ArrayList<String> getLengthUnits() {
        return length;
    }

    public double convertMetres(double val, String toUnit) {
        switch (toUnit) {
            case "m":
                return val;
            case "km":
                return val * this.m2km;
            case "mile":
                return val * this.m2mi;
            case "yard":
                return val * this.m2yd;
            case "ft":
                return val * this.m2ft;
            case "in":
                return val * this.m2in;
            case "cm":
                return val * this.m2cm;
            case "mm":
                return val * this.m2mm;
            case "nmiles":
                return val * this.m2nmi;
            default:
                break;
        }

        return -1;
    }

    public double convertKilometres(double val, String toUnit) {
        switch (toUnit) {
            case "m":
                return val / m2km;
            case "km":
                return val;
            case "mile":
                return val * this.km2mi;
            case "yard":
                return val * this.km2yd;
            case "ft":
                return val * this.km2ft;
            case "in":
                return val * this.km2in;
            case "cm":
                return val * this.km2cm;
            case "mm":
                return val * this.km2mm;
            case "nmiles":
                return val * this.km2nmi;
            default:
                break;
        }
        return -1;

    }

    public double convertMiles(double val, String toUnit) {
        switch (toUnit) {
            case "m":
                return val / m2mi;
            case "km":
                return val / km2mi;
            case "mile":
                return val;
            case "yard":
                return val * this.mi2yd;
            case "ft":
                return val * this.mi2ft;
            case "in":
                return val * this.mi2in;
            case "cm":
                return val * this.mi2cm;
            case "mm":
                return val * this.mi2mm;
            case "nmiles":
                return val * this.mi2nmi;
            default:
                break;
        }
        return -1;
    }

    public double convertYards(double val, String toUnit) {
        switch (toUnit) {
            case "m":
                return val / m2yd;
            case "km":
                return val / km2yd;
            case "mile":
                return val / mi2yd;
            case "yard":
                return val;
            case "ft":
                return val * this.yd2ft;
            case "in":
                return val * this.yd2in;
            case "cm":
                return val * this.yd2cm;
            case "mm":
                return val * this.yd2mm;
            case "nmiles":
                return val * this.yd2nmi;
            default:
                break;
        }
        return -1;
    }

    public double convertFeet(double val, String toUnit) {
        switch (toUnit) {
            case "m":
                return val / m2ft;
            case "km":
                return val / km2ft;
            case "mile":
                return val / mi2ft;
            case "yard":
                return val / yd2ft;
            case "ft":
                return val;
            case "in":
                return val * this.ft2in;
            case "cm":
                return val * this.ft2cm;
            case "mm":
                return val * this.ft2mm;
            case "nmiles":
                return val * this.ft2nmi;
            default:
                break;
        }
        return -1;
    }

    public double convertInches(double val, String toUnit) {
        switch (toUnit) {
            case "m":
                return val / m2in;
            case "km":
                return val / km2in;
            case "mile":
                return val / mi2in;
            case "yard":
                return val / yd2in;
            case "ft":
                return val / ft2in;
            case "in":
                return val;
            case "cm":
                return val * this.in2cm;
            case "mm":
                return val * this.in2mm;
            case "nmiles":
                return val * this.in2nmi;
            default:
                break;
        }
        return -1;
    }

    public double convertCentiMetres(double val, String toUnit) {
        switch (toUnit) {
            case "m":
                return val / m2cm;
            case "km":
                return val / km2cm;
            case "mile":
                return val / mi2cm;
            case "yard":
                return val / yd2cm;
            case "ft":
                return val / ft2cm;
            case "in":
                return val / in2cm;
            case "cm":
                return val;
            case "mm":
                return val * this.cm2mm;
            case "nmiles":
                return val * this.cm2nmi;
            default:
                break;
        }
        return -1;
    }

    public double convertMilliMetres(double val, String toUnit) {
        switch (toUnit) {
            case "m":
                return val / m2mm;
            case "km":
                return val / km2mm;
            case "mile":
                return val / mi2mm;
            case "yard":
                return val / yd2mm;
            case "ft":
                return val / ft2mm;
            case "in":
                return val / in2mm;
            case "cm":
                return val / cm2mm;
            case "mm":
                return val;
            case "nmiles":
                return val * mm2nmi;
            default:
                break;
        }
        return -1;
    }

    public double convertNauticalMiles(double val, String toUnit) {
        switch (toUnit) {
            case "m":
                return val / m2nmi;
            case "km":
                return val / km2nmi;
            case "mile":
                return val / mi2nmi;
            case "yard":
                return val / yd2nmi;
            case "ft":
                return val / ft2nmi;
            case "in":
                return val / in2nmi;
            case "cm":
                return val / cm2nmi;
            case "mm":
                return val / mm2nmi;
            case "nmiles":
                return val;
            default:
                break;
        }
        return -1;
    }


}

