package TrabajoPractico5;

public class SistemaDeGestion {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Pelicula pelicula = new Pelicula("Inception", 2010, 8.8, 148, "Christopher Nolan");
        Serie serie = new Serie("Breaking Bad", 2008, 9.5, 49, 5, 13);
        Documental documental = new Documental("Planet Earth", 2006, 9.4, 50, "Naturaleza");

        catalogo.agregarContenido(pelicula);
        catalogo.agregarContenido(serie);
        catalogo.agregarContenido(documental);

        Usuario usuario = new Usuario();
        usuario.agregarAFavoritos(serie);
        usuario.agregarAHistorial(pelicula);

        System.out.println("Top 5 mas popular:");
        for (ContenidoMultimedia contenido : catalogo.obtenerTop5MasPopular()) {
            System.out.println(contenido.mostrarDetalles());
        }
    }
}