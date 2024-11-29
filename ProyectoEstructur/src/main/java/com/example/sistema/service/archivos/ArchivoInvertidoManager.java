package com.example.sistema.service.archivos;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ArchivoInvertidoManager implements ArchivoManager {

    private Map<String, Long> indiceInvertido = new HashMap<>();
    private RandomAccessFile archivo;

    @Override
    public void abrir(String ruta) throws IOException {
        archivo = new RandomAccessFile(ruta, "rw");
        cargarIndiceInvertido();
    }

    @Override
    public void cerrar() throws IOException {
        archivo.close();
    }

    /**
     * Carga el índice invertido desde el archivo, para realizar búsquedas rápidas.
     */
    private void cargarIndiceInvertido() throws IOException {
        // Este es un ejemplo simple de cómo cargar un índice invertido
        archivo.seek(0);
        String linea;
        long posicion = 0;
        while ((linea = archivo.readLine()) != null) {
            indiceInvertido.put(linea, posicion);
            posicion = archivo.getFilePointer();
        }
    }

    /**
     * Realiza una búsqueda de una clave en el archivo utilizando el índice invertido.
     *
     * @param clave La clave a buscar.
     * @return La posición de la clave en el archivo.
     * @throws IOException En caso de error en el archivo.
     */
    public long buscarClave(String clave) throws IOException {
        Long posicion = indiceInvertido.get(clave);
        if (posicion != null) {
            return posicion;
        }
        return -1;  // Si no se encuentra la clave
    }

    /**
     * Escribe un nuevo registro en el archivo y actualiza el índice invertido.
     *
     * @param clave El registro clave.
     * @param valor El valor asociado.
     * @throws IOException En caso de error en el archivo.
     */
    public void escribirRegistro(String clave, String valor) throws IOException {
        archivo.seek(archivo.length());
        archivo.writeBytes(clave + ":" + valor + "\n");
        indiceInvertido.put(clave, archivo.getFilePointer());
    }

    @Override
    public String leer() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void escribir(String contenido) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
