package com.example.universalconverter;

import java.util.ArrayList;

public class Time {

    ArrayList<String> time;
    double year2sec;
    double year2min;
    double year2hr;
    double year2day;
    double year2week;
    double year2month;

    double mon2sec;
    double mon2min;
    double mon2hr;
    double mon2days;
    double mon2weeks;

    double week2sec;
    double week2min;
    double week2hr;
    double week2days;

    double day2sec;
    double day2min;
    double day2hr;

    double hr2sec;
    double hr2min;

    double min2sec;

    public Time() {
        this.time= new ArrayList<>();
        this.time.add("seconds");
        this.time.add("minutes");
        this.time.add("hours");
        this.time.add("days");
        this.time.add("weeks");
        this.time.add("months");
        this.time.add("years");

        this.year2sec=31557600;
        this.year2min=525960;
        this.year2hr=8766;
        this.year2day=365.25;
        this.year2week=52.17857;
        this.year2month=12;

        this.mon2sec=2629746;
        this.mon2min=43829.1;
        this.mon2hr=730.4850;
        this.mon2days=30.4369;
        this.mon2weeks=4.3481;

        this.week2sec=604800;
        this.week2min=10080;
        this.week2hr=168;
        this.week2days=7;

        this.day2sec=86400;
        this.day2min=1440;
        this.day2hr=24;

        this.hr2sec=3600;
        this.hr2min=60;

        this.min2sec=60;

    }

    public ArrayList<String> getTimeUnits() {
        return time;
    }

    public double convertYears(double val,String toUnit){
          switch (toUnit){
              case "seconds":
                  return val*this.year2sec;
              case "minutes":
                  return  val*this.year2min;
              case "hours":
                  return val*this.year2hr;
              case "days":
                  return val*this.year2day;
              case "weeks":
                  return val*this.year2week;
              case "months":
                  return val*this.year2month;
              case "years":
                  return val;
          }
          return -1;
    }
    public double convertMonths(double val,String toUnit){
          switch (toUnit){
              case "seconds":
                  return val*this.mon2sec;
              case "minutes":
                  return  val*this.mon2min;
              case "hours":
                  return val*this.mon2hr;
              case "days":
                  return val*this.mon2days;
              case "weeks":
                  return val*this.mon2weeks;
              case "months":
                  return val;
              case "years":
                  return val/year2month;
          }
          return -1;
    }
    public double convertWeeks(double val,String toUnit){
          switch (toUnit){
              case "seconds":
                  return val*this.week2sec;
              case "minutes":
                  return  val*this.week2min;
              case "hours":
                  return val*this.week2hr;
              case "days":
                  return val*this.week2days;
              case "weeks":
                  return val;
              case "months":
                  return val/mon2weeks;
              case "years":
                  return val/year2week;
          }
          return -1;
    }
    public double convertDays(double val,String toUnit){
          switch (toUnit){
              case "seconds":
                  return val*this.day2sec;
              case "minutes":
                  return  val*this.day2min;
              case "hours":
                  return val*this.day2hr;
              case "days":
                  return val;
              case "weeks":
                  return val/week2days;
              case "months":
                  return val/mon2days;
              case "years":
                  return val/year2day;
          }
          return -1;
    } public double convertHours(double val,String toUnit){
          switch (toUnit){
              case "seconds":
                  return val*this.hr2sec;
              case "minutes":
                  return  val*this.hr2min;
              case "hours":
                  return val;
              case "days":
                  return val/day2hr;
              case "weeks":
                  return val/week2hr;
              case "months":
                  return val/mon2hr;
              case "years":
                  return val/year2hr;
          }
          return -1;
    }
    public double convertMinutes(double val,String toUnit){
          switch (toUnit){
              case "seconds":
                  return val*this.min2sec;
              case "minutes":
                  return  val;
              case "hours":
                  return val/hr2min;
              case "days":
                  return val/day2min;
              case "weeks":
                  return val/week2min;
              case "months":
                  return val/mon2min;
              case "years":
                  return val/year2min;
          }
          return -1;
    } public double convertSeconds(double val,String toUnit){
          switch (toUnit){
              case "seconds":
                  return val;
              case "minutes":
                  return  val/min2sec;
              case "hours":
                  return val/hr2sec;
              case "days":
                  return val/day2sec;
              case "weeks":
                  return val/week2sec;
              case "months":
                  return val/mon2sec;
              case "years":
                  return val/year2sec;
          }
          return -1;
    }




}
