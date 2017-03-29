package com.example.android.xyz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    private ArrayAdapter<String> adapter1;
    private ArrayAdapter<String> adapter2;
    private ArrayAdapter<String> adapter3;
    private String[] opc1;
    private String[] opc2;
    private String[] opc3;
    private Intent i;
    private Bundle b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaCantidad = (EditText)findViewById(R.id.txtCantidad);

        comboMaterial = (Spinner)findViewById(R.id.cmbMaterial);
        comboDije = (Spinner)findViewById(R.id.cmbDije);
        comboTipo = (Spinner)findViewById(R.id.cmbTipo);

        i = new Intent(this, VALOR.class);

        b = new Bundle();

        opc1 =this.getResources().getStringArray(R.array.material);
        adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc1);
        comboMaterial.setAdapter(adapter1);

        opc2 =this.getResources().getStringArray(R.array.dije);
        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc2);
        comboDije.setAdapter(adapter2);

        opc3 =this.getResources().getStringArray(R.array.tipo);
        adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc3);
        comboTipo.setAdapter(adapter3);
    }


    public boolean validar(){
        if(cajaCantidad.getText().toString().isEmpty()){
            cajaCantidad.setError(getResources().getString(R.string.error_1));
            return false;
        }
        return true;
    }

    public void Costos(View v){
        int cantidad;
        int costo;
        String  material, dije, tipo, moneda = "";
        if(validar()==true){

            cantidad = Integer.parseInt(cajaCantidad.getText().toString());
            material = comboMaterial.getSelectedItem().toString();
            dije = comboDije.getSelectedItem().toString();
            tipo = comboTipo.getSelectedItem().toString();

            if(r1.isChecked()) moneda = getResources().getString(R.string.pesos);
            if(r1.isChecked()) moneda = getResources().getString(R.string.dolares);


                    if(material == getResources().getString(R.string.cuero) && dije == getResources().getString(R.string.martillo) && (tipo == getResources().getString(R.string.oro)||tipo == getResources().getString(R.string.oro_rosado)) && moneda ==getResources().getString(R.string.pesos)){
                        costo = cantidad * 100 * 3200;
                        b.putInt("costo", costo);


                    }else if(material == getResources().getString(R.string.cuero) && dije == getResources().getString(R.string.martillo) && (tipo == getResources().getString(R.string.oro)||tipo == getResources().getString(R.string.oro_rosado)) && moneda ==getResources().getString(R.string.dolares)) {
                        costo = cantidad * 100;
                        b.putInt("costo", costo);

                    }

                    if(material == getResources().getString(R.string.cuero) && dije == getResources().getString(R.string.martillo) && (tipo == getResources().getString(R.string.plata)) && moneda ==getResources().getString(R.string.pesos)){
                        costo = cantidad * 80 * 3200;
                        b.putInt("costo", costo);

                    }else if(material == getResources().getString(R.string.cuero) && dije == getResources().getString(R.string.martillo) && (tipo == getResources().getString(R.string.plata)) && moneda ==getResources().getString(R.string.dolares)) {
                        costo = cantidad * 80;
                        b.putInt("costo", costo);

                    }

                    if(material == getResources().getString(R.string.cuero) && dije == getResources().getString(R.string.martillo) && (tipo == getResources().getString(R.string.niquel)) && moneda ==getResources().getString(R.string.pesos)){
                        costo = cantidad * 70 * 3200;
                        b.putInt("costo", costo);

                    }else if(material == getResources().getString(R.string.cuero) && dije == getResources().getString(R.string.martillo) && (tipo == getResources().getString(R.string.niquel)) && moneda ==getResources().getString(R.string.dolares)) {
                        costo = cantidad * 70;
                        b.putInt("costo", costo);

                    }

                    if(material == getResources().getString(R.string.cuero) && dije == getResources().getString(R.string.ancla) && (tipo == getResources().getString(R.string.oro)||tipo == getResources().getString(R.string.oro_rosado)) && moneda ==getResources().getString(R.string.pesos)){
                        costo = cantidad * 120 * 3200;
                        b.putInt("costo", costo);

                    }else if(material == getResources().getString(R.string.cuero) && dije == getResources().getString(R.string.ancla) && (tipo == getResources().getString(R.string.oro)||tipo == getResources().getString(R.string.oro_rosado)) && moneda ==getResources().getString(R.string.dolares)) {
                        costo = cantidad * 120;
                        b.putInt("costo", costo);

                    }

                    if(material == getResources().getString(R.string.cuero) && dije == getResources().getString(R.string.ancla) && (tipo == getResources().getString(R.string.plata)) && moneda ==getResources().getString(R.string.pesos)){
                        costo = cantidad * 100 * 3200;
                        b.putInt("costo", costo);

                    }else if(material == getResources().getString(R.string.cuero) && dije == getResources().getString(R.string.ancla) && (tipo == getResources().getString(R.string.plata)) && moneda ==getResources().getString(R.string.dolares)) {
                        costo = cantidad * 100;
                        b.putInt("costo", costo);

                    }

                    if(material == getResources().getString(R.string.cuero) && dije == getResources().getString(R.string.ancla) && (tipo == getResources().getString(R.string.niquel)) && moneda ==getResources().getString(R.string.pesos)){
                        costo = cantidad * 90 * 3200;
                        b.putInt("costo", costo);

                    }else if(material == getResources().getString(R.string.cuero) && dije == getResources().getString(R.string.ancla) && (tipo == getResources().getString(R.string.niquel)) && moneda ==getResources().getString(R.string.dolares)) {
                        costo = cantidad * 90;
                        b.putInt("costo", costo);

                    }

                    if(material == getResources().getString(R.string.cuerda) && dije == getResources().getString(R.string.martillo) && (tipo == getResources().getString(R.string.oro)||tipo == getResources().getString(R.string.oro_rosado)) && moneda ==getResources().getString(R.string.pesos)){
                        costo = cantidad * 90 * 3200;
                        b.putInt("costo", costo);

                    }else if(material == getResources().getString(R.string.cuero) && dije == getResources().getString(R.string.ancla) && (tipo == getResources().getString(R.string.oro)||tipo == getResources().getString(R.string.oro_rosado)) && moneda ==getResources().getString(R.string.dolares)) {
                        costo = cantidad * 90;
                        b.putInt("costo", costo);

                    }

            i.putExtras(b);
            startActivity(i);


        }
    }


}
