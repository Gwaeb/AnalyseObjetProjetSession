package com.example.calculatrice;

import android.widget.TextView;

public class Divide implements Chain{
    private  Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(int num1, int num2, String operation, TextView tw) {

        if (operation.compareTo("/") == 0) {

            tw.setText(num1 / num2 +"");
        } else {
            tw.setText("Not able to do it");
        }

    }
}
