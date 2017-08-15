package com.example.david_pc.valendo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class FragmentTelaServicosAgendados extends Fragment {
    private View telaServicosAgendados;
    private ListView servicosAgendados;
    private ArrayList<String> ArrayservicosAgendados;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        telaServicosAgendados = inflater.inflate(R.layout.fragment_tela_servicos_agendados, container, false);

        ArrayservicosAgendados = new ArrayList<>();
        servicosAgendados = (ListView) telaServicosAgendados.findViewById(R.id.ListviewServicosAgendandos);
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, ArrayservicosAgendados);
        servicosAgendados.setAdapter(adapter);

        Array[] testes = new Array[15];

        for (int i = 0; i < testes.length; i++) {
           ArrayservicosAgendados.add("Servicos Agendandos  " + i);
        }
        servicosAgendados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), TelaLogin.class);
                startActivity(intent);
            }
        });



        return  telaServicosAgendados;
    }

}
