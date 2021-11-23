package com.example.calculatrice;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class AddTest {

    @Test
    public void setNextChain() {

        AChain c1 = new Add();
        AChain c2 = new Substract();

        c1.setNextChain(c2);

        assertNotNull(c1.getNextChain());

    }

    @Test
    public void calculate() {

        AChain c1 = new Add();
        AChain c2 = new Substract();

        c1.setNextChain(c2);
    }
}