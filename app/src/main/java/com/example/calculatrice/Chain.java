package com.example.calculatrice;

import android.widget.TextView;

public interface Chain {

    public void setNextChain(Chain nextChain);

    public void calculate(int num1, int num2, String request, TextView tw);

}
