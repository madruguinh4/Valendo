package com.example.david_pc.valendo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class FragmentBuscarServico extends Fragment {
    private View telaBuscarServico;
    private ListView lista;
    private ArrayList<String> servicos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       telaBuscarServico = inflater.inflate(R.layout.fragment_buscar_servico, container, false);

        servicos = new ArrayList<>();
        lista = (ListView) telaBuscarServico.findViewById(R.id.ListServicos);
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, servicos);
        lista.setAdapter(adapter);

        Array[] testes = new Array [10];

        for (int i = 0; i < testes.length; i ++) {
            int count = 0;
            servicos.add("Servicos   " + i);

        }



        return telaBuscarServico;

    }
}
