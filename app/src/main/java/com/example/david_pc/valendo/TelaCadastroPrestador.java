package com.example.david_pc.valendo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaCadastroPrestador extends AppCompatActivity {
    Button btnProximo, btnCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastro_prestador);

        btnCancelar = (Button)findViewById(R.id.btnCancelar);
        btnProximo = (Button)findViewById(R.id.btnProximo);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltarTelaLogin = new Intent(TelaCadastroPrestador.this, TelaLogin.class);
                startActivity(voltarTelaLogin);
            }
        });
        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaTelaSelecionaServico = new Intent(TelaCadastroPrestador.this, TelaSelecionaServicoPrestador.class);
                startActivity(irParaTelaSelecionaServico);
            }
        });
    }
}
