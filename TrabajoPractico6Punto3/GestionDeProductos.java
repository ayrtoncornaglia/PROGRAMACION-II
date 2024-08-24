package TrabajoPractico6Punto3;

public class GestionDeProductos {
    public static void main(String[] args){
        Producto Alimenticio = new ProdAlimenticio("Leche",1440,"25-08-2024");
        Producto Electronico = new ProdElectronico("Televisor",539999,24);
        Producto Ropa = new ProdRopa("Remera",25500,"M");
        
        Alimenticio.mostrardetalles();
        System.out.println();
        Electronico.mostrardetalles();
        System.out.println();
        Ropa.mostrardetalles();
    }
}
