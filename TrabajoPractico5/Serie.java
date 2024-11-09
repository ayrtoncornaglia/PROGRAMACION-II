package TrabajoPractico5;

public class Serie extends ContenidoMultimedia {

    private int numeroDeTemp;
    private int epPorTemp;

    public Serie(String Titulo, int anio, double calificacion, int duracion, int numeroDeTemp, int epPorTemp) {
        super(Titulo, anio, calificacion, duracion);
        this.numeroDeTemp = numeroDeTemp;
        this.epPorTemp = epPorTemp;
    }

    @Override
    public double CalcularPopularidad() {
        return calificacion * numeroDeTemp * epPorTemp;
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + "Numero de temporadas: " + numeroDeTemp + " ,Episodios por temporada: " + epPorTemp;
    }

}
