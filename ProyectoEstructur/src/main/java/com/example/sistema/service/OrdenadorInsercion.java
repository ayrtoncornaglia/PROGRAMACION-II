package com.example.sistema.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenadorInsercion implements Ordenador {

    @Override
    public List<Integer> ordenar(List<Integer> lista) {
        for (int i = 1; i < lista.size(); i++) {
            int key = lista.get(i);
            int j = i - 1;

            while (j >= 0 && lista.get(j) > key) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, key);
        }
        return lista;
    }
}
