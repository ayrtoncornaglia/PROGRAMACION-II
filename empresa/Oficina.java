package com.mycompany.empresa;

public class Oficina {
    public static void main(String[] args){
        Empleado desarrollador = new Desarrollador("Ayrton",45127410,"Java",10);
        Empleado gerente = new Gerente("Tulio",23056569,5,400);
        
        System.out.println(desarrollador.mostrarDetalles());
        System.out.println(gerente.mostrarDetalles());
    }
}
