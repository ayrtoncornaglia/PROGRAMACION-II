package TrabajoPractico2;

import java.util.Scanner;

public class Empleado {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
    
    public void mostrarInformacionCompleta() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        if (salario >= 0) {
            System.out.println("Salario: $" + salario);
        }
    }

    public void incrementarSalario(double cantidad, double porcentajeAdicional) {
        double salarioConIncremento = this.salario + cantidad;
        double incrementoTotal = salarioConIncremento * (porcentajeAdicional / 100);
        this.salario += cantidad + incrementoTotal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese el apellido del empleado:");
        String apellido = scanner.nextLine();
        
        System.out.println("Ingrese la edad del empleado:");
        int edad = scanner.nextInt();
        
        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();
        
        Empleado empleado1 = new Empleado(nombre, apellido, edad, salario);

        empleado1.mostrarInformacionCompleta();

        System.out.println("Ingrese el monto a incrementar del salario:");
        double cantidadIncremento = scanner.nextDouble();
        
        System.out.println("Ingrese el porcentaje adicional de incremento del salario:");
        double porcentajeIncremento = scanner.nextDouble();

        empleado1.incrementarSalario(cantidadIncremento, porcentajeIncremento);

        empleado1.mostrarInformacionCompleta();
        
        scanner.close();
    }
}