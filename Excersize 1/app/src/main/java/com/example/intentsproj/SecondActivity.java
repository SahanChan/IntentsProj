package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView result;
    EditText number1,number2;
    String n1,n2;
    Button plus,minus,multiply,divide;
    double ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setTitle("Second Activity");
        number1 = findViewById(R.id.n1_2);
        number2 = findViewById(R.id.n2_2);
        result = findViewById(R.id.result);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        n1 = getIntent().getExtras().getString("number1");
        n2 = getIntent().getExtras().getString("number2");
        number1.setText(n1);
        number2.setText(n2);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = number1.getText().toString();
                n2 = number2.getText().toString();

                ans = Double.parseDouble(n1) + Double.parseDouble(n2);
                String answer = n1 + " + " + n2 + " = " + Double.toString(ans);
                result.setText(answer);


            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = number1.getText().toString();
                n2 = number2.getText().toString();

                ans =  Double.parseDouble(n1) -  Double.parseDouble(n2);
                String answer = n1 + " - " + n2 + " = " + Double.toString(ans);
                result.setText(answer);

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = number1.getText().toString();
                n2 = number2.getText().toString();

                ans =  Double.parseDouble(n1) *  Double.parseDouble(n2);
                String answer = n1 + " X " + n2 + " = " + Double.toString(ans);
                result.setText(answer);


            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = number1.getText().toString();
                n2 = number2.getText().toString();

                ans =  Double.parseDouble(n1) /  Double.parseDouble(n2);
                String answer = n1 + " / " + n2 + " = " + Double.toString(ans);
                result.setText(answer);

            }
        });




    }



}