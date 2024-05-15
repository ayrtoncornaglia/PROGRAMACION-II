package TrabajoPractico1;

import java.util.Scanner;

public class NotasDelAlumno {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero;
    
        System.out.print("Ingrese la nota del alumno: ");
        numero = entrada.nextInt();
    if (numero < 4 && numero>=0){
        System.out.println("Desaprobado");
    }
    else if (numero >=4 && numero <10){
        System.out.println("Aprobado");
    }
    else if (numero == 10){
        System.out.println("Sobresaliente");
    }
    else {
        System.out.println("Nota invalida");
    }
    }
    
}
