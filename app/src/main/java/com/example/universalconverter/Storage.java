package com.example.universalconverter;

import java.util.ArrayList;

public class Storage {
    ArrayList<String> storage;
    double tb2bits;
    double tb2B;
    double tb2kb;
    double tb2mb;
    double tb2gb;

    double gb2bits;
    double gb2B;
    double gb2kb;
    double gb2mb;

    double mb2bits;
    double mb2B;
    double mb2kb;

    double kb2bits;
    double kb2B;

    double B2bits;

    public ArrayList<String> getStorageUnits() {
        return storage;
    }

    public Storage() {
        this.storage = new ArrayList<>();
        this.storage.add("bits");
        this.storage.add("B");
        this.storage.add("kB");
        this.storage.add("MB");
        this.storage.add("GB");
        this.storage.add("TB");

        this.tb2bits=8e+12;
        this.tb2B=1e+12;
        this.tb2kb=1e+9;
        this.tb2mb=1e+6;
        this.tb2gb=1000;

        this.gb2bits=8e+9;
        this.gb2B=1e+9;
        this.gb2kb=1000000;
        this.gb2mb=1000;

        this.mb2bits=8e+6;
        this.mb2B=1e+6;
        this.mb2kb=1000;

        this.kb2bits=8000;
        this.kb2B=1000;

        this.B2bits=8;
    }
    public double convertTeraBytes(double val,String toUnit){
           switch (toUnit){
               case "bits":
                   return val*this.tb2bits;
               case "B":
                   return val*this.tb2B;
               case "kB":
                   return val*this.tb2kb;
               case "MB":
                   return val*this.tb2mb;
               case "GB":
                   return val*this.tb2gb;
               case "TB":
                   return val;
           }
           return -1;
    }
   public double convertGigaBytes(double val,String toUnit){
           switch (toUnit){
               case "bits":
                   return val*this.gb2bits;
               case "B":
                   return val*this.gb2B;
               case "kB":
                   return val*this.gb2kb;
               case "MB":
                   return val*this.gb2mb;
               case "GB":
                   return val;
               case "TB":
                   return val/tb2gb;
           }
           return -1;
    }
     public double convertMegaBytes(double val,String toUnit){
           switch (toUnit){
               case "bits":
                   return val*this.mb2bits;
               case "B":
                   return val*this.mb2B;
               case "kB":
                   return val*this.mb2kb;
               case "MB":
                   return val;
               case "GB":
                   return val/gb2mb;
               case "TB":
                   return val/tb2mb;
           }
           return -1;
    }

    public double convertKiloBytes(double val,String toUnit){
           switch (toUnit){
               case "bits":
                   return val*this.kb2bits;
               case "B":
                   return val*this.kb2B;
               case "kB":
                   return val;
               case "MB":
                   return val/mb2kb;
               case "GB":
                   return val/gb2kb;
               case "TB":
                   return val/tb2kb;
           }
           return -1;
    }
    public double convertBytes(double val,String toUnit){
           switch (toUnit){
               case "bits":
                   return val*this.B2bits;
               case "B":
                   return val;
               case "kB":
                   return val/kb2B;
               case "MB":
                   return val/mb2B;
               case "GB":
                   return val/gb2B;
               case "TB":
                   return val/tb2B;
           }
           return -1;
    }
    public double convertBits(double val,String toUnit){
           switch (toUnit){
               case "bits":
                   return val;
               case "B":
                   return val/B2bits;
               case "kB":
                   return val/kb2bits;
               case "MB":
                   return val/mb2bits;
               case "GB":
                   return val/gb2bits;
               case "TB":
                   return val/tb2bits;
           }
           return -1;
    }


}
