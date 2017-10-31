package com.tom.bmi6;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bmi(View view){
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        float w = Float.parseFloat(edWeight.getText().toString());
        float h = Float.parseFloat(edHeight.getText().toString());
        float bmi = w/(h*h);
        new AlertDialog.Builder(this)
                .setMessage("YOUR BMI is: "+bmi)
                .setTitle("title")
                .setPositiveButton("ok", null)
                .show();
    }
}


