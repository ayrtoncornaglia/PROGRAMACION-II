package com.example.sistema.controller;

import com.example.sistema.service.ServicioArchivos;
import com.example.sistema.service.archivos.ManejoRebalse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArchivoController {

    @Autowired
    private ServicioArchivos servicioArchivos;

    /**
     * Muestra la página de opciones de archivos.
     */
    @GetMapping("/opciones")
    public String mostrarOpciones(Model model) {
        model.addAttribute("opciones", new String[]{
            "Método de Ordenamiento por Burbuja",
            "Método de Ordenamiento por Inserción",
            "Método de Ordenamiento por Selección",
            "Método de Ordenamiento por Mezcla",
            "Método de Ordenamiento por Rápida",
            "Leer/Escribir Archivo de Texto",
            "Leer/Escribir Archivo Binario",
            "Leer/Escribir Archivo Indexado"
        });
        return "opciones";
    }

    /**
     * Realiza una acción según la opción seleccionada por el usuario.
     */
    @PostMapping("/ejecutar")
    public String ejecutarAccion(@RequestParam String accion, Model model) throws Exception {
        switch (accion) {
            case "Método de Ordenamiento por Burbuja":
                // Llamar a la lógica del ordenamiento por burbuja
                break;
            case "Método de Ordenamiento por Inserción":
                // Llamar a la lógica del ordenamiento por inserción
                break;
            case "Método de Ordenamiento por Selección":
                // Llamar a la lógica del ordenamiento por selección
                break;
            case "Método de Ordenamiento por Mezcla":
                // Llamar a la lógica del ordenamiento por mezcla
                break;
            case "Método de Ordenamiento por Rápida":
                // Llamar a la lógica del ordenamiento rápida
                break;
            case "Leer/Escribir Archivo de Texto":
                // Llamar a la lógica de archivos de texto
                break;
            case "Leer/Escribir Archivo Binario":
                // Llamar a la lógica de archivos binarios
                break;
            case "Leer/Escribir Archivo Indexado":
                // Llamar a la lógica de archivos indexados
                break;
            default:
                model.addAttribute("mensaje", "Acción no soportada.");
                return "resultado";
        }
        model.addAttribute("mensaje", "Acción ejecutada con éxito.");
        return "resultado";
    }
}
