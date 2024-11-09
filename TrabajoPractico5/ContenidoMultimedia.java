package TrabajoPractico5;

public abstract class ContenidoMultimedia {

    String Titulo;
    int anio;
    double calificacion;
    int duracion;

    public ContenidoMultimedia(String Titulo, int anio, double calificacion, int duracion) {
        this.Titulo = Titulo;
        this.anio = anio;
        this.calificacion = calificacion;
        this.duracion = duracion;
    }

    public void Reproducir() {
        System.out.println("Se esta reproduciendo: " + Titulo);
    }

    public abstract double CalcularPopularidad();

    public String mostrarDetalles(){
    return "Titulo: "+Titulo+" ,Año: "+anio+" ,Calificacion: "+calificacion+" ,Duracion: "+duracion+" minutos";
}
}
