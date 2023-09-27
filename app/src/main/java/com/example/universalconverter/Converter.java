package com.example.universalconverter;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class Converter extends AppCompatActivity {

    ImageView back;
    TextView Label;
    TextView firstConv;
    String firstConvText,secondConvText;
    TextView secondConv;
    TextView sevenHolder,eightHolder,nineHolder;
    TextView fourHolder,fiveHolder,sixHolder;
    TextView oneHolder,twoHolder,threeHolder;
    TextView zeroHolder,pointHolder;
    TextView clearButton;
    MaterialTextView fromText;
    TextView textCopy;
    ImageButton backSpaceButton;
    boolean firstConvActivate=false, secondConvActivate=false;
    Spinner fromUnitSpinner,toUnitSpinner;
    String fromUnit,toUnit;
    Typeface typeface;
    Typeface typeface2;
    String title;
    ArrayList<String> unitList;
    @SuppressLint({"MissingInflatedId", "SetTextI18n", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        back=findViewById(R.id.go_back);
        Label=findViewById(R.id.TextLabelled);
        firstConv=findViewById(R.id.FirstConv);
        secondConv=findViewById(R.id.SecondConv);
        sevenHolder=findViewById(R.id.SevenHolder);
        eightHolder=findViewById(R.id.EightHolder);
        nineHolder=findViewById(R.id.NineHolder);
        fourHolder=findViewById(R.id.FourHolder);
        fiveHolder=findViewById(R.id.FiveHolder);
        sixHolder=findViewById(R.id.SixHolder);
        oneHolder=findViewById(R.id.OneHolder);
        twoHolder=findViewById(R.id.TwoHolder);
        threeHolder=findViewById(R.id.ThreeHolder);
        zeroHolder=findViewById(R.id.ZeroHolder);
        pointHolder=findViewById(R.id.PointHolder);
        clearButton=findViewById(R.id.ClearButton);
        backSpaceButton=findViewById(R.id.BackSpaceButton);
        fromUnitSpinner=findViewById(R.id.FromUnit);
        toUnitSpinner=findViewById(R.id.ToUnit);
        fromText=findViewById(R.id.FromText);
        textCopy=findViewById(R.id.TextCopy);

        typeface = ResourcesCompat.getFont(getApplicationContext(), R.font.inter_bold);
        typeface2 = ResourcesCompat.getFont(getApplicationContext(), R.font.inter);
        title=getIntent().getStringExtra("Type");

        switch (title) {
            case "Length":
                Length length = new Length();
                unitList = new ArrayList<>(length.getLengthUnits());
                break;
            case "Time":
                Time time = new Time();
                unitList = new ArrayList<>(time.getTimeUnits());
                break;
            case "Area":
                Area area = new Area();
                unitList = new ArrayList<>(area.getAreaUnits());
                break;
            case "Weight":
                Weight weight = new Weight();
                unitList = new ArrayList<>(weight.getWeightUnits());
                break;
            case "Speed":
                Speed speed = new Speed();
                unitList = new ArrayList<>(speed.getSpeedUnits());
                break;
            case "Volume":
                Volume volume = new Volume();
                unitList = new ArrayList<>(volume.getVolumeUnits());
                break;
            case "Temperature":
                Temperature temperature = new Temperature();
                unitList = new ArrayList<>(temperature.getTemperatureUnits());
                break;
            case "Angle":
                Angle angle = new Angle();
                unitList = new ArrayList<>(angle.getAngleUnits());
                break;
            case "Pressure":
                Pressure pressure=new Pressure();
                unitList=new ArrayList<>(pressure.getPressureUnits());
                break;
            case "Power":
                Power power=new Power();
                unitList=new ArrayList<>(power.getPowerUnits());
                break;
            case "Energy":
                Energy energy=new Energy();
                unitList=new ArrayList<>(energy.getEnergyUnits());
                break;
            case "Storage":
                Storage storage=new Storage();
                unitList=new ArrayList<>(storage.getStorageUnits());
                break;


        }

        Label.setText(title);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(Converter.this, android.R.layout.simple_spinner_item,unitList);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromUnitSpinner.setAdapter(myAdapter);
        toUnitSpinner.setAdapter(myAdapter);

        fromUnitSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                 fromUnit=adapterView.getItemAtPosition(i).toString();
             }

             @Override
             public void onNothingSelected(AdapterView<?> adapterView) {

             }
         });
        toUnitSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                toUnit=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        back.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        });

        firstConv.setOnClickListener(view -> {
              firstConv.setTypeface(typeface);
              secondConv.setTypeface(typeface2);
              firstConvActivate=true;
              secondConvActivate=false;
        });
        secondConv.setOnClickListener(view -> {
            firstConv.setTypeface(typeface2);
            secondConv.setTypeface(typeface);
            secondConvActivate=true;
            firstConvActivate=false;
        });

        sevenHolder.setOnClickListener(view -> {
            if (firstConvActivate){
                if(firstConv.getText().toString().equals("0") ){
                    firstConv.setText("7");
                }else{
                    firstConv.setText(firstConv.getText().toString()+"7");
                }
                recreateFirstConv();
            } else if (secondConvActivate) {
                if(secondConv.getText().toString().equals("0") ){
                    secondConv.setText("7");
                }else{
                    secondConv.setText(secondConv.getText().toString()+"7");
                }
                recreateSecondConv();
            }
            fromText.setText(firstConv.getText().toString()+" "+fromUnit+ " = "+secondConv.getText().toString()+ " "+ toUnit);


        });
        eightHolder.setOnClickListener(view -> {
            if (firstConvActivate){
                if(firstConv.getText().toString().equals("0") ){
                    firstConv.setText("8");
                }else{
                    firstConv.setText(firstConv.getText().toString()+"8");
                }
                recreateFirstConv();
            } else if (secondConvActivate) {
                if(secondConv.getText().toString().equals("0") ){
                    secondConv.setText("8");
                }else{
                    secondConv.setText(secondConv.getText().toString()+"8");
                }
                recreateSecondConv();
            }
            fromText.setText(firstConv.getText().toString()+" "+fromUnit+ " = "+secondConv.getText().toString()+ " "+ toUnit);
        });
        nineHolder.setOnClickListener(view -> {
            if (firstConvActivate){
                if(firstConv.getText().toString().equals("0") ){
                    firstConv.setText("9");
                }else{
                    firstConv.setText(firstConv.getText().toString()+"9");
                }
                recreateFirstConv();
            } else if (secondConvActivate) {
                if(secondConv.getText().toString().equals("0") ){
                    secondConv.setText("9");
                }else{
                    secondConv.setText(secondConv.getText().toString()+"9");
                }
                recreateSecondConv();
            }
            fromText.setText(firstConv.getText().toString()+" "+fromUnit+ " = "+secondConv.getText().toString()+ " "+ toUnit);
        });
        fourHolder.setOnClickListener(view -> {
            if (firstConvActivate){
                if(firstConv.getText().toString().equals("0") ){
                    firstConv.setText("4");
                }else{
                    firstConv.setText(firstConv.getText().toString()+"4");
                }
                recreateFirstConv();
            } else if (secondConvActivate) {
                if(secondConv.getText().toString().equals("0") ){
                    secondConv.setText("4");
                }else{
                    secondConv.setText(secondConv.getText().toString()+"4");
                }
                recreateSecondConv();
            }
            fromText.setText(firstConv.getText().toString()+" "+fromUnit+ " = "+secondConv.getText().toString()+ " "+ toUnit);
        });
        fiveHolder.setOnClickListener(view -> {
            if (firstConvActivate){
                if(firstConv.getText().toString().equals("0") ){
                    firstConv.setText("5");
                }else{
                    firstConv.setText(firstConv.getText().toString()+"5");
                }
                recreateFirstConv();
            } else if (secondConvActivate) {
                if(secondConv.getText().toString().equals("0") ){
                    secondConv.setText("5");
                }else{
                    secondConv.setText(secondConv.getText().toString()+"5");
                }
                recreateSecondConv();
            }
            fromText.setText(firstConv.getText().toString()+" "+fromUnit+ " = "+secondConv.getText().toString()+ " "+ toUnit);
        });
        sixHolder.setOnClickListener(view -> {
            if (firstConvActivate){
                if(firstConv.getText().toString().equals("0") ){
                    firstConv.setText("6");
                }else{
                    firstConv.setText(firstConv.getText().toString()+"6");
                }
                   recreateFirstConv();
            } else if (secondConvActivate) {
                if(secondConv.getText().toString().equals("0") ){
                    secondConv.setText("6");
                }else{
                    secondConv.setText(secondConv.getText().toString()+"6");
                }
                recreateSecondConv();
            }
            fromText.setText(firstConv.getText().toString()+" "+fromUnit+ " = "+secondConv.getText().toString()+ " "+ toUnit);
        });
        oneHolder.setOnClickListener(view -> {
            if (firstConvActivate){
                if(firstConv.getText().toString().equals("0") ){
                    firstConv.setText("1");
                }else{
                    firstConv.setText(firstConv.getText().toString()+"1");
                }
                recreateFirstConv();
            } else if (secondConvActivate) {
                if(secondConv.getText().toString().equals("0") ){
                    secondConv.setText("1");
                }else{
                    secondConv.setText(secondConv.getText().toString()+"1");
                }
                recreateSecondConv();
            }
            fromText.setText(firstConv.getText().toString()+" "+fromUnit+ " = "+secondConv.getText().toString()+ " "+ toUnit);
        });
        twoHolder.setOnClickListener(view -> {
            if (firstConvActivate){
                if(firstConv.getText().toString().equals("0") ){
                    firstConv.setText("2");
                }else{
                    firstConv.setText(firstConv.getText().toString()+"2");
                }
                recreateFirstConv();
            } else if (secondConvActivate) {
                if(secondConv.getText().toString().equals("0") ){
                    secondConv.setText("2");
                }else{
                    secondConv.setText(secondConv.getText().toString()+"2");
                }
                recreateSecondConv();
            }
            fromText.setText(firstConv.getText().toString()+" "+fromUnit+ " = "+secondConv.getText().toString()+ " "+ toUnit);
        });
        threeHolder.setOnClickListener(view -> {
            if (firstConvActivate){
                if(firstConv.getText().toString().equals("0") ){
                    firstConv.setText("3");
                }else{
                    firstConv.setText(firstConv.getText().toString()+"3");
                }
                recreateFirstConv();
            } else if (secondConvActivate) {
                if(secondConv.getText().toString().equals("0") ){
                    secondConv.setText("3");
                }else{
                    secondConv.setText(secondConv.getText().toString()+"3");
                }
                recreateSecondConv();
            }
            fromText.setText(firstConv.getText().toString()+" "+fromUnit+ " = "+secondConv.getText().toString()+ " "+ toUnit);
        });
        zeroHolder.setOnClickListener(view -> {
            if (firstConvActivate){
                    firstConv.setText(firstConv.getText().toString()+"0");
                    recreateFirstConv();
            } else if (secondConvActivate) {
                    secondConv.setText(secondConv.getText().toString()+"0");
                    recreateSecondConv();
            }
            fromText.setText(firstConv.getText().toString()+" "+fromUnit+ " = "+secondConv.getText().toString()+ " "+ toUnit);
        });

        pointHolder.setOnClickListener(view -> {
            if (firstConvActivate){
                firstConv.setText(firstConv.getText().toString()+".");
            } else if (secondConvActivate) {
                secondConv.setText(secondConv.getText().toString()+".");
            }
        });

        clearButton.setOnClickListener(view -> {
            firstConv.setTypeface(typeface2);
            secondConv.setTypeface(typeface2);
            firstConv.setText("0");
            secondConv.setText("0");
        });

        backSpaceButton.setOnClickListener(view -> {
            if(firstConvActivate){
                firstConvText=firstConv.getText().toString();
                if (firstConvText.length() >1 ) {
                    firstConvText = firstConvText.substring(0, firstConvText.length() - 1);
                    firstConv.setText(firstConvText);
                }
                else if (firstConvText.length() <=1 ) {
                    firstConv.setText("0");
                }
                recreateFirstConv();
            } else if (secondConvActivate) {
                secondConvText=secondConv.getText().toString();
                if (secondConvText.length() >1 ) {
                    secondConvText = secondConvText.substring(0, secondConvText.length() - 1);
                    secondConv.setText(secondConvText);
                }
                else if (secondConvText.length() <=1 ) {
                    secondConv.setText("0");
                }
                recreateSecondConv();
            }
            fromText.setText(firstConv.getText().toString()+" "+fromUnit+ " = "+secondConv.getText().toString()+ " "+ toUnit);
        });

        textCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("simple text", fromText.getText());
                clipboard.setPrimaryClip(clip);
                Toast.makeText(getApplicationContext(), "Text Copied to Clipboard",
                        Toast.LENGTH_LONG).show();
            }
        });


    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    private void recreateFirstConv(){
        /*Length FirstConv**/
        // Length converter Code begins m,km,mile,yard,ft,in,cm,mm,nmiles firstConv
        if (title.equals("Length")){
            double convertedVal=convertLength(fromUnit,Double.parseDouble(firstConv.getText().toString()),toUnit);
            secondConv.setText(Double.toString(convertedVal));
        }
        /*Time FirstConv**/
        // Time converter Code begins seconds,minutes,hours,days,weeks,months,years firstConv
        if (title.equals("Time")){
            double convertedVal=convertTime(fromUnit,Double.parseDouble(firstConv.getText().toString()),toUnit);
            secondConv.setText(Double.toString(convertedVal));
        }
        /**Area FirstConv**/
        // Area converter begins m²,km²,mi²,yd²,ft²,in²,hectare,acre firstConv
        if (title.equals("Area")){
            double convertedVal=convertArea(fromUnit,Double.parseDouble(firstConv.getText().toString()),toUnit);
            secondConv.setText(Double.toString(convertedVal));
        }
        /*Weight FirstConv**/
        // Weight converter code begins kg,g,mg,µg,tonnes,lb,ounces firstConv
        if (title.equals("Weight")){
            double convertedVal=convertWeight(fromUnit,Double.parseDouble(firstConv.getText().toString()),toUnit);
            secondConv.setText(Double.toString(convertedVal));
        }
        /*Pressure FirstConv**/
        // Pressure Converter begins Pascal,bar,atm,mm of Hg,psi,kPa firstConv
        if (title.equals("Pressure")){
            double convertedVal=convertPressure(fromUnit,Double.parseDouble(firstConv.getText().toString()),toUnit);
            secondConv.setText(Double.toString(convertedVal));
        }
        /*Power FirstConv**/
        // Power converter begins W,kW,MW,hp firstConv
        if (title.equals("Power")){
            double convertedVal=convertPower(fromUnit,Double.parseDouble(firstConv.getText().toString()),toUnit);
            secondConv.setText(Double.toString(convertedVal));
        }
        /*Energy FirstConv**/
        // Energy converter begins joule,calorie,kcal,eV firstConv
        if (title.equals("Energy")){
            double convertedVal=convertEnergy(fromUnit,Double.parseDouble(firstConv.getText().toString()),toUnit);
            secondConv.setText(Double.toString(convertedVal));
        }
        /**Speed firstConv**/
        // Speed Converter begins m/s,km/h,mph,ft/s firstConv
        if (title.equals("Speed")){
            double convertedVal=convertSpeed(fromUnit,Double.parseDouble(firstConv.getText().toString()),toUnit);
            secondConv.setText(Double.toString(convertedVal));
        }
        /*Storage firstConv**/
        //Storage Converter begins bits,B,kB,MB,GB,TB firstConv
        if (title.equals("Storage")){
            double convertedVal=convertStorage(fromUnit,Double.parseDouble(firstConv.getText().toString()),toUnit);
            secondConv.setText(Double.toString(convertedVal));
        }
        /** Volume firstConv**/
        // Volume Converter begins l,ml,m³,cm³,gallons (US),quarts (US),pints (US),fluid-oz (US)
        if (title.equals("Volume")){
            double convertedVal=convertVolume(fromUnit,Double.parseDouble(firstConv.getText().toString()),toUnit);
            secondConv.setText(Double.toString(convertedVal));
        }
        /**Temperature firstConv**/
        // Temperature Converter begins °C,°F,K firstConv
        if (title.equals("Temperature")){
            double convertedVal=convertTemperature(fromUnit,Double.parseDouble(firstConv.getText().toString()),toUnit);
            secondConv.setText(Double.toString(convertedVal));
        }

        /**Angle firstConv**/
        // Angle Converter begins degree,rad,arcmin,arcsec firstConv
        if (title.equals("Angle")){
            double convertedVal=convertAngle(fromUnit,Double.parseDouble(firstConv.getText().toString()),toUnit);
            secondConv.setText(Double.toString(convertedVal));
        }
    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    private void recreateSecondConv(){
        /**Length SecondConv**/
        // Length Converter Code begins secondConv
        if (title.equals("Length")){
            double convertedVal=convertLength(toUnit,Double.parseDouble(secondConv.getText().toString()),fromUnit);
            firstConv.setText(Double.toString(convertedVal));
        }

        /**Time SecondConv**/
        // Time Converter Code begins secondConv
        if (title.equals("Time")){
            double convertedVal=convertTime(toUnit,Double.parseDouble(secondConv.getText().toString()),fromUnit);
            firstConv.setText(Double.toString(convertedVal));
        }

        /**Area SecondConv**/
        //Area converter code begins secondConv
        if (title.equals("Area")){
            double convertedVal=convertArea(toUnit,Double.parseDouble(secondConv.getText().toString()),fromUnit);
            firstConv.setText(Double.toString(convertedVal));
        }
        /** Weight SecondConv**/
        //Weight converter code begins secondConv
        if (title.equals("Weight")){
            double convertedVal=convertWeight(toUnit,Double.parseDouble(secondConv.getText().toString()),fromUnit);
            firstConv.setText(Double.toString(convertedVal));
        }

        /** Pressure SecondConv**/
        //Pressure converter code begins secondConv
        if (title.equals("Pressure")){
            double convertedVal=convertPressure(toUnit,Double.parseDouble(secondConv.getText().toString()),fromUnit);
            firstConv.setText(Double.toString(convertedVal));
        }
        /**Power SecondConv**/
        //Power converter code begins secondConv
        if (title.equals("Power")){
            double convertedVal=convertPower(toUnit,Double.parseDouble(secondConv.getText().toString()),fromUnit);
            firstConv.setText(Double.toString(convertedVal));
        }
        /**Energy SecondConv**/
        //Energy converter code begins secondConv
        if (title.equals("Energy")){
            double convertedVal=convertEnergy(toUnit,Double.parseDouble(secondConv.getText().toString()),fromUnit);
            firstConv.setText(Double.toString(convertedVal));
        }
        /** Speed SecondConv**/
        //Speed converter code begins secondConv
        if (title.equals("Speed")){
            double convertedVal=convertSpeed(toUnit,Double.parseDouble(secondConv.getText().toString()),fromUnit);
            firstConv.setText(Double.toString(convertedVal));
        }
        /** Storage secondConv**/
        //Storage converter code begins secondConv
        if (title.equals("Storage")){
            double convertedVal=convertStorage(toUnit,Double.parseDouble(secondConv.getText().toString()),fromUnit);
            firstConv.setText(Double.toString(convertedVal));
        }

        /**Volume secondConv**/
        //Volume converter code begins secondConv
        if (title.equals("Volume")){
            double convertedVal=convertVolume(toUnit,Double.parseDouble(secondConv.getText().toString()),fromUnit);
            firstConv.setText(Double.toString(convertedVal));
        }
        /**Temperature secondConv**/
        //Temperature converter code begins secondConv
        if (title.equals("Temperature")){
            double convertedVal=convertTemperature(toUnit,Double.parseDouble(secondConv.getText().toString()),fromUnit);
            firstConv.setText(Double.toString(convertedVal));
        }
        /**Angle secondConv**/
        //Angle converter code begins secondConv
        if (title.equals("Angle")){
            double convertedVal=convertAngle(toUnit,Double.parseDouble(secondConv.getText().toString()),fromUnit);
            firstConv.setText(Double.toString(convertedVal));
        }

    }
    private double convertAngle(String fromUnit, double parseDouble, String toUnit) {
        Angle angular=new Angle();
        double acuteAngle;
        switch (fromUnit){
            case "degree":
               acuteAngle=angular.convertDegrees(parseDouble,toUnit);
               return acuteAngle;
            case "rad":
                acuteAngle=angular.convertRadians(parseDouble,toUnit);
                return acuteAngle;
            case "arcmin":
                acuteAngle=angular.convertArcMin(parseDouble,toUnit);
                return acuteAngle;
            case "arcsec" :
                acuteAngle=angular.convertArcSec(parseDouble,toUnit);
                return acuteAngle;

        }
        return -1;
    }
    private double convertTemperature(String fromUnit, double parseDouble, String toUnit) {
        Temperature temperatureInstance=new Temperature();
        double temp;
        switch (fromUnit){
            case "°C":
              temp=temperatureInstance.convertCelsius(parseDouble,toUnit);
              return temp;
            case "°F":
                temp=temperatureInstance.convertFahrenheit(parseDouble,toUnit);
                return temp;
            case "K":
                temp=temperatureInstance.convertKelvin(parseDouble,toUnit);
                return temp;
        }
        return -1;
    }

    private double convertVolume(String fromUnit, double parseDouble, String toUnit) {
        Volume volumeInstance=new Volume();
        double waterVolume;
        switch (fromUnit){
            case "l":
               waterVolume=volumeInstance.convertLitres(parseDouble,toUnit);
               return waterVolume;
            case "ml":
                waterVolume=volumeInstance.convertMilliLitres(parseDouble,toUnit);
                return waterVolume;
            case "m³":
                waterVolume=volumeInstance.convertCubicMetres(parseDouble,toUnit);
                return waterVolume;
            case "cm³":
                waterVolume=volumeInstance.convertCubicCentiMetres(parseDouble,toUnit);
                return waterVolume;
            case "gallons (US)":
                waterVolume=volumeInstance.convertGallons(parseDouble,toUnit);
                return waterVolume;
            case "quarts (US)":
                waterVolume=volumeInstance.convertQuarts(parseDouble,toUnit);
                return waterVolume;
            case "pints (US)":
                waterVolume=volumeInstance.convertPints(parseDouble,toUnit);
                return waterVolume;
            case "fluid-oz (US)":
                waterVolume=volumeInstance.convertFluidOunces(parseDouble,toUnit);
                return waterVolume;

        }
        return -1;
    }

    private double convertStorage(String fromUnit, double parseDouble, String toUnit) {
        Storage storageInstance=new Storage();
        double ssDrive;

        switch (fromUnit){
            case "bits":
               ssDrive=storageInstance.convertBits(parseDouble,toUnit);
               return ssDrive;
            case "B":
               ssDrive=storageInstance.convertBytes(parseDouble,toUnit);
               return ssDrive;
            case "kB":
               ssDrive=storageInstance.convertKiloBytes(parseDouble,toUnit);
               return ssDrive;
            case "MB":
               ssDrive=storageInstance.convertMegaBytes(parseDouble,toUnit);
               return ssDrive;
            case "GB":
               ssDrive=storageInstance.convertGigaBytes(parseDouble,toUnit);
               return ssDrive;
            case "TB":
               ssDrive=storageInstance.convertTeraBytes(parseDouble,toUnit);
               return ssDrive;
        }
        return -1;
    }
    private double convertSpeed(String fromUnit, double parseDouble, String toUnit) {
        Speed speedInstance= new Speed();
        double speedForce;
        switch (fromUnit){
            case "m/s":
                speedForce=speedInstance.convertMetresPerSecond(parseDouble,toUnit);
                return speedForce;
            case "km/h":
                speedForce=speedInstance.convertKiloMetresPerHour(parseDouble,toUnit);
                return speedForce;
            case "mph":
                speedForce=speedInstance.convertMilesPerHour(parseDouble,toUnit);
                return speedForce;
            case "ft/s":
                speedForce=speedInstance.convertFeetPerSecond(parseDouble,toUnit);
                return speedForce;
        }
        return -1;
    }

    private double convertEnergy(String fromUnit, double parseDouble, String toUnit) {
        Energy energyInstance= new Energy();
        double energySource;
        switch (fromUnit){
            case "joule":
                energySource=energyInstance.convertJoules(parseDouble,toUnit);
                return energySource;
            case "calorie":
                energySource=energyInstance.convertCalories(parseDouble,toUnit);
                return energySource;
            case "kcal":
                energySource=energyInstance.convertKiloCalories(parseDouble,toUnit);
                return energySource;
            case "eV":
                energySource=energyInstance.convertElectronVolts(parseDouble,toUnit);
                return energySource;
        }
        return -1;
    }

    private double convertPower(String fromUnit, double parseDouble, String toUnit) {
        Power powerInstance=new Power();
        double powerRanger;
        switch (fromUnit){
            case "W":
            powerRanger=powerInstance.convertWatt(parseDouble,toUnit);
            return powerRanger;
            case "kW":
            powerRanger=powerInstance.convertKiloWatt(parseDouble,toUnit);
            return powerRanger;
            case "MW":
            powerRanger=powerInstance.convertMegaWatt(parseDouble,toUnit);
            return powerRanger;
            case "hp":
            powerRanger=powerInstance.convertHorsePower(parseDouble,toUnit);
            return powerRanger;

        }
        return -1;
    }

    private double convertPressure(String fromUnit, double parseDouble, String toUnit) {
        Pressure pressureInstance= new Pressure();
        double flatTyre;
        switch (fromUnit){
            case "Pascal":
            flatTyre=pressureInstance.convertPascal(parseDouble,toUnit);
            return flatTyre;
            case "bar":
            flatTyre=pressureInstance.convertBar(parseDouble,toUnit);
            return flatTyre;
            case "atm":
            flatTyre=pressureInstance.convertAtm(parseDouble,toUnit);
            return flatTyre;
            case "mm of Hg":
            flatTyre=pressureInstance.convertMercury(parseDouble,toUnit);
            return flatTyre;
            case "psi":
            flatTyre=pressureInstance.convertPSI(parseDouble,toUnit);
            return flatTyre;
            case "kPa":
            flatTyre=pressureInstance.convertKiloPascal(parseDouble,toUnit);
            return flatTyre;
        }
        return -1;
    }

    private double convertWeight(String fromUnit, double parseDouble, String toUnit) {
        Weight weightInstance=new Weight();
        double fatBoy;
        switch (fromUnit){
            case "kg":
            fatBoy=weightInstance.convertKiloGrams(parseDouble,toUnit);
            return fatBoy;
            case "g":
            fatBoy=weightInstance.convertGrams(parseDouble,toUnit);
            return fatBoy;
            case "mg":
            fatBoy=weightInstance.convertMilliGrams(parseDouble,toUnit);
            return fatBoy;
            case "µg":
            fatBoy=weightInstance.convertMicroGrams(parseDouble,toUnit);
            return fatBoy;
            case "tonnes":
            fatBoy=weightInstance.convertTonnes(parseDouble,toUnit);
            return fatBoy;
            case "lb":
            fatBoy=weightInstance.convertPounds(parseDouble,toUnit);
            return fatBoy;
            case "ounces":
            fatBoy=weightInstance.convertOunces(parseDouble,toUnit);
            return fatBoy;
        }

        return -1;
    }

    private double convertArea(String fromUnit, double parseDouble, String toUnit) {
        Area areaInstance= new Area();
        double plotter;
        switch (fromUnit){
            case "m²":
                plotter=areaInstance.convertSqMetres(parseDouble,toUnit);
                return plotter;
            case "km²":
                plotter=areaInstance.convertSqKiloMetres(parseDouble,toUnit);
                return plotter;
            case "mi²" :
                plotter=areaInstance.convertSqMiles(parseDouble,toUnit);
                return plotter;
            case "yd²"  :
                plotter=areaInstance.convertSqYard(parseDouble,toUnit);
                return plotter;
            case "ft²":
                plotter=areaInstance.convertSqFeet(parseDouble,toUnit);
                return plotter;
            case "in²":
                plotter=areaInstance.convertSqInches(parseDouble,toUnit);
                return plotter;
            case "hectare":
                plotter=areaInstance.convertHectare(parseDouble,toUnit);
                return plotter;
            case "acre":
                plotter=areaInstance.convertAcre(parseDouble,toUnit);
                return plotter;
        }
        return -1;
    }

    private double convertTime(String fromUnit, double parseDouble, String toUnit) {
         Time timeInstance= new Time();
         double timer;
//        seconds,minutes,hours,days,weeks,months,years
         switch (fromUnit){
             case "seconds":
                 timer=timeInstance.convertSeconds(parseDouble,toUnit);
                 return timer;
             case "minutes":
                 timer=timeInstance.convertMinutes(parseDouble,toUnit);
                 return timer;
             case "hours":
                 timer=timeInstance.convertHours(parseDouble,toUnit);
                 return timer;
             case "days":
                 timer=timeInstance.convertDays(parseDouble,toUnit);
                 return timer;
             case "weeks":
                 timer=timeInstance.convertWeeks(parseDouble,toUnit);
                 return timer;
             case "months":
                 timer=timeInstance.convertMonths(parseDouble,toUnit);
                 return timer;
             case "years":
                 timer=timeInstance.convertYears(parseDouble,toUnit);
                 return timer;

         }
         return -1;
    }

    private double convertLength(String fromUnit,double parseDouble, String toUnit) {
        Length lengthInstance= new Length();
        double result;
        switch (fromUnit){
            case "m":
                result=lengthInstance.convertMetres(parseDouble,toUnit);
                return result;
            case "km":
                result=lengthInstance.convertKilometres(parseDouble,toUnit);
                return result;
            case "mile":
                result=lengthInstance.convertMiles(parseDouble,toUnit);
                return result;
            case "yard":
                result=lengthInstance.convertYards(parseDouble,toUnit);
                return result;
            case "ft":
                result=lengthInstance.convertFeet(parseDouble,toUnit);
                return result;
            case "in":
                result=lengthInstance.convertInches(parseDouble,toUnit);
                return result;
            case "cm":
                result=lengthInstance.convertCentiMetres(parseDouble,toUnit);
                return result;
            case "mm":
                result=lengthInstance.convertMilliMetres(parseDouble,toUnit);
                return result;
            case "nmiles":
                result=lengthInstance.convertNauticalMiles(parseDouble,toUnit);
                return result;
        }
        return -1;

    }

}