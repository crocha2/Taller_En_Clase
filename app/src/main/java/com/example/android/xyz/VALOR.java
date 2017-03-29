package com.example.android.xyz;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VALOR extends AppCompatActivity {

    private TextView costo;
    private Bundle b;
    private int costo2;
    private double aux;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valor);

        costo = (TextView)findViewById(R.id.txtCosto);
        b = getIntent().getExtras();
        costo2 = b.getInt("costo");
        res = this.getResources();
        aux = costo2;

        costo.setText((int) aux);
    }
}
