package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private AChain c1;
    private AChain c2;
    private AChain c3;
    private AChain c4;

    private EditText et1;
    private EditText et2;

    private String operation;

    private TextView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner =  findViewById(R.id.theSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.choice, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        c1 = new Add();
        c2 = new Substract();
        c3 = new Multiply();
        c4 = new Divide();

        et1 = findViewById(R.id.inputNumber1);
        et2 = findViewById(R.id.inputNumber2);
        tw = findViewById(R.id.result);

        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        operation = adapterView.getItemAtPosition(i).toString();
    }

    public void Calculate(View v){

        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());


        c1.calculate(num1, num2, operation, tw);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {}
}