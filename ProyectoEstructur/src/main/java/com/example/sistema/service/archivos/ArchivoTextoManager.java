package com.example.sistema.service.archivos;

import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class ArchivoTextoManager implements ArchivoManager {

    private BufferedReader lector;
    private BufferedWriter escritor;

    @Override
    public void abrir(String ruta) throws IOException {
        lector = new BufferedReader(new FileReader(ruta));
        escritor = new BufferedWriter(new FileWriter(ruta, true));
    }

    @Override
    public String leer() throws IOException {
        StringBuilder contenido = new StringBuilder();
        String linea;
        while ((linea = lector.readLine()) != null) {
            contenido.append(linea).append("\n");
        }
        return contenido.toString();
    }

    @Override
    public void escribir(String contenido) throws IOException {
        escritor.write(contenido);
        escritor.newLine();
    }

    @Override
    public void cerrar() throws IOException {
        if (lector != null) lector.close();
        if (escritor != null) escritor.close();
    }
}
