package com.example.sistema.service;

import com.example.sistema.service.archivos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ServicioArchivos {

    @Autowired
    private ArchivoTextoManager archivoTextoManager;

    @Autowired
    private ArchivoBinarioManager archivoBinarioManager;

    @Autowired
    private ArchivoSecuencialManager archivoSecuencialManager;

    @Autowired
    private ArchivoAleatorioManager archivoAleatorioManager;

    @Autowired
    private ArchivoIndexadoManager archivoIndexadoManager;
    
     @Autowired
    private ArchivoInvertidoManager archivoInvertidoManager;

     
    /**
     * Obtiene el gestor de archivos adecuado según el tipo solicitado.
     *
     * @param tipo El tipo de archivo ("texto", "binario", "secuencial", "aleatorio", "indexado").
     * @return La instancia del gestor de archivos correspondiente.
     */
    public ArchivoManager getManager(String tipo) {
        return switch (tipo) {
            case "texto" -> archivoTextoManager;
            case "binario" -> archivoBinarioManager;
            case "secuencial" -> archivoSecuencialManager;
            case "aleatorio" -> archivoAleatorioManager;
            case "indexado" -> archivoIndexadoManager;
            default -> throw new IllegalArgumentException("Tipo de archivo no soportado");
        };
    }

    /**
     * Maneja una operación básica de archivos (leer, escribir, cerrar) según el tipo de archivo.
     *
     * @param tipo      Tipo de archivo.
     * @param ruta      Ruta del archivo.
     * @param accion    Acción a realizar ("leer", "escribir", "cerrar").
     * @param contenido Contenido a escribir (si aplica).
     * @throws IOException En caso de error en las operaciones de archivo.
     */
    public void manejarArchivo(String tipo, String ruta, String accion, String contenido) throws IOException {
        ArchivoManager manager = getManager(tipo);
        manager.abrir(ruta);

        switch (accion) {
            case "leer":
                System.out.println("Contenido del archivo:\n" + manager.leer());
                break;
            case "escribir":
                manager.escribir(contenido);
                break;
            case "cerrar":
                manager.cerrar();
                break;
            default:
                throw new IllegalArgumentException("Acción no soportada");
        }

        manager.cerrar();
    }

    /**
     * Maneja operaciones estructuradas de archivos, como escritura y lectura de registros.
     *
     * @param tipo      Tipo de archivo estructurado ("secuencial", "aleatorio", "indexado").
     * @param ruta      Ruta del archivo.
     * @param accion    Acción a realizar ("leerRegistro", "escribirRegistro").
     * @param clave     Clave del registro.
     * @param valor     Valor del registro (si aplica).
     * @throws IOException En caso de error en las operaciones de archivo.
     */
    public void manejarArchivoEstructurado(String tipo, String ruta, String accion, String clave, String valor) throws IOException {
        ArchivoEstructuradoManager manager = (ArchivoEstructuradoManager) getManager(tipo);
        manager.abrir(ruta);

        switch (accion) {
            case "leerRegistro":
                System.out.println("Valor del registro (" + clave + "): " + manager.leerRegistro(clave));
                break;
            case "escribirRegistro":
                manager.escribirRegistro(clave, valor);
                break;
            default:
                throw new IllegalArgumentException("Acción no soportada");
        }

        manager.cerrar();
    }
        public void escribirEnArchivoIndexadoConTransformacion(String clave, String valor) throws IOException {
        int claveTransformada = TransformacionClave.transformarClave(clave);
        archivoIndexadoManager.escribirRegistro(claveTransformada + "", valor);

        // Manejo de rebalse
        if (rebalseDetectado()) {
            ManejoRebalse.manejarRebalse(archivoIndexadoManager, clave, valor);
        }
    }

    private boolean rebalseDetectado() {
        // Lógica simple de rebalse, en producción se debería controlar el tamaño del archivo
        return archivoIndexadoManager.getEncadenados().size() > 10;
    }
}

