package com.example.calculatrice;

import android.widget.TextView;

public class Multiply extends AChain {

    @Override
    public void calculate(int num1, int num2, String operation, TextView tw) {

        if(operation.compareTo("*") == 0){
            result = num1 * num2;
            tw.setText(num1 * num2 +"");
        } else {
            nextInChain.calculate(num1, num2, operation, tw);
        }

    }
}