package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button button;
    EditText number1,number2;
    String n1,n2;
    String toastMessage = "You just clicked the OK button";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = (Button)findViewById(R.id.button);
        number1 = findViewById(R.id.no1);
        number2 = findViewById(R.id.no2);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                n1 = number1.getText().toString();
                n2 = number2.getText().toString();
                intent.putExtra("number1", n1);
                intent.putExtra("number2", n2);
                Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP,Gravity.CENTER,200);
                toast.show();

                startActivity(intent);
                finish();
            }
        });
    }
}