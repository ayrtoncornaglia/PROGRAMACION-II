package com.example.sistema.service.archivos;

import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class ArchivoBinarioManager implements ArchivoManager {

    private RandomAccessFile archivo;

    @Override
    public void abrir(String ruta) throws IOException {
        archivo = new RandomAccessFile(ruta, "rw");
    }

    @Override
    public String leer() throws IOException {
        StringBuilder contenido = new StringBuilder();
        String linea;
        while ((linea = archivo.readLine()) != null) {
            contenido.append(linea).append("\n");
        }
        return contenido.toString();
    }

    @Override
    public void escribir(String contenido) throws IOException {
        archivo.writeBytes(contenido + "\n");
    }

    @Override
    public void cerrar() throws IOException {
        if (archivo != null) archivo.close();
    }
}
