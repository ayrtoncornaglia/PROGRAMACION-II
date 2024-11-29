package com.example.sistema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioOrdenamiento {

    @Autowired
    private OrdenadorBurbuja ordenadorBurbuja;

    @Autowired
    private OrdenadorInsercion ordenadorInsercion;

    @Autowired
    private OrdenadorSeleccion ordenadorSeleccion;

    @Autowired
    private OrdenadorMezcla ordenadorMezcla;

    @Autowired
    private OrdenadorRapida ordenadorRapida;

    public List<Integer> ordenar(String metodo, List<Integer> lista) {
        switch (metodo) {
            case "burbuja":
                return ordenadorBurbuja.ordenar(lista);
            case "insercion":
                return ordenadorInsercion.ordenar(lista);
            case "seleccion":
                return ordenadorSeleccion.ordenar(lista);
            case "mezcla":
                return ordenadorMezcla.ordenar(lista);
            case "rapida":
                return ordenadorRapida.ordenar(lista);
            default:
                throw new IllegalArgumentException("Método no válido");
        }
    }
}
