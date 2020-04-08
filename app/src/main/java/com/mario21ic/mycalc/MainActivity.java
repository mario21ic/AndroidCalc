package com.mario21ic.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    EditText myIO;
    String myOperator;
    Double myNumberA;
    Double myNumberB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myIO = findViewById(R.id.myio);

//        LinearLayout linearLayout = findViewById(R.id.rootContainer);
//        final int myArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println("### Inicio ###");
//        for (final int item:myArr) {
//            System.out.println(item);
//
//            Button btnShow = new Button(this);
//            btnShow.setId(item);
//            btnShow.setText(Integer.toString(item));
//            btnShow.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//            btnShow.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(MainActivity.this, "Valor: " + item, Toast.LENGTH_LONG).show();
//                }
//            });
//
//            // Add Button to LinearLayout
//            if (linearLayout != null) {
//                linearLayout.addView(btnShow);
//            }
//
//        }

    }

    public void changeNumber(View view) {
//        Toast.makeText(MainActivity.this, "Valor presionado" + ((Button) view).getText(), Toast.LENGTH_LONG).show();
        String actualValor = myIO.getText().toString();
        if (actualValor != "0") {
            String newNumber = actualValor + ((Button) view).getText();
            myIO.setText(newNumber);
        }
    }

    public void changeOperator(View view) {
        myNumberA = Double.parseDouble(myIO.getText().toString());
//        Toast.makeText(MainActivity.this, "A " + myNumberA, Toast.LENGTH_SHORT).show();
        myOperator = (String) ((Button) view).getText();
        myIO.setText("");
    }

    public void getResults(View view) {
        myNumberB = Double.parseDouble(myIO.getText().toString());
        if (myOperator != "" && myNumberB>0) {
//            Toast.makeText(MainActivity.this, "A " + myNumberA, Toast.LENGTH_SHORT).show();
//            Toast.makeText(MainActivity.this, "B " + myNumberB, Toast.LENGTH_SHORT).show();

            Double myResult = 0.0;
            switch (myOperator) {
                case "+":
                    myResult = myNumberA + myNumberB;
                    break;
                case "-":
                    myResult = myNumberA - myNumberB;
                    break;
                case "/":
                    myResult = myNumberA / myNumberB;
                    break;
                case "*":
                    myResult = myNumberA * myNumberB;
                    break;
            }

            myIO.setText(Double.toString(myResult));

            myNumberA = 0.0;
            myNumberB = 0.0;
            myOperator = "";
        }
    }

    public void clearCA(View view) {
        myIO.setText("");
        myNumberA = 0.0;
        myNumberB = 0.0;
        myOperator = "";
    }

    public void clearC(View view) {
        myIO.setText("");
    }

    // TODO: delete last character
    public void myDel(View view) {
    }

    // TODO: dont put more than one dot
    public void putDot(View view) {
    }

    // TODO: Allow operation between signed numbers
    public void putSignal(View view) {
    }
}
