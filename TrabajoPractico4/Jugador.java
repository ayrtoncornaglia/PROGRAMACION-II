package TrabajoPractico4;

public class Jugador extends Persona {
    private String posicion;
    private int dorsal;
    private int golesAnotados;

    public Jugador(String nombre, int edad, String posicion, int dorsal, int golesAnotados) {
        super(nombre, edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.golesAnotados = golesAnotados;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }
    public void anotarGol(){
        this.golesAnotados++;
    }
}
