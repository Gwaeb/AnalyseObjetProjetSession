package com.example.calculatrice;

import android.widget.TextView;

public abstract class AChain {
    protected AChain nextInChain;
    protected float result;

    public AChain getNextChain(){
        return nextInChain;
    }

    public float getResult(){
        return result;
    }

    public void setNextChain(AChain nextChain) {
        nextInChain = nextChain;
    }

    public abstract void calculate(int num1, int num2, String request, TextView tw);
}
