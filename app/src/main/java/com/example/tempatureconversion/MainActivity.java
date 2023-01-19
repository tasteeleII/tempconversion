package com.example.tempatureconversion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputText;
    EditText inputText2;
    TextView outputText;
    TextView outputText2;
    Button button;
    Button button2;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputText);
        inputText2 = findViewById(R.id.inputText2);
        outputText = findViewById(R.id.outputText);
        outputText2 = findViewById(R.id.outputText2);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        layout = findViewById(R.id.layout);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = inputText2.getText().toString();
                double x = Double.parseDouble(s);
                outputText2.setText("Temperature in Fahrenheit: "+((x*1.8)+32));
                layout.setBackgroundColor(0xff50C878);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = inputText.getText().toString();
                double x = Double.parseDouble(s);
                outputText.setText("Temperature in Celsius: "+((x-32)*.5556));
                layout.setBackgroundColor(0xff50C878);
            }
        });

    }
}
