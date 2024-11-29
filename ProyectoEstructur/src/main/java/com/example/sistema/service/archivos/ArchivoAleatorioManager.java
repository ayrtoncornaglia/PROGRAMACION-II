package com.example.sistema.service.archivos;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.RandomAccessFile;

@Service
public class ArchivoAleatorioManager implements ArchivoEstructuradoManager {

    private RandomAccessFile archivo;

    @Override
    public void abrir(String ruta) throws IOException {
        archivo = new RandomAccessFile(ruta, "rw");
    }

    @Override
    public String leer() throws IOException {
        StringBuilder contenido = new StringBuilder();
        archivo.seek(0);
        String linea;
        while ((linea = archivo.readLine()) != null) {
            contenido.append(linea).append("\n");
        }
        return contenido.toString();
    }

    @Override
    public void escribir(String contenido) throws IOException {
        archivo.seek(archivo.length());
        archivo.writeBytes(contenido + "\n");
    }

    @Override
    public void escribirRegistro(String key, String valor) throws IOException {
        archivo.seek(archivo.length());
        archivo.writeBytes(key + ":" + valor + "\n");
    }

    @Override
    public String leerRegistro(String key) throws IOException {
        archivo.seek(0);
        String linea;
        while ((linea = archivo.readLine()) != null) {
            String[] partes = linea.split(":", 2);
            if (partes[0].equals(key)) {
                return partes[1];
            }
        }
        return "No encontrado";
    }

    @Override
    public void cerrar() throws IOException {
        if (archivo != null) archivo.close();
    }
}
