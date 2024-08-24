package TrabajoPractico6Punto3;

public class ProdAlimenticio extends Producto {
    private String FechaDeVencimiento;

    public ProdAlimenticio(String nombre, int precio, String FechaDeVencimiento) {
        super(nombre, precio);
        this.FechaDeVencimiento = FechaDeVencimiento;
    }
public boolean ProximoaVencer(){
        return FechaDeVencimiento.compareTo("30-08-2025") <=0;
}
    @Override
    public void mostrardetalles() {
        System.out.println("Producto Alimenticio: "+nombre);
        System.out.println("Precio: $"+precio);
        System.out.println("Fecha de vencimiento: "+FechaDeVencimiento);
        System.out.println("Proximo a vencer?: "+(ProximoaVencer() ? "Si" : "No"));    
    }
    
    
}
