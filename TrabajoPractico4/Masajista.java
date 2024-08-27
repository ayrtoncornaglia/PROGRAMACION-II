package TrabajoPractico4;

import java.util.List;

public class Masajista extends Persona {
    private int añosExperiencia;
    private List<String> certificados;
    private String especialidad;

    public Masajista(String nombre, int edad, int añosExperiencia, List<String> certificados, String especialidad) {
        super(nombre, edad);
        this.añosExperiencia = añosExperiencia;
        this.certificados = certificados;
        this.especialidad = especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public List<String> getCertificados() {
        return certificados;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
}
