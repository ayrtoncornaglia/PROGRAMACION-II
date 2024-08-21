package TrabajoPractico6Punto2;

public class Informe {
    public static void main(String[] args){
        CompraM compra = new CompraM();
        Construccion cons = new Construccion();
        Inaguracion inag = new Inaguracion();
        System.out.println("COMPRA DE MATERIALES:");
        compra.FechaI("10 de Septiembre de 2012");
        compra.FechaF("12 de Septiembre de 2012");
        compra.Responsable("Julio Juarez");
        compra.TiempoTotal(2);
        System.out.println("CONSTRUCCION:");
        cons.FechaI("13 de Septiembre de 2012");
        cons.FechaF("1 de Diciembre de 2012");
        cons.Responsable("Carlos Diaz");
        cons.TiempoTotal(79);
        System.out.println("INAGURACION:");
        inag.FechaI("5 de Diciembre de 2012");
        inag.FechaF("5 de Diciembre de 2012");
        inag.Responsable("Alberto Corroto");
        inag.TiempoTotal(1);
    }
}
