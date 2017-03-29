package com.example.android.xyz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Principal extends AppCompatActivity {

    private EditText cajaCantidad;
    private Spinner comboMaterial;
    private Spinner comboDije;
    private Spinner comboTipo;
    private RadioButton r1, r2;
    private ArrayAdapter<String> adapter;
    private String[] opc;
    private Intent i;
    private Bundle b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaCantidad = (EditText)findViewById(R.id.txtCantidad);

        comboMaterial = (Spinner)findViewById(R.id.cmbMaterial);
        comboDije = (Spinner)findViewById()

    }
}
