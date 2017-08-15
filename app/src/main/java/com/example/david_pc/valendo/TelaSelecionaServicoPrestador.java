package com.example.david_pc.valendo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class TelaSelecionaServicoPrestador extends AppCompatActivity {

    Spinner spn;
    Spinner spn1;
    Spinner spn2;
    Spinner spn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_seleciona_servico_prestador);
        List<String> opcao = new ArrayList<String>();
        opcao.add("Cabelereiro");
        opcao.add("Pedreiro");
        opcao.add("Pintor");
        opcao.add("Encanador");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, opcao);


        spn = (Spinner)findViewById(R.id.spnTelaSeleciona_Servico_Prestador1);
        spn1 = (Spinner)findViewById(R.id.spnTelaSeleciona_Servico_Prestador2);
        spn2 = (Spinner)findViewById(R.id.spnTelaSeleciona_Servico_Prestador3);
        spn3 = (Spinner)findViewById(R.id.spnTelaSeleciona_Servico_Prestador4);
        spn.setAdapter(adapter);
        spn1.setAdapter(adapter);
        spn2.setAdapter(adapter);
        spn3.setAdapter(adapter);

    }
}
