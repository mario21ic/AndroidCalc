package com.mario21ic.mycalc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    MyCalc myCalc;

    @Before
    public void setUp() throws Exception {
        myCalc = new MyCalc();
    }

    @After
    public void tearDown() throws Exception {
        myCalc = null;
        assertNull(myCalc);
    }

    @Test
    public void numberA_isNull() {
        assertTrue(myCalc.isNumberANull());
    }

    @Test
    public void numberA_isNotNull() {
        myCalc.setNumberA(1.0);
        assertFalse(myCalc.isNumberANull());
    }

    @Test
    public void numberB_isNull() {
        assertTrue(myCalc.isNumberBNull());
    }

    @Test
    public void numberB_isNotNull() {
        myCalc.setNumberB(1.0);
        assertFalse(myCalc.isNumberBNull());
    }

    @Test
    public void operator_isNull() {
        assertTrue(myCalc.isOperatorNull());
    }

    @Test
    public void operator_isNotNull() {
        myCalc.setOperator("/");
        assertFalse(myCalc.isOperatorNull());
    }

    @Test
    public void addition_integer() {
        myCalc.setNumberA(4.0);
        myCalc.setNumberB(3.0);
        myCalc.setOperator("+");

        Double esperado = 7.0;
        assertEquals(esperado, myCalc.getResults());
    }

    @Test
    public void addition_decimal() {
        myCalc.setNumberA(4.0);
        myCalc.setNumberB(0.3);
        myCalc.setOperator("+");

        Double esperado = 4.3;
        assertEquals(esperado, myCalc.getResults());
    }

    @Test
    public void addition_signedInteger() {
        myCalc.setNumberA(-4.0);
        myCalc.setNumberB(2.0);
        myCalc.setOperator("+");

        Double esperado = -2.0;
        assertEquals(esperado, myCalc.getResults());
    }

    @Test
    public void addition_signedDecimal() {
        myCalc.setNumberA(2.0);
        myCalc.setNumberB(-4.0);
        myCalc.setOperator("+");

        Double esperado = -2.0;
        assertEquals(esperado, myCalc.getResults());
    }

    @Test
    public void subtraction_integer() {
        myCalc.setNumberA(4.0);
        myCalc.setNumberB(2.0);
        myCalc.setOperator("-");

        Double esperado = 2.0;
        assertEquals(esperado, myCalc.getResults());
    }

    @Test
    public void subtraction_signedInteger() {
        myCalc.setNumberA(4.0);
        myCalc.setNumberB(-2.0);
        myCalc.setOperator("-");

        Double esperado = 6.0;
        assertEquals(esperado, myCalc.getResults());
    }

    @Test
    public void multiplication_integer() {
        myCalc.setNumberA(4.0);
        myCalc.setNumberB(2.0);
        myCalc.setOperator("*");

        Double esperado = 8.0;
        assertEquals(esperado, myCalc.getResults());
    }

    @Test
    public void multiplication_signedInteger() {
        myCalc.setNumberA(4.0);
        myCalc.setNumberB(-2.0);
        myCalc.setOperator("*");

        Double esperado = -8.0;
        assertEquals(esperado, myCalc.getResults());
    }

    @Test
    public void division_integer() {
        myCalc.setNumberA(8.0);
        myCalc.setNumberB(4.0);
        myCalc.setOperator("/");

        Double esperado = 2.0;
        assertEquals(esperado, myCalc.getResults());
    }

    @Test
    public void division_signedInteger() {
        myCalc.setNumberA(8.0);
        myCalc.setNumberB(-4.0);
        myCalc.setOperator("/");

        Double esperado = -2.0;
        assertEquals(esperado, myCalc.getResults());
    }

}