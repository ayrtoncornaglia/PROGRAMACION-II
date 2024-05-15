package TrabajoPractico1;

import java.util.Scanner;

public class LadosDeUnTriangulo {
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
    int n, eq=0, is=0, es=0; 
    float l1, l2, l3;
      System.out.print("Ingrese el numero de triangulos: ");
      n = entrada.nextInt();
      
    for (int i=1; i <=n; i++){
        System.out.println("Triangulo#"+i);
        System.out.println("Ingrese la longitud del lado 1: ");
        l1 = entrada.nextFloat();
        System.out.println("Ingrese la longitud del lado 2: ");
        l2 = entrada.nextFloat();
        System.out.println("Ingrese la longitud del lado 3: ");
        l3 = entrada.nextFloat();
    if (l1==l2 && l2==l3){
        System.out.println("Este triangulo es un triangulo equilatero"); 
        eq++;
    } else if (l1==l2 || l2==l3 || l3==l1) {
        System.out.println("Este triangulo es un triangulo isosceles");
        is++;
    } else if (l1 != l2 && l2 != l3 && l1 != l3){
        System.out.println("Este triangulo es un triangulo escaleno");
        es++;
    }
    }
    
      System.out.println(eq+" triangulos son equilateros");
      System.out.println(is+" triangulos son isosceles");
      System.out.println(es+" triangulos son escalenos");
      System.out.println("");
  
      String tipomenor;
      int  menorcant = (Math.min(es,Math.min(eq,is)));
    
    if (menorcant == eq && eq != is && eq != es) {
        tipomenor = "equilateros";
    } else if (menorcant == is && is != eq && is != es){
        tipomenor = "isosceles";
    } else if (menorcant == es && es != eq && es != is) {
        tipomenor = "escalenos";
    } else {
        tipomenor = "Los tres triangulos son iguales";
    }
      System.out.println(tipomenor+" son los triangulos con menor cantidad");
  
  }
  }

