package com.mycompany.empresa;

public abstract class Empleado {

    String nombre;
    int dni;
    int salarioBase = 2500;

    public Empleado(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getSalarioBase() {
        return salarioBase;
    }
    public abstract int salarioTotal();
    public abstract String mostrarDetalles();
    }
