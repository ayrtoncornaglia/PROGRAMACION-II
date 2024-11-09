package TrabajoPractico5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Catalogo {
    private final List<ContenidoMultimedia> contenidos;

    public Catalogo() {
        contenidos = new ArrayList<>();
    }

    public void agregarContenido(ContenidoMultimedia contenido) {
        contenidos.add(contenido);
    }

    public List<ContenidoMultimedia> filtrarPorTipo(Class<?> tipo) {
        List<ContenidoMultimedia> filtrados = new ArrayList<>();
        for (ContenidoMultimedia contenido : contenidos) {
            if (contenido.getClass() == tipo) {
                filtrados.add(contenido);
            }
        }
        return filtrados;
    }

    public List<ContenidoMultimedia> obtenerTop5MasPopular() {
        List<ContenidoMultimedia> ordenados = new ArrayList<>(contenidos);
        ordenados.sort(Comparator.comparingDouble(ContenidoMultimedia::CalcularPopularidad).reversed());
        return ordenados.subList(0, Math.min(5, ordenados.size()));
    }
}