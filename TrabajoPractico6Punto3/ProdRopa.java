package TrabajoPractico6Punto3;

public class ProdRopa extends Producto {
    private String Talle;
    public ProdRopa(String nombre, int precio, String Talle) {
        super(nombre, precio);
        this.Talle = Talle;
    }

    @Override
    public void mostrardetalles() {
        System.out.println("Producto de Ropa: "+nombre);
        System.out.println("Precio: $"+precio);
        System.out.println("Talle: "+Talle);
    }
    
}
