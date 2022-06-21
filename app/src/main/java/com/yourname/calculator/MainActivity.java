package com.yourname.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ent1;
    private EditText ent2;
    private TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ent1 = (EditText) findViewById(R.id.En1);
        ent2 = (EditText) findViewById(R.id.Ent2);
        Result = (TextView) findViewById(R.id.Result);
    }

    public void btnsum(View view) {
        int n1 = Integer.parseInt(ent1.getText().toString());
        int n2 = Integer.parseInt(ent2.getText().toString());
        int sum = n1 + n2;
        Result.setText(String.valueOf(sum));


    }

    public void btnsub(View view) {
        int n1 = Integer.parseInt(ent1.getText().toString());
        int n2 = Integer.parseInt(ent2.getText().toString());
        int sub = n1 - n2;
        Result.setText(String.valueOf(sub));
    }


    public void btnmul(View view) {
        int n1 = Integer.parseInt(ent1.getText().toString());
        int n2 = Integer.parseInt(ent2.getText().toString());
        int mul = n1 * n2;
        Result.setText(String.valueOf(mul));
    }

    public void btndiv(View view) {
        int n1 = Integer.parseInt(ent1.getText().toString());
        int n2 = Integer.parseInt(ent2.getText().toString());
        int div = n1/n2;
        Result.setText(String.valueOf(div));
    }
}