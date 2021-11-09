package com.example.calculatrice;

import android.view.View;
import android.widget.TextView;

public class Add implements Chain{
    private  Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(int num1, int num2, String operation, TextView tw) {

        if(operation.compareTo("+") == 0){

            tw.setText(num1 + num2);
        } else {
            nextInChain.calculate(num1, num2, operation, tw);
        }

    }
}