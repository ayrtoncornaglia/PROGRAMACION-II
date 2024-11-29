package com.example.sistema.service.archivos;

import java.io.IOException;

public class ManejoRebalse {

    /**
     * Maneja el rebalse de un archivo indexado.
     * En este caso, decide realizar un encadenamiento o una reubicación de registros.
     *
     * @param archivoManager El gestor de archivos.
     * @param clave La clave del registro que está causando el rebalse.
     * @param valor El valor que se va a almacenar.
     * @throws IOException En caso de error en el manejo del archivo.
     */
    public static void manejarRebalse(ArchivoManager archivoManager, String clave, String valor) throws IOException {
        // Verifica si el archivoManager es una instancia de ArchivoIndexadoManager
        if (archivoManager instanceof ArchivoIndexadoManager) {
            // Realiza el encadenamiento si es un archivo indexado
            ArchivoIndexadoManager archivoIndexadoManager = (ArchivoIndexadoManager) archivoManager;
            archivoIndexadoManager.encadenarRegistro(clave, valor);
        } else {
            // Si no es un archivo indexado, podrías manejar el rebalse de otra manera
            System.out.println("El archivo no es indexado, no se puede realizar encadenamiento.");
        }
    }
}

