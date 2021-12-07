package com.example.calculatrice;

import android.widget.TextView;

public class Add extends AChain {

    @Override
    public void calculate(float num1, float num2, String operation, TextView tw) {

        if(operation.compareTo("+") == 0){
            result = num1 + num2;
            tw.setText( result + "");
        } else {
            result = Float.parseFloat(null);
            nextInChain.calculate(num1, num2, operation, tw);
        }
    }
}