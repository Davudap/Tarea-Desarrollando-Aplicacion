package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String nombre;
    private String fecha;
    private String telefono;
    private String email;
    private String descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNombre       = (EditText) findViewById(R.id.etNombre);
        DatePicker picker       = (DatePicker)findViewById(R.id.datePicker);
        EditText etTelefono     = (EditText) findViewById(R.id.etTelefono);
        EditText etEmail        = (EditText) findViewById(R.id.etEmail);
        EditText etDescripcion  = (EditText) findViewById(R.id.etDescripcion);

        Button btnSiguiente = (Button) findViewById(R.id.btnSiguiente);



        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Al hacer click obtengo los datos de los EditText
                nombre = etNombre.getText().toString();
                fecha = picker.getDayOfMonth()+"/"+ (picker.getMonth() + 1)+"/"+picker.getYear();
                telefono = etTelefono.getText().toString();
                email = etEmail.getText().toString();
                descripcion = etDescripcion.getText().toString();

                Intent intent = new Intent(MainActivity.this, confirmarDatos.class);

                intent.putExtra(getResources().getString(R.string.pnombre), nombre);
                intent.putExtra(getResources().getString(R.string.pfecha), fecha);
                intent.putExtra(getResources().getString(R.string.ptelefono), telefono);
                intent.putExtra(getResources().getString(R.string.pemail), email);
                intent.putExtra(getResources().getString(R.string.pdescripcion), descripcion);

                startActivity(intent);
            }
        });

    }
}