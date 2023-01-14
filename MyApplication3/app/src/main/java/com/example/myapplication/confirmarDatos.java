package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class confirmarDatos extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvFecha;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;
    private Button btnEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros = getIntent().getExtras();

        String nombre       = parametros.getString(getResources().getString(R.string.pnombre));
        String fecha        = parametros.getString(getResources().getString(R.string.pfecha));
        String telefono     = parametros.getString(getResources().getString(R.string.ptelefono));
        String email        = parametros.getString(getResources().getString(R.string.pemail));
        String descripcion  = parametros.getString(getResources().getString(R.string.pdescripcion));

        tvNombre        = findViewById(R.id.tvNombre);
        tvFecha         = findViewById(R.id.tvFecha);
        tvTelefono      = findViewById(R.id.tvTelefono);
        tvEmail         = findViewById(R.id.tvEmail);
        tvDescripcion   = findViewById(R.id.tvDescripcion);

        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);

        btnEditar = findViewById(R.id.btnEditar);

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}