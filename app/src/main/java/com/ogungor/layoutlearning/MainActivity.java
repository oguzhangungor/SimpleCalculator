package com.ogungor.layoutlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Txt;
    EditText number2Txt;
    TextView resultText;
    double number1;
    double number2;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1Txt = findViewById(R.id.number1Text);
        number2Txt = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.txtResult);
    }

    public void process(View view) {
        Button btnProcess = (Button) view;
        hideKeyboard(btnProcess);
        calculator(btnProcess.getText().toString());
    }

    public boolean isEmpty(EditText editText) {

        return editText.getText().toString().matches("");
    }

    public void calculator(String processType) {

        if (isEmpty(number1Txt) || isEmpty(number2Txt)) {
            resultText.setText(getString(R.string.text_not_empty_error));
        } else {

            number1 = Double.parseDouble(number1Txt.getText().toString());
            number2 = Double.parseDouble(number2Txt.getText().toString());
            switch (processType) {
                case "+":

                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        resultText.setText(getString(R.string.text_zero_error));
                        return;
                    }
                    break;
            }
            resultText.setText(getString(R.string.text_result, result));
        }
    }

    public void hideKeyboard(View view) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

}
