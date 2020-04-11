package com.mario21ic.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText myIO;
    MyCalc myCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCalc = new MyCalc();
        myIO = findViewById(R.id.myio);
    }

    public void changeNumber(View view) {
        String actualValor = myIO.getText().toString();
        if (actualValor != "0") {
            myIO.setText(actualValor + ((Button) view).getText());
        }
    }

    public void changeOperator(View view) {
        if (myIO.getText().length() > 0) {
            myCalc.setNumberA(Double.parseDouble(myIO.getText().toString()));
            myCalc.setOperator(((Button) view).getText().toString());
            myIO.setText("");
        }
    }

    public void getResults(View view) {
        myCalc.setNumberB(Double.parseDouble(myIO.getText().toString()));
        Double myResult = myCalc.getResults();
        myIO.setText(Double.toString(myResult));
        myCalc.clearAll();
    }

    public void clearCA(View view) {
        myCalc.clearAll();
        myIO.setText("");
    }

    public void clearC(View view) {
        myIO.setText("");
    }

    public void myDel(View view) {
        String actualValor = myIO.getText().toString();
        if (actualValor.length() > 0) {
            String newNumber = actualValor.substring(0, actualValor.length() -1);
            myIO.setText(newNumber);
        }
    }

    public void putDot(View view) {
        String actualValor = myIO.getText().toString();
        if (actualValor.length() > 0 && actualValor.indexOf(".")==-1) {
            myIO.setText(actualValor + ".");
        }
    }

    public void putSignal(View view) {
        String actualValorS = myIO.getText().toString();
        if (actualValorS.length() > 0) {
            Double actualValorD = Double.parseDouble(actualValorS);
            actualValorD = actualValorD*(-1);
            // TODO: Arreglar bug cuando solo queda signo y vuelve a invocar
            myIO.setText(Double.toString(actualValorD));
        }
    }
}
