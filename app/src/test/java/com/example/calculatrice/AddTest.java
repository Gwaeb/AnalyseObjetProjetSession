package com.example.calculatrice;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import android.widget.TextView;

import org.junit.Test;

public class AddTest {

    @Test
    public void TestSetNextChain() {

        AChain c1 = new Add();
        AChain c2 = new Substract();

        c1.setNextChain(c2);

        assertNotNull(c1.getNextChain());

    }

    @Test
    public void TestCalculateAddition() {

        AChain c1 = new Add();

        TextView tw = new TextView();

        c1.calculate(1, 2, "+", tw);
        float result = c1.getResult();

        assertEquals(3, result);

    }

    @Test
    public void TestCalculateNotAddition() {

        AChain c1 = new Add();

        TextView tw = new TextView();

        c1.calculate(1, 2, "-", tw);
        float result = c1.getResult();

        assertNull(result);

    }
}