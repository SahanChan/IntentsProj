package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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


        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup)findViewById(R.id.toast_layout));
        final Toast toast2 = new Toast(getApplicationContext());
        toast2.setGravity(Gravity.CENTER_HORIZONTAL,0,1000);
        toast2.setDuration(Toast.LENGTH_SHORT);
        toast2.setView(layout);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = number1.getText().toString();
                n2 = number2.getText().toString();

                ans = Double.parseDouble(n1) + Double.parseDouble(n2);
                String answer = n1 + " + " + n2 + " = " + Double.toString(ans);
                result.setText(answer);
                toast2.show();

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
                toast2.show();
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
                toast2.show();

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
                toast2.show();
            }
        });




    }



}