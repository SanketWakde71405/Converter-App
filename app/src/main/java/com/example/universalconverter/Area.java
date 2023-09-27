package com.example.universalconverter;

import java.util.ArrayList;

public class Area {


    ArrayList<String> area;
    double ac2sqm;
    double ac2sqkm;
    double ac2sqmi;
    double ac2sqyd;
    double ac2sqft;
    double ac2sqin;
    double ac2hect;

    double hect2sqm;
    double hect2sqkm;
    double hect2sqmi;
    double hect2sqyd;
    double hect2sqft;
    double hect2sqin;

    double sqin2sqm;
    double sqin2sqkm;
    double sqin2sqmi;
    double sqin2sqyd;
    double sqin2sqft;

    double sqft2sqm;
    double sqft2sqkm;
    double sqft2sqmi;
    double sqft2sqyd;

    double sqyd2sqm;
    double sqyd2sqkm;
    double sqyd2sqmi;

    double sqmi2sqm;
    double sqmi2sqkm;

    double sqkm2sqm;

    public Area() {
        this.area = new ArrayList<>();
        this.area.add("m²");
        this.area.add("km²");
        this.area.add("mi²");
        this.area.add("yd²");
        this.area.add("ft²");
        this.area.add("in²");
        this.area.add("hectare");
        this.area.add("acre");

        this.ac2sqm=4046.856;
        this.ac2sqkm=0.004047;
        this.ac2sqmi=0.001563;
        this.ac2sqyd=4840;
        this.ac2sqft=43560;
        this.ac2sqin=6272640;
        this.ac2hect=0.404686;

        this.hect2sqm=10000;
        this.hect2sqkm=0.01;
        this.hect2sqmi=0.003861;
        this.hect2sqyd=11959.9;
        this.hect2sqft=107639.1;
        this.hect2sqin=15500031;

        this.sqin2sqm=0.000645;
        this.sqin2sqkm=0.00000000064516;
        this.sqin2sqmi=0.000000000249098;
        this.sqin2sqyd=0.000772;
        this.sqin2sqft=0.006944;

        this.sqft2sqm=0.092903;
        this.sqft2sqkm=0.00000009290304;
        this.sqft2sqmi=0.000000035870064;
        this.sqft2sqyd=0.111111;

        this.sqyd2sqm=0.836127;
        this.sqyd2sqkm=0.00000083612736;
        this.sqyd2sqmi=0.000000322830579;

        this.sqmi2sqm=2589988;
        this.sqmi2sqkm=2.589988;

        this.sqkm2sqm=1000000;



    }
    public ArrayList<String> getAreaUnits() {
        return area;
    }

    public double convertHectare(double val, String toUnit){
        switch (toUnit){
            case "m²":
                return val*this.hect2sqm;
            case "km²":
                return val*this.hect2sqkm;
            case "mi²" :
                return val*this.hect2sqmi;
            case "yd²"  :
                return val*this.hect2sqyd;
            case "ft²":
                return val*this.hect2sqft;
            case "in²":
                return val*this.hect2sqin;
            case "hectare":
                return val;
            case "acre":
                return val/ac2hect;
        }
        return -1;
    }

    public double convertAcre(double val, String toUnit){
        switch (toUnit){
            case "m²":
                return val*this.ac2sqm;
            case "km²":
                return val*this.ac2sqkm;
            case "mi²" :
                return val*this.ac2sqmi;
            case "yd²"  :
                return val*this.ac2sqyd;
            case "ft²":
                return val*this.ac2sqft;
            case "in²":
                return val*this.ac2sqin;
            case "hectare":
                return val*this.ac2hect;
            case "acre":
                return val;
        }
        return -1;
    }

    public double convertSqInches(double val, String toUnit){
        switch (toUnit){
            case "m²":
                return val*this.sqin2sqm;
            case "km²":
                return val*this.sqin2sqkm;
            case "mi²" :
                return val*this.sqin2sqmi;
            case "yd²"  :
                return val*this.sqin2sqyd;
            case "ft²":
                return val*this.sqin2sqft;
            case "in²":
                return val;
            case "hectare":
                return val/hect2sqin;
            case "acre":
                return val/ac2sqin;
        }
        return -1;
    }

    public double convertSqFeet(double val, String toUnit){
        switch (toUnit){
            case "m²":
                return val*this.sqft2sqm;
            case "km²":
                return val*this.sqft2sqkm;
            case "mi²" :
                return val*this.sqft2sqmi;
            case "yd²"  :
                return val*this.sqft2sqyd;
            case "ft²":
                return val;
            case "in²":
                return val/sqin2sqft;
            case "hectare":
                return val/hect2sqft;
            case "acre":
                return val/ac2sqft;
        }
        return -1;
    }
    public double convertSqYard(double val, String toUnit){
        switch (toUnit){
            case "m²":
                return val*this.sqyd2sqm;
            case "km²":
                return val*this.sqyd2sqkm;
            case "mi²" :
                return val*this.sqyd2sqmi;
            case "yd²"  :
                return val;
            case "ft²":
                return val/sqft2sqyd;
            case "in²":
                return val/sqin2sqyd;
            case "hectare":
                return val/hect2sqyd;
            case "acre":
                return val/ac2sqyd;
        }
        return -1;
    }

    public double convertSqMiles(double val, String toUnit){
        switch (toUnit){
            case "m²":
                return val*this.sqmi2sqm;
            case "km²":
                return val*this.sqmi2sqkm;
            case "mi²" :
                return val;
            case "yd²"  :
                return val/sqyd2sqmi;
            case "ft²":
                return val/sqft2sqmi;
            case "in²":
                return val/sqin2sqmi;
            case "hectare":
                return val/hect2sqmi;
            case "acre":
                return val/ac2sqmi;
        }
        return -1;
    }

    public double convertSqKiloMetres(double val, String toUnit){
        switch (toUnit){
            case "m²":
                return val*this.sqkm2sqm;
            case "km²":
                return val;
            case "mi²" :
                return val/sqmi2sqkm;
            case "yd²"  :
                return val/sqyd2sqkm;
            case "ft²":
                return val/sqft2sqkm;
            case "in²":
                return val/sqin2sqkm;
            case "hectare":
                return val/hect2sqkm;
            case "acre":
                return val/ac2sqkm;
        }
        return -1;
    }

    public double convertSqMetres(double val, String toUnit){
        switch (toUnit){
            case "m²":
                return val;
            case "km²":
                return val/sqkm2sqm;
            case "mi²" :
                return val/sqmi2sqm;
            case "yd²"  :
                return val/sqyd2sqm;
            case "ft²":
                return val/sqft2sqm;
            case "in²":
                return val/sqin2sqm;
            case "hectare":
                return val/hect2sqm;
            case "acre":
                return val/ac2sqm;
        }
        return -1;
    }

}
