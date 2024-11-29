package com.example.sistema.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenadorBurbuja implements Ordenador {

    @Override
    public List<Integer> ordenar(List<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
        return lista;
    }
}
