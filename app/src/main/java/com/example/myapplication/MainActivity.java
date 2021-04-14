package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtEquipo1,txtEquipo2,txtPuntajeE1,txtPuntajeE2;
    Button btnSumar1E1,btnSumar2E1,btnSumar3E1,btnSumar1E2,btnSumar2E2,btnSumar3E2;
    int acumulador1,acumulador2;
    Switch swCambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        referenciar();
        btnSumar1E1 = findViewById(R.id.btnSumar1E1);
    }
    private void referenciar() {
        btnSumar1E1 = findViewById(R.id.btnSumar1E1);
        btnSumar1E1.setOnClickListener(this);
        btnSumar2E1 = findViewById(R.id.btnSumar2E1);
        btnSumar2E1.setOnClickListener(this);
        btnSumar3E1 = findViewById(R.id.btnSumar3E1);
        btnSumar3E1.setOnClickListener(this);
        btnSumar1E2 = findViewById(R.id.btnSumar1E2);
        btnSumar1E2.setOnClickListener(this);
        btnSumar2E2 = findViewById(R.id.btnSumar2E2);
        btnSumar2E2.setOnClickListener(this);
        btnSumar3E2 = findViewById(R.id.btnSumar3E2);
        btnSumar3E2.setOnClickListener(this);
        swCambio =  findViewById(R.id.CambioProceso);
        swCambio.setOnClickListener(this);
        txtEquipo1 = findViewById(R.id.txtEquipo1);
        txtEquipo2 = findViewById(R.id.txtEquipo2);
        txtPuntajeE1 = findViewById(R.id.txtAcumuladorEquipo1);
        txtPuntajeE2 = findViewById(R.id.txtAcumuladorEquipo2);
    }


    @Override
    public void onClick(View v) {
        if (swCambio.isChecked()){
            swCambio.setText(R.string.resta);
            btnSumar1E1.setText(R.string.resta1);
            btnSumar2E1.setText(R.string.resta2);
            btnSumar3E1.setText(R.string.resta3);
            btnSumar1E2.setText(R.string.resta1);
            btnSumar2E2.setText(R.string.resta2);
            btnSumar3E2.setText(R.string.resta3);
            switch (v.getId()) {
                case R.id.btnSumar1E1:
                    acumulador1 = acumulador1 - 1;
                    if (acumulador1<0){
                        acumulador1=0;
                    }
                    txtPuntajeE1.setText(String.valueOf(acumulador1));
                    break;
                case R.id.btnSumar2E1:
                    acumulador1 = acumulador1 - 2;
                    if (acumulador1<0){
                        acumulador1=0;
                    }
                    txtPuntajeE1.setText(String.valueOf(acumulador1));
                    break;
                case R.id.btnSumar3E1:
                    acumulador1 = acumulador1 - 3;
                    if (acumulador1<0){
                        acumulador1=0;
                    }
                    txtPuntajeE1.setText(String.valueOf(acumulador1));
                    break;
                case R.id.btnSumar1E2:
                    acumulador2 = acumulador2 - 1;
                    if (acumulador2<0){
                        acumulador2=0;
                    }
                    txtPuntajeE2.setText(String.valueOf(acumulador2));
                    break;
                case R.id.btnSumar2E2:
                    acumulador2 = acumulador2 - 2;
                    if (acumulador2<0){
                        acumulador2=0;
                    }
                    txtPuntajeE2.setText(String.valueOf(acumulador2));
                    break;
                case R.id.btnSumar3E2:
                    acumulador2 = acumulador2 - 3;
                    if (acumulador2<0){
                        acumulador2=0;
                    }
                    txtPuntajeE2.setText(String.valueOf(acumulador2));
                    break;
            }
        }else {
            swCambio.setText(R.string.suma);
            btnSumar1E1.setText(R.string.sumar1);
            btnSumar2E1.setText(R.string.sumar2);
            btnSumar3E1.setText(R.string.sumar3);
            btnSumar1E2.setText(R.string.sumar1);
            btnSumar2E2.setText(R.string.sumar2);
            btnSumar3E2.setText(R.string.sumar3);
            switch (v.getId()) {
                case R.id.btnSumar1E1:
                    acumulador1 = acumulador1 + 1;
                    txtPuntajeE1.setText(String.valueOf(acumulador1));
                    break;
                case R.id.btnSumar2E1:
                    acumulador1 = acumulador1 + 2;
                    txtPuntajeE1.setText(String.valueOf(acumulador1));
                    break;
                case R.id.btnSumar3E1:
                    acumulador1 = acumulador1 + 3;
                    txtPuntajeE1.setText(String.valueOf(acumulador1));
                    break;
                case R.id.btnSumar1E2:
                    acumulador2 = acumulador2 + 1;
                    txtPuntajeE2.setText(String.valueOf(acumulador2));
                    break;
                case R.id.btnSumar2E2:
                    acumulador2 = acumulador2 + 2;
                    txtPuntajeE2.setText(String.valueOf(acumulador2));
                    break;
                case R.id.btnSumar3E2:
                    acumulador2 = acumulador2 + 3;
                    txtPuntajeE2.setText(String.valueOf(acumulador2));
                    break;
            }
        }
    }
}