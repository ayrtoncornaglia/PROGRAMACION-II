package TrabajoPractico4;

public class Utilero extends Persona {
    private int añosExperiencia;
    private String funciones;
    private String categoria;

    public Utilero(String nombre, int edad, int añosExperiencia, String funciones, String categoria) {
        super(nombre, edad);
        this.añosExperiencia = añosExperiencia;
        this.funciones = funciones;
        this.categoria = categoria;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public String getFunciones() {
        return funciones;
    }

    public String getCategoria() {
        return categoria;
    }
    
    
}
