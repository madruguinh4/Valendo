package com.example.david_pc.valendo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaCadastroCliente extends AppCompatActivity {
    Button btnRegistar,btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastro_cliente);

        btnRegistar = (Button)findViewById(R.id.btnRegistar);
        btnCancelar = (Button)findViewById(R.id.btnCancelar);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltarTelaLogin = new Intent(TelaCadastroCliente.this, TelaLogin.class);
                startActivity(voltarTelaLogin);
            }
        });

        btnRegistar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaPerfil = new Intent(TelaCadastroCliente.this, TelaPerfil.class);
                startActivity(telaPerfil);
            }
        });
    }
}
