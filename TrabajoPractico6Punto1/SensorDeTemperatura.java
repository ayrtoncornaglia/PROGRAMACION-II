
package TrabajoPractico6Punto1;

public class SensorDeTemperatura extends InternetofThings {

@Override
public void encender(){
    System.out.println("El sensor de temperatura esta encendido");
}
@Override
public void apagar(){
    System.out.println("El sensor de temperatura esta apagado");
}

    @Override
    public void estado() {
    System.out.println("La temperatura actual es de 20°C");
    }
}
