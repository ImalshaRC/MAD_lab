package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity{

    TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();

        String num1 = i.getStringExtra(MainActivity.EXTRA_Message1);
        String num2 = i.getStringExtra(MainActivity.EXTRA_Message2);

        txt1 = findViewById(R.id.textView4);
        txt2 = findViewById(R.id.textView5);

        txt1.setText(num1);
        txt2.setText(num2);
    }

    public void sum(View view){

        int val1 = Integer.parseInt(txt1.getText().toString());
        int val2 = Integer.parseInt(txt2.getText().toString());
        int sum = val1 + val2;

        TextView txt3 = findViewById(R.id.textView6);
        txt3.setText(String.valueOf(sum));
    }

    public void sub(View view){

        int val1 = Integer.parseInt(txt1.getText().toString());
        int val2 = Integer.parseInt(txt2.getText().toString());

        TextView txt3 = findViewById(R.id.textView6);

        int subst;
        if(val1 > val2) {
            subst = val1 - val2;
        } else{
            subst = val2 - val1;
        }
        txt3.setText(String.valueOf(subst));
    }

    public void dev(View view){

        int val1 = Integer.parseInt(txt1.getText().toString());
        int val2 = Integer.parseInt(txt2.getText().toString());

        TextView txt3 = findViewById(R.id.textView6);

        int dev;
        if(val1 > val2) {
            dev = val1 / val2;
        } else{
            dev = val2 / val1;
        }
        txt3.setText(String.valueOf(dev));
    }

    public void mul(View view){

        int val1 = Integer.parseInt(txt1.getText().toString());
        int val2 = Integer.parseInt(txt2.getText().toString());

        TextView txt3 = findViewById(R.id.textView6);

        int mul = val1 * val2;

        txt3.setText(String.valueOf(mul));
    }
}