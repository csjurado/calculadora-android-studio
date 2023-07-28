package com.csjurado.a12545;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText input1,input2;
    private TextView resultadoTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1=(EditText) findViewById(R.id.input1);
        input2=(EditText) findViewById(R.id.input2);
        resultadoTxt=(TextView) findViewById(R.id.resultadoTxt);

    }
    public void sumar(View view){
        String valor1=input1.getText().toString();
        String valor2=input2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);
        int suma = n1+n2;
        String result = String.valueOf(suma);
        resultadoTxt.setText(result);
    }

    public void restar(View view){
        String valor1=input1.getText().toString();
        String valor2=input2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);
        int restar = n1-n2;
        String result = String.valueOf(restar);
        resultadoTxt.setText(result);
    }
    public void mutiplicacion(View view){
        String valor1=input1.getText().toString();
        String valor2=input2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);
        int mutiplicacion = n1 * n2;
        String result = String.valueOf(mutiplicacion);
        resultadoTxt.setText(result);
    }
    public void division(View view){
        String valor1=input1.getText().toString();
        String valor2=input2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);
        int division = n1 / n2;
        String result = String.valueOf(division);
        resultadoTxt.setText(result);
    }

    public void seno(View view){
        String valor1=input1.getText().toString();
        String valor2=input2.getText().toString();
        double n1=Double.parseDouble(valor1);
        int n2 = Integer.parseInt(valor2);
        double seno = Math.sin(n1);
        String result = String.valueOf(seno);
        resultadoTxt.setText(result);
    }
}