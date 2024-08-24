package TrabajoPractico6Punto3;

public class ProdElectronico extends Producto {
    private int Garantia;

    public ProdElectronico(String nombre, int precio, int Garantia) {
        super(nombre, precio);
        this.Garantia = Garantia;
    }
    @Override
    public void mostrardetalles() {
        System.out.println("Producto electronico: "+nombre);
        System.out.println("Precio: $"+precio);
        System.out.println("Periodo de Garantia: "+Garantia+" meses");
    }
    
}
