package com.example.sistema.service.archivos;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Service
public class ArchivoSecuencialManager implements ArchivoEstructuradoManager {

    private BufferedReader lector;
    private BufferedWriter escritor;
    private final Map<String, String> registros = new HashMap<>();

    @Override
    public void abrir(String ruta) throws IOException {
        lector = new BufferedReader(new FileReader(ruta));
        escritor = new BufferedWriter(new FileWriter(ruta, true));
        cargarRegistros();
    }

    private void cargarRegistros() throws IOException {
        String linea;
        while ((linea = lector.readLine()) != null) {
            String[] partes = linea.split(":", 2);
            if (partes.length == 2) {
                registros.put(partes[0], partes[1]);
            }
        }
    }

    @Override
    public String leer() throws IOException {
        StringBuilder contenido = new StringBuilder();
        for (Map.Entry<String, String> entry : registros.entrySet()) {
            contenido.append(entry.getKey()).append(":").append(entry.getValue()).append("\n");
        }
        return contenido.toString();
    }

    @Override
    public void escribir(String contenido) throws IOException {
        escritor.write(contenido);
        escritor.newLine();
    }

    @Override
    public void escribirRegistro(String key, String valor) throws IOException {
        registros.put(key, valor);
        escritor.write(key + ":" + valor);
        escritor.newLine();
    }

    @Override
    public String leerRegistro(String key) {
        return registros.getOrDefault(key, "No encontrado");
    }

    @Override
    public void cerrar() throws IOException {
        if (lector != null) lector.close();
        if (escritor != null) escritor.close();
    }
}
