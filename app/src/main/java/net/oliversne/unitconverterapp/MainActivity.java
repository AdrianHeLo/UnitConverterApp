package net.oliversne.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView inputKg;
    TextView outputLb;
    Button converterBtn;
    double kg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputKg = findViewById(R.id.inputKilos);
        outputLb = findViewById(R.id.poundsResult);
        converterBtn = findViewById(R.id.converterBtn);


        converterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputKg.getText().toString();
                kg = Double.parseDouble(input);
                outputLb.setText(""+converterKgToLb(kg));
            }
        });
    }

    private double converterKgToLb (double kg){
        return kg * 2.204;
    }


}