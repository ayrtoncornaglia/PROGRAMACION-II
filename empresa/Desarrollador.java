package com.mycompany.empresa;

public class Desarrollador extends Empleado {
    String lenguajePrincipal;
    int horasExtras;
    public Desarrollador(String nombre, int dni,String lenguajePrincipal,int horasExtras) {
        super(nombre, dni);
        this.lenguajePrincipal = lenguajePrincipal;
        this.horasExtras = horasExtras;
    }
    @Override
    public int salarioTotal() {
        return salarioBase + (horasExtras * 80);
    }
    @Override
    public String mostrarDetalles() {
        return "Desarrollador: " + nombre + " ,DNI: " + dni + " ,Lenguaje principal: " + lenguajePrincipal + " ,Horas extras: " + horasExtras + " horas ,Salario base: $" + salarioBase + " ,Salario total: $" + salarioTotal();
    }
}
