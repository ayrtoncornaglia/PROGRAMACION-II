package TrabajoPractico1;

import java.util.Scanner;

public class DigitosDeUnNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cifras;
        
        System.out.println("Ingrese un numero entre 1 y 99: ");
        numero = entrada.nextInt();
        
        cifras = String.valueOf(numero).length();
        if (numero >=1 && numero<=99){
            System.out.println("El numero tiene "+cifras+" cifras");
        }
        else {
            System.out.println("El numero ingresado no se encuentra entre 1 y 99");
        }
    }
}
