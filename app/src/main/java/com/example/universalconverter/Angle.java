package com.example.universalconverter;

import java.util.ArrayList;

public class Angle {
    ArrayList<String> angle;
    double deg2rad;
    double deg2arcmin;
    double deg2arcsec;

    double rad2arcmin;
    double rad2arcsec;

    double arcmin2arcsec;

    public ArrayList<String> getAngleUnits() {
        return angle;
    }

    public Angle() {
        this.angle = new ArrayList<>();
        this.angle.add("degree");
        this.angle.add("rad");
        this.angle.add("arcmin");
        this.angle.add("arcsec");

        this.deg2rad= 0.01745;
        this.deg2arcmin=60;
        this.deg2arcsec=3600;

        this.rad2arcmin=3437.75;
        this.rad2arcsec=206264.99992965;

        this.arcmin2arcsec=60;
    }

    public double convertDegrees(double val,String toUnit){

        switch (toUnit){
            case "degree":
                return val;
            case "rad":
                return val*this.deg2rad;
            case "arcmin":
                return val*this.deg2arcmin;
            case "arcsec" :
                return val*this.deg2arcsec;
        }
        return -1;
    }

    public double convertRadians(double val,String toUnit){

        switch (toUnit){
            case "degree":
                return val/deg2rad;
            case "rad":
                return val;
            case "arcmin":
                return val*this.rad2arcmin;
            case "arcsec" :
                return val*this.rad2arcsec;
        }
        return -1;
    }

    public double convertArcMin(double val,String toUnit){
        switch (toUnit){
            case "degree":
                return val/deg2arcmin;
            case "rad":
                return val/rad2arcmin;
            case "arcmin":
                return val;
            case "arcsec" :
                return val*this.arcmin2arcsec;
        }
        return -1;
    }

    public double convertArcSec(double val,String toUnit){
        switch (toUnit){
            case "degree":
                return val/deg2arcsec;
            case "rad":
                return val/rad2arcsec;
            case "arcmin":
                return val/arcmin2arcsec;
            case "arcsec" :
                return val;
        }
        return -1;
    }




}
