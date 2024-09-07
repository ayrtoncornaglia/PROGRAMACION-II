package TrabajoPractico7Punto1;

import java.util.ArrayList;

public class Habitat {
    private String codigo;
    private String nombre;
    private String tipo;
    private int capacidad;
    private ArrayList<Animal> animales;

    public Habitat(String codigo, String nombre, String tipo, int capacidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.animales = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }
    public boolean agregarAnimal(Animal animal){
        if(animales.size() < capacidad){
            return true;
        } else {
            System.out.println("No hay capacidad en el Habitat.");
            return false;
        }
    }
    
    
}
