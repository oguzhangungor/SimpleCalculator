package com.ogungor.layoutlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Txt;
    EditText number2Txt;
    TextView resultText;
    int number1;
    int number2;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1Txt= findViewById(R.id.number1Text);
        number2Txt= findViewById(R.id.number2Text);
        resultText=findViewById(R.id.txtResult);

    }

    public boolean control() {

        if (number1Txt.getText().toString().matches("") || number2Txt.getText().toString().matches("")) {
            resultText.setText("Enter Number Please No Empty Box");
            return true;

        }
        return false;
    }
    public void sum(View view) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(number2Txt.getWindowToken(), 0);
        if (control()){

        }
        else {
            number1 = Integer.parseInt(number1Txt.getText().toString());
            number2 = Integer.parseInt(number2Txt.getText().toString());
            result = number1 + number2;
            resultText.setText("Result: " + result);
        }
    }


    public void deduct(View view) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(number2Txt.getWindowToken(), 0);
        if (control()){

        }
        else {
            number1 = Integer.parseInt(number1Txt.getText().toString());
            number2 = Integer.parseInt(number2Txt.getText().toString());
            result = number1 - number2;
            resultText.setText("Result: " + result);
        }
    }
    public void multiply(View view) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(number2Txt.getWindowToken(), 0);
        if (control()){

        }
        else {
            number1 = Integer.parseInt(number1Txt.getText().toString());
            number2 = Integer.parseInt(number2Txt.getText().toString());
            result = number1 * number2;
            resultText.setText("Result: " + result);
        }
    }
    public void devide(View view) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(number2Txt.getWindowToken(), 0);
        if (control()){

        }
        else if (number2Txt.getText().toString().matches("0"))
        {
            resultText.setText("Not zero Number 2");
        }
        else {
            number1 = Integer.parseInt(number1Txt.getText().toString());
            number2 = Integer.parseInt(number2Txt.getText().toString());
            result = number1 / number2;
            resultText.setText("Result: " + result);
        }
    }
}