package TrabajoPractico4;

public class Entrenador extends Persona {
    private int añosExperiencia;
    private String titulo;
    private String equipo;

    public Entrenador(String nombre, int edad, int añosExperiencia, String titulo, String equipo) {
        super(nombre, edad);
        this.añosExperiencia = añosExperiencia;
        this.titulo = titulo;
        this.equipo = equipo;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEquipo() {
        return equipo;
    }
    
}
