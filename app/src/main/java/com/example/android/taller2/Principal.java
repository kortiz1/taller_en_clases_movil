package com.example.android.taller2;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {



    private Spinner marca;
    private Spinner color;
    private Spinner capacidad;
    private Spinner sistema;

    private String op[];
    private Resources resources;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        marca = (Spinner) findViewById(R.id.cmbMarca);
        resources = this.getResources();
        op = resources.getStringArray(R.array.marcas);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op);
        marca.setAdapter(adapter);

        color = (Spinner) findViewById(R.id.cmbColor);
        op = resources.getStringArray(R.array.colores);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op);
        color.setAdapter(adapter1);

        capacidad = (Spinner) findViewById(R.id.cmbRam);
        op = resources.getStringArray(R.array.rams);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op);
        capacidad.setAdapter(adapter2);

        sistema = (Spinner) findViewById(R.id.cmbOs);
        op = resources.getStringArray(R.array.sistemas);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op);
        sistema.setAdapter(adapter3);
    }

    public void guardar(View v){
        String mar,col,ram,os;
        mar = marca.getSelectedItem().toString();
        col = color.getSelectedItem().toString();
        ram = capacidad.getSelectedItem().toString();
        os = sistema.getSelectedItem().toString();

    }

}
