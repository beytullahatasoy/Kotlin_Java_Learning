package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText numberText;
    EditText numberText2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberText = findViewById(R.id.numberText);        //numberText i tanımladık
        numberText2 = findViewById(R.id.numberText2);      // numberText2 yi tanımladık
        resultText = findViewById(R.id.resultText);        //resultText i tanımladık

    }

    public void sum(View view) {

        if (numberText.getText().toString().matches("") || numberText2.getText().toString().matches("")) {

            resultText.setText("Enter Number!");

        } else {
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 + number2;

            resultText.setText("Result: " + result);
        }
    }

    public void deduct(View view) {

        if (numberText.getText().toString().matches("") || numberText2.getText().toString().matches("")) {

            resultText.setText("Enter Number!");

        } else {
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 - number2;

            resultText.setText("Result: " + result);
        }
    }

    public void multiply(View view) {

        if (numberText.getText().toString().matches("") || numberText2.getText().toString().matches("")) {

            resultText.setText("Enter Number!");

        } else {
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 * number2;

            resultText.setText("Result: " + result);
        }
    }

    public void divide(View view) {

        if (numberText.getText().toString().matches("") || numberText2.getText().toString().matches("")) {

            resultText.setText("Enter Number!");

        } else {
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 / number2;

            resultText.setText("Result: " + result);
        }
    }
}