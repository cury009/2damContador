package com.example.a2damcontador;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String EXTRA_CONTADOR = "nombre";
    private TextView txt_contador = null;
    private int cont;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(EXTRA_CONTADOR, cont);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_contador = findViewById(R.id.txt_contador);
        cont = 0;
    }

    public void incrementarContador(View view) {
        cont++;
        if (cont == 100) {
            txt_contador.setTextSize(150);
        }
        String nuevoNumero = String.valueOf(cont);
        txt_contador.setText(nuevoNumero);
    }
}