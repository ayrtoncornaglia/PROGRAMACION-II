package TrabajoPractico5;

public class Documental extends ContenidoMultimedia {

    String tema;

    public Documental(String Titulo, int anio, double calificacion, int duracion, String tema) {
        super(Titulo, anio, calificacion, duracion);
        this.tema = tema;
    }

    @Override
    public double CalcularPopularidad() {
        return calificacion * 1.5;
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + " ,Tema: " + tema;
    }

}
