package com.example.apppractica01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnSaludo;
    private Button btnLimpiar;
    private Button btnCerrar;
    private EditText txtNombre;
    private TextView lblSaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaludo = (Button) findViewById(R.id.btnSaludo);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnCerrar = (Button) findViewById(R.id.btnCerrar);
        lblSaludo = (TextView) findViewById(R.id.lblSaludo);
        txtNombre = (EditText) findViewById(R.id.txtSaludo);

        btnSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtNombre.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this,"Favor de ingresar el nombre", Toast.LENGTH_SHORT).show();
                }else{
                    String txtSaludar = txtNombre.getText().toString();
                    lblSaludo.setText("Hola "+ txtSaludar +" ¿Cómo estás? :D");
                }
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtNombre.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this,"No hay datos para borrar", Toast.LENGTH_SHORT).show();
                }else{
                    lblSaludo.setText("");
                    txtNombre.setText("");
                    Toast.makeText(MainActivity.this,"Datos borrados :D", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }
}