package com.example.sistema.service.archivos;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TransformacionClave {

    /**
     * Realiza un hash de la clave para transformarla.
     *
     * @param clave La clave a transformar.
     * @return La clave transformada como un valor numérico.
     */
    public static int transformarClave(String clave) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(clave.getBytes(StandardCharsets.UTF_8));
            return byteArrayToInt(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error en la transformación de la clave", e);
        }
    }

    /**
     * Convierte un arreglo de bytes en un número entero.
     *
     * @param byteArray El arreglo de bytes.
     * @return El valor entero correspondiente.
     */
    private static int byteArrayToInt(byte[] byteArray) {
        int value = 0;
        for (int i = 0; i < Math.min(4, byteArray.length); i++) {
            value = (value << 8) | (byteArray[i] & 0xFF);
        }
        return value;
    }
}
