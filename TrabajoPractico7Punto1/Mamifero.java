package TrabajoPractico7Punto1;

public class Mamifero extends Animal {
    
    public Mamifero(String codigo, String nombre, int edad, double peso) {
        super(codigo, nombre, edad, peso);
    }
    @Override
    public String getTipo(){
        return "Mamifero";
    }
}
