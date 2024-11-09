package TrabajoPractico5;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    private List<ContenidoMultimedia> favoritos;
    private List<ContenidoMultimedia> historial;

    public Usuario() {
        favoritos = new ArrayList<>();
        historial = new ArrayList<>();
    }

    public void agregarAFavoritos(ContenidoMultimedia contenido) {
        if (!favoritos.contains(contenido)) {
            favoritos.add(contenido);
            System.out.println(contenido.Titulo + " agregado a favoritos.");
        }
    }

    public void agregarAHistorial(ContenidoMultimedia contenido) {
        historial.add(contenido);
        System.out.println(contenido.Titulo + " agregado al historial.");
    }

    public List<ContenidoMultimedia> obtenerFavoritos() {
        return favoritos;
    }

    public List<ContenidoMultimedia> obtenerHistorial() {
        return historial;
    }
}