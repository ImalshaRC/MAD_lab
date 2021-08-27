package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_Message1 = "com.example.calculate1";
    public static final String EXTRA_Message2 = "com.example.calculate2";

    EditText edt1;
    EditText edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ok(View view){
        Intent i = new Intent(this, secondActivity.class);

        edt1 = (EditText) findViewById(R.id.editText1);
        edt2 = (EditText) findViewById(R.id.editText2);

        String val1 = edt1.getText().toString();
        String val2 = edt2.getText().toString();

        i.putExtra(EXTRA_Message1, val1);
        i.putExtra(EXTRA_Message2, val2);
        startActivity(i);

        Context context = getApplicationContext();
        CharSequence message = "Your values successfully passed..";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    public void pass(View view){
        Intent i2 = new Intent(this, mad9.class);
        startActivity(i2);
    }
}