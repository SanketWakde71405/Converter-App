package com.example.universalconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout timeContainer;
    LinearLayout lengthContainer;
    LinearLayout areaContainer;
    LinearLayout weightContainer;
    LinearLayout pressureContainer;
    LinearLayout powerContainer;
    LinearLayout energyContainer;
    LinearLayout speedContainer;
    LinearLayout storageContainer;
    LinearLayout volumeContainer;
    LinearLayout temperatureContainer;
    LinearLayout angleContainer;


    TextView timeText;
    TextView lengthText;
    TextView areaText;
    TextView weightText;
    TextView pressureText;
    TextView powerText;
    TextView energyText;
    TextView speedText;
    TextView storageText;
    TextView volumeText;
    TextView temperatureText;
    TextView angleText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeContainer=findViewById(R.id.TimeContainer);
        lengthContainer=findViewById(R.id.LengthContainer);
        areaContainer=findViewById(R.id.AreaContainer);
        weightContainer=findViewById(R.id.WeightContianer);
        pressureContainer=findViewById(R.id.PressureContainer);
        powerContainer=findViewById(R.id.PowerContainer);
        energyContainer=findViewById(R.id.EnergyContainer);
        speedContainer=findViewById(R.id.SpeedContainer);
        storageContainer=findViewById(R.id.StorageContainer);
        volumeContainer=findViewById(R.id.VolumeContainer);
        temperatureContainer=findViewById(R.id.TemperatureContainer);
        angleContainer=findViewById(R.id.AngleContainer);

        timeText=findViewById(R.id.TimeText);
        lengthText=findViewById(R.id.LengthText);
        areaText=findViewById(R.id.AreaText);
        weightText=findViewById(R.id.WeightText);
        pressureText=findViewById(R.id.PressureText);
        powerText=findViewById(R.id.PowerText);
        energyText=findViewById(R.id.EnergyText);
        speedText=findViewById(R.id.SpeedText);
        storageText=findViewById(R.id.StorageText);
        volumeText=findViewById(R.id.VolumeText);
        temperatureText=findViewById(R.id.TemperatureText);
        angleText=findViewById(R.id.AngleText);



        lengthContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Converter.class);
                intent.putExtra("Type",lengthText.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        timeContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Converter.class);
                intent.putExtra("Type",timeText.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        areaContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Converter.class);
                intent.putExtra("Type",areaText.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        weightContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Converter.class);
                intent.putExtra("Type",weightText.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        pressureContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Converter.class);
                intent.putExtra("Type",pressureText.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        powerContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Converter.class);
                intent.putExtra("Type",powerText.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        energyContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Converter.class);
                intent.putExtra("Type",energyText.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        speedContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Converter.class);
                intent.putExtra("Type",speedText.getText().toString());
                startActivity(intent);
                finish();
            }
        });


        storageContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Converter.class);
                intent.putExtra("Type",storageText.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        volumeContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Converter.class);
                intent.putExtra("Type",volumeText.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        temperatureContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Converter.class);
                intent.putExtra("Type",temperatureText.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        angleContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Converter.class);
                intent.putExtra("Type",angleText.getText().toString());
                startActivity(intent);
                finish();
            }
        });

    }
}