package com.example.sistema.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenadorSeleccion implements Ordenador {

    @Override
    public List<Integer> ordenar(List<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j) < lista.get(minIndex)) {
                    minIndex = j;
                }
            }

            int temp = lista.get(minIndex);
            lista.set(minIndex, lista.get(i));
            lista.set(i, temp);
        }
        return lista;
    }
}
