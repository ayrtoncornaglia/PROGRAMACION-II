package com.example.sistema.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdenadorRapida implements Ordenador {

    @Override
    public List<Integer> ordenar(List<Integer> lista) {
        if (lista.size() <= 1) {
            return lista;
        }

        int pivot = lista.get(lista.size() / 2);
        List<Integer> menores = new ArrayList<>();
        List<Integer> iguales = new ArrayList<>();
        List<Integer> mayores = new ArrayList<>();

        for (int num : lista) {
            if (num < pivot) {
                menores.add(num);
            } else if (num == pivot) {
                iguales.add(num);
            } else {
                mayores.add(num);
            }
        }

        List<Integer> resultado = new ArrayList<>();
        resultado.addAll(ordenar(menores));
        resultado.addAll(iguales);
        resultado.addAll(ordenar(mayores));

        return resultado;
    }
}

