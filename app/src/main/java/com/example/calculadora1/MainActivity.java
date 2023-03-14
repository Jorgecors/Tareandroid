package com.example.calculadora1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero1, numero2;
    TextView resultadoSuma, resultadoMultiplicacion;
    Button botonCalcular;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        resultadoSuma = findViewById(R.id.resultado_suma);
        resultadoMultiplicacion = findViewById(R.id.resultado_multiplicacion);
        botonCalcular = findViewById(R.id.boton_calcular);

        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int suma = n1 + n2;
                int multiplicacion = n1 * n2;
                resultadoSuma.setText("Suma: " + suma);
                resultadoMultiplicacion.setText("Multiplicación: " + multiplicacion);
            }
        });
    }
}