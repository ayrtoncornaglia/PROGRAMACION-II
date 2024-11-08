package com.mycompany.empresa;

public class Gerente extends Empleado {
    int antiguedad;
    int bonusGestion;

    public Gerente(String nombre, int dni, int antiguedad, int bonusGestion) {
        super(nombre, dni);
        this.antiguedad = antiguedad;
        this.bonusGestion = bonusGestion;
    }

    @Override
    public int salarioTotal() {
        return salarioBase + (antiguedad * 500) + bonusGestion;
    }

    @Override
    public String mostrarDetalles() {
        return "Gerente: " + nombre + " ,DNI: " + dni + " ,Antiguedad: " + antiguedad + " Años ,Bonus por gestion: $" + bonusGestion + " ,Salario base: $" + salarioBase + " ,Salario total: $" + salarioTotal();
    }
}
