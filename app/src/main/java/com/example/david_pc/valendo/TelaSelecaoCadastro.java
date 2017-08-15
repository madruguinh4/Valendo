package com.example.david_pc.valendo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaSelecaoCadastro extends AppCompatActivity {

    Button btnProcurarServiço,btnPrestarServico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_selecao_cadastro);

        btnProcurarServiço = (Button)findViewById(R.id.btnProcuraServico);
        btnPrestarServico = (Button)findViewById(R.id.btnPrestarServico);

        btnPrestarServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirTelaCadastroPrestador = new Intent(TelaSelecaoCadastro.this, TelaCadastroPrestador.class);
                startActivity(abrirTelaCadastroPrestador);
            }
        });
        btnProcurarServiço.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirTelaCadastroCliente = new Intent(TelaSelecaoCadastro.this, TelaCadastroCliente.class);
                startActivity(abrirTelaCadastroCliente);
            }
        });



      }

}

