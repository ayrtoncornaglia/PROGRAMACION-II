package TrabajoPractico4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Equipo equipo = new Equipo("FC Villa Dominga","Monteros");
        Jugador jugador1 = new Jugador("Ayrton Cornaglia",20,"Delantero",10,25);
        Jugador jugador2 = new Jugador("Augusto Corroto",23,"Delantero",7,12);
        Jugador jugador3 = new Jugador("Felipe Andujar",22,"Delantero",9,40);
        Jugador jugador4 = new Jugador("Juan Pablo Bustos",20,"Mediocampista",6,7);
        Jugador jugador5 = new Jugador("Santino Ruiz",20,"Mediocampista",8,6);
        Jugador jugador6 = new Jugador("Bernardo Carrillo",22,"Mediocampista",5,6);
        Jugador jugador7 = new Jugador("Federico Ponce",22,"Mediocampista",16,4);
        Jugador jugador8 = new Jugador("Ulises Barrera",22,"Defensor",4,2);
        Jugador jugador9 = new Jugador("Nahuel Bernio",23,"Defensor",2,1);
        Jugador jugador10 = new Jugador("Mariano Jalif",22,"Defensor",3,5);
        Jugador jugador11 = new Jugador("Rafael Robles",21,"Arquero",1,0);
        
        Entrenador entrenador = new Entrenador("Facundo Salinas",28,4,"Entrenador Municipal","FC Villa Dominga");
        List<String> certificados = new ArrayList<>();
        certificados.add("Certificado de Fisioterapia");
        certificados.add("Certificado de Rehabilitacion Deportiva");
        
        Masajista masajista = new Masajista("Chinguan",26,8,certificados,"Rehabilitacion");
        
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);
        equipo.agregarJugador(jugador4);
        equipo.agregarJugador(jugador5);
        equipo.agregarJugador(jugador6);
        equipo.agregarJugador(jugador7);
        equipo.agregarJugador(jugador8);
        equipo.agregarJugador(jugador9);
        equipo.agregarJugador(jugador10);
        equipo.agregarJugador(jugador11);
        equipo.agregarCuerpoTecnico(entrenador);
        equipo.agregarCuerpoTecnico(masajista);
        
        equipo.concentrar();
        equipo.viajar("Buenos Aires");
        equipo.jugarPartido();
        equipo.entrenar();
        
        equipo.mostrarGolesPorJugador();
        equipo.mostrarJugadoresPorPosicion();
        equipo.mostrarJugadoresEnPosicion("Delantero");
        
        equipo.eliminarJugador(jugador1);
        equipo.mostrarJugadoresPorPosicion();
    }
}
