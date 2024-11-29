package com.example.sistema.service.archivos;

import java.io.IOException;

public interface ArchivoEstructuradoManager extends ArchivoManager {
    void escribirRegistro(String key, String valor) throws IOException;

    String leerRegistro(String key) throws IOException;
}
