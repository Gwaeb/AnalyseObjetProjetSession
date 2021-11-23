package com.example.calculatrice;

import android.widget.TextView;

public class Divide extends AChain {

    @Override
    public void calculate(int num1, int num2, String operation, TextView tw) {

        if (operation.compareTo("/") == 0) {
            result = num1/num2;
            tw.setText(result +"");
        } else {
            tw.setText("Not able to calculate this");
        }

    }
}
