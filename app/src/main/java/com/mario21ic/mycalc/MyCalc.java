package com.mario21ic.mycalc;

import android.util.Log;

public class MyCalc {
    String operator;
    Double numberA;
    Double numberB;

    public MyCalc() {
    }

    public MyCalc(String operator, Double numberA, Double numberB) {
        this.operator = operator;
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Double getNumberA() {
        return numberA;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }

    public void clearAll() {
        numberA = 0.0;
        numberB = 0.0;
        operator = "";
    }

    public boolean isNumberANull() {
        if (null == numberA) {
            return true;
        }
        return false;
    }

    public boolean isNumberBNull() {
        if (null == numberB) {
            return true;
        }
        return false;
    }

    public boolean isOperatorNull() {
        if (null == operator) {
            return true;
        }
        return false;
    }

    public Double getResults() {
        Double myResult = 0.0;
        if (false==isNumberANull() &&
            false==isNumberBNull() &&
            false==isOperatorNull()) {
            switch (operator) {
                case "+":
                    myResult = numberA + numberB;
                    break;
                case "-":
                    myResult = numberA - numberB;
                    break;
                case "/":
                    myResult = numberA / numberB;
                    break;
                case "*":
                    myResult = numberA * numberB;
                    break;
            }
        }
        return myResult;
    }
}
