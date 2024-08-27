package TrabajoPractico4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Equipo {
    private String nombre;
    private String ciudad;
    private List<Jugador> jugadores;
    private List<Persona> cuerpoTecnico;

    public Equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = new ArrayList<>();
        this.cuerpoTecnico = new ArrayList<>();
    }
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    public void eliminarJugador(Jugador jugador){
        jugadores.remove(jugador);
    }
    public void agregarCuerpoTecnico(Persona integrante){
        cuerpoTecnico.add(integrante);
    }
    public void concentrar(){
        System.out.println(nombre+" esta concentrando en "+ciudad);
    }
    public void viajar(String destino){
        System.out.println(nombre+" esta viajando a "+destino);
    }
    public void jugarPartido(){
        System.out.println(nombre+" esta jugando un partido");
    }
    public void entrenar(){
        System.out.println(nombre+" esta entrenando");
    }
    public void mostrarJugadoresPorPosicion(){
        jugadores.sort(Comparator.comparing(Jugador::getPosicion));
        for (Jugador jugador : jugadores){
            System.out.println(jugador.getPosicion() + ": "+ jugador.getNombre());
        }
    }
    public void mostrarJugadoresEnPosicion(String posicion){
        System.out.println("Jugadores en la posicion " + posicion + ":");
        for (Jugador jugador : jugadores) {
            if(jugador.getPosicion().equals(posicion)){
                System.out.println(jugador.getNombre() + " - Dorsal: "+jugador.getDorsal());
            }
        }
    }
    public void mostrarGolesPorJugador(){
        for(Jugador jugador : jugadores){
            System.out.println(jugador.getNombre() + " ha anotado "+jugador.getGolesAnotados() + " goles.");
        }
    }
}
