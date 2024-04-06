package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static EditText dato1;
    private static EditText dato2;
    private static EditText dato3;
    private static EditText dato4;
    private TextView respuesta;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dato1 = findViewById(R.id.dato1);
        dato2 = findViewById(R.id.dato2);
        dato3 = findViewById(R.id.dato3);
        dato4 = findViewById(R.id.dato4);
        respuesta = findViewById(R.id.textView);
    }

    public void software(View view) {
        String nombre = dato1.getText().toString();
        String apellido = dato2.getText().toString();
        String cedula = dato3.getText().toString();
        String fnacimiento = dato4.getText().toString();


        if (nombre.isEmpty() && apellido.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (nombre.isEmpty() && cedula.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!nombre.isEmpty() && fnacimiento.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!apellido.isEmpty() && !cedula.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!apellido.isEmpty() && !fnacimiento.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!cedula.isEmpty() && !fnacimiento.isEmpty()) {
            respuesta.setText("Digite Datos");
        }
    }

    public void empresas(View view) {
        String nombre = dato1.getText().toString();
        String apellido = dato2.getText().toString();
        String cedula = dato3.getText().toString();
        String fnacimiento = dato4.getText().toString();


        if (nombre.isEmpty() && apellido.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (nombre.isEmpty() && cedula.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!nombre.isEmpty() && fnacimiento.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!apellido.isEmpty() && !cedula.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!apellido.isEmpty() && !fnacimiento.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!cedula.isEmpty() && !fnacimiento.isEmpty()) {
            respuesta.setText("Digite Datos");
        }
    }

    public void negocios(View view) {
        String nombre = dato1.getText().toString();
        String apellido = dato2.getText().toString();
        String cedula = dato3.getText().toString();
        String fnacimiento = dato4.getText().toString();


        if (nombre.isEmpty() && apellido.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (nombre.isEmpty() && cedula.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!nombre.isEmpty() && fnacimiento.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!apellido.isEmpty() && !cedula.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!apellido.isEmpty() && !fnacimiento.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!cedula.isEmpty() && !fnacimiento.isEmpty()) {
            respuesta.setText("Digite Datos");
        }
    }

    public void gastronomia(View view) {
        String nombre = dato1.getText().toString();
        String apellido = dato2.getText().toString();
        String cedula = dato3.getText().toString();
        String fnacimiento = dato4.getText().toString();


        if (nombre.isEmpty() && apellido.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (nombre.isEmpty() && cedula.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!nombre.isEmpty() && fnacimiento.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!apellido.isEmpty() && !cedula.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!apellido.isEmpty() && !fnacimiento.isEmpty()) {
            respuesta.setText("Digite Datos");
        } else if (!cedula.isEmpty() && !fnacimiento.isEmpty()) {
            respuesta.setText("Digite Datos");
        }
    }
}
