package TrabajoPractico1;

import java.util.Scanner;

public class PromedioAlumno {
      public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float nota1,nota2,nota3,promedio;
          System.out.print("Ingrese la primera nota: ");
          nota1 = entrada.nextFloat();
          System.out.print("Ingrese la segunda nota: ");
          nota2 = entrada.nextFloat();
          System.out.print("Ingrese la tercera nota: ");
          nota3 = entrada.nextFloat();
    promedio = (nota1+nota2+nota3)/3;
    if (promedio >=8 && promedio <=10) {
        System.out.println("El alumno promociono con: "+promedio);
    }
    else if (promedio <8 && promedio >=0){
        System.out.println("El alumno no prociono");
    }
    else {
        System.out.println("nota invalida");
    }
    
}    
}
