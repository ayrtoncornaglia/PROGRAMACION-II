package com.example.sistema.service.archivos;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

@Service
public class ArchivoIndexadoManager implements ArchivoEstructuradoManager {

    private final Map<String, Long> indice = new HashMap<>();
    private RandomAccessFile archivo;
    private LinkedList<String> encadenados = new LinkedList<>();

    @Override
    public void abrir(String ruta) throws IOException {
        archivo = new RandomAccessFile(ruta, "rw");
        cargarIndice();
    }

    private void cargarIndice() throws IOException {
        archivo.seek(0);
        long posicion;
        String linea;
        while ((posicion = archivo.getFilePointer()) < archivo.length()) {
            linea = archivo.readLine();
            String[] partes = linea.split(":", 2);
            if (partes.length == 2) {
                indice.put(partes[0], posicion);
            }
        }
    }

    @Override
    public String leer() throws IOException {
        archivo.seek(0);
        StringBuilder contenido = new StringBuilder();
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
        long posicion = archivo.length();
        archivo.seek(posicion);
        archivo.writeBytes(key + ":" + valor + "\n");
        indice.put(key, posicion);
    }

    @Override
    public String leerRegistro(String key) throws IOException {
        Long posicion = indice.get(key);
        if (posicion == null) {
            return "No encontrado";
        }
        archivo.seek(posicion);
        String linea = archivo.readLine();
        String[] partes = linea.split(":", 2);
        return partes.length == 2 ? partes[1] : "Error de formato";
    }

    @Override
    public void cerrar() throws IOException {
        if (archivo != null) archivo.close();
    }
    public void encadenarRegistro(String clave, String valor) {
        encadenados.add(clave + ":" + valor);  // Almacena en memoria los registros encadenados
        System.out.println("Registro encadenado: " + clave + " -> " + valor);
    }
    public LinkedList<String> getEncadenados() {
        return encadenados;
}
}
