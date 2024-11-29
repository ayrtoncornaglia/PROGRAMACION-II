package com.example.sistema.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdenadorMezcla implements Ordenador {

    @Override
    public List<Integer> ordenar(List<Integer> lista) {
        if (lista.size() <= 1) {
            return lista;
        }

        int mid = lista.size() / 2;
        List<Integer> izquierda = ordenar(new ArrayList<>(lista.subList(0, mid)));
        List<Integer> derecha = ordenar(new ArrayList<>(lista.subList(mid, lista.size())));

        return merge(izquierda, derecha);
    }

    private List<Integer> merge(List<Integer> izquierda, List<Integer> derecha) {
        List<Integer> resultado = new ArrayList<>();
        int i = 0, j = 0;

        while (i < izquierda.size() && j < derecha.size()) {
            if (izquierda.get(i) <= derecha.get(j)) {
                resultado.add(izquierda.get(i));
                i++;
            } else {
                resultado.add(derecha.get(j));
                j++;
            }
        }

        resultado.addAll(izquierda.subList(i, izquierda.size()));
        resultado.addAll(derecha.subList(j, derecha.size()));

        return resultado;
    }
}
