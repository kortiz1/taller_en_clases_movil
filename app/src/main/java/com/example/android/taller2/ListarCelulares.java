package com.example.android.taller2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Android on 26/09/2017.
 */

public class ListarCelulares extends AppCompatActivity {

    private TableLayout tabla;
    private ArrayList<Celular> celulares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_personas);
        tabla = (TableLayout) findViewById(R.id.tabla);
        celulares = Datos.obtener();

        for (int i = 0; i < celulares.size(); i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);

            c1.setText("" + (i + 1));
            c2.setText(celulares.get(i).getMarca());
            c4.setText(celulares.get(i).getColor());
            c3.setText(celulares.get(i).getRams());
            c5.setText(celulares.get(i).getSistemas());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            fila.addView(c5);

            tabla.addView(fila);


        }

    }
}
