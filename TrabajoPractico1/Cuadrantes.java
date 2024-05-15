package TrabajoPractico1;

import java.util.Scanner;

public class Cuadrantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x,y;
        System.out.print("Ingresar el valor de x: ");
        x = entrada.nextInt();
        System.out.print("Ingresar el valor de y: ");
        y = entrada.nextInt();
        
       if (x > 0 && y > 0){
           System.out.println("El punto x: "+x+" y el punto y: "+y+" pertencen al primer cuadrante del plano");
       }
       else if (x < 0 && y > 0){
           System.out.println("El punto x: "+x+" y el punto y: "+y+" pertenece al segundo cuadrante del plano");
       }
       else if (x < 0 && y < 0){
           System.out.println("El punto x: "+x+" y el punto y: "+y+" pertenece al tercer cuadrante del plnao");
       }
       else if (x > 0 && y < 0){
           System.out.println("El punto x: "+x+" y el punto y: "+y+" pertenece al cuarto cuadrante del plano");
       }
       else {
           System.out.println("el punto en el plano es invalido");
       }
    }
}
