package com.example.demomenuty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DatosActivity extends AppCompatActivity implements View.OnClickListener {

    Spinner spinnerMeses, spinnerAlumno;
    Button buttonMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);


        // spinner meses
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril"};

        spinnerMeses = findViewById(R.id.spinnerMeses);

        ArrayAdapter adapterMeses = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, meses);

        spinnerMeses.setAdapter(adapterMeses);

        // spinner alumnos
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan", "Perez", "Toay"));
        alumnos.add(new Alumno("Jose", "Perez", "Toay"));
        alumnos.add(new Alumno("Maria", "Lopez", "Santa Rosa"));
        alumnos.add(new Alumno("Andres", "Soto", "General Acha"));

        spinnerAlumno = findViewById(R.id.spinnerAlumnos);

        ArrayAdapter adapterAlumnos = new ArrayAdapter(this , R.layout.support_simple_spinner_dropdown_item, alumnos);

        spinnerAlumno.setAdapter(adapterAlumnos);

        // boton mostrar
        buttonMostrar = findViewById(R.id.buttonMostrar);
        buttonMostrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonMostrar:
                String mensaje = spinnerAlumno.getSelectedItem().toString() + " " + spinnerMeses.getSelectedItem().toString();
                Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
        }

    }
}
