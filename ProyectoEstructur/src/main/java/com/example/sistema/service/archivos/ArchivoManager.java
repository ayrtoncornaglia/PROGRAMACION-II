package com.example.sistema.service.archivos;

import java.io.IOException;

public interface ArchivoManager {
    void abrir(String ruta) throws IOException;

    String leer() throws IOException;

    void escribir(String contenido) throws IOException;

    void cerrar() throws IOException;
}
