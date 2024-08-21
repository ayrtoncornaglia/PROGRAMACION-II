package TrabajoPractico6Punto2;

public class CompraM extends Proyecto{
    
    @Override
    public void FechaI(String x){
        System.out.println("La fecha inicial de la tarea es: "+x);
}

    @Override
    public void FechaF(String x) {
        System.out.println("La fecha final de la tarea es: "+x);
    }

    @Override
    public void Responsable(String x) {
        System.out.println("El responsable de la tarea es: "+x);
    }

    @Override
    public void TiempoTotal(int a) {
    int horas = a*24;
        System.out.println("El tiempo total invertido es de "+horas+" horas");
    }
    
}
