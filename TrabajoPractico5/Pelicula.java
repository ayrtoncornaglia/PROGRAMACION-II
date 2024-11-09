package TrabajoPractico5;

public class Pelicula extends ContenidoMultimedia {

    String director;

    public Pelicula(String Titulo, int anio, double calificacion, int duracion, String director) {
        super(Titulo, anio, calificacion, duracion);
        this.director = director;
    }

    @Override
    public double CalcularPopularidad() {
        return calificacion *2;
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + " ,Director: "+director;
                }

}
