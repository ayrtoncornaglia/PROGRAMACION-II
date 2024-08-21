package TrabajoPractico6Punto1;

public class CamaraDeSeguridad extends InternetofThings {

    @Override
    public void encender() {
        System.out.println("La camara de seguridad esta encendida");
    }

    @Override
    public void apagar() {
        System.out.println("La camara de seguridad esta apagada");
    }

    @Override
    public void estado() {
        System.out.println("Imagen Capturada");
    }
    

}
