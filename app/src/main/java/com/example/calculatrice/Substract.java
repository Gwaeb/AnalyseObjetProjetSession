package com.example.calculatrice;

import android.widget.TextView;

public class Substract extends AChain {

    @Override
    public void calculate(float num1, float num2, String operation, TextView tw) {

        if(operation.compareTo("-") == 0){
            result = num1 - num2;
            tw.setText(result + "");
        } else {
            nextInChain.calculate(num1, num2, operation, tw);
        }

    }
}