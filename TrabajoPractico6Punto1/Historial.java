package TrabajoPractico6Punto1;

public class Historial {
        public static void main(String[] args){
            SensorDeTemperatura TPLink = new SensorDeTemperatura();
            CamaraDeSeguridad Gadnic = new CamaraDeSeguridad();
            AltavocesInteligentes AppleHome = new AltavocesInteligentes();
            
            System.out.print("TPLink:");TPLink.encender();
            System.out.print("TPLink:");TPLink.estado();
            System.out.print("TPLink:");TPLink.apagar();
            
            System.out.print("Gadnic:");Gadnic.encender();
            System.out.print("Gadnic:");Gadnic.estado();
            System.out.print("Gadnic:");Gadnic.apagar();
            
            System.out.print("AppleHome:");AppleHome.encender();
            System.out.print("AppleHome:");AppleHome.estado();
            System.out.print("AppleHome:");AppleHome.apagar();
                       
        }
}
