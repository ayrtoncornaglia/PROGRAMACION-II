package TrabajoPractico1;

import java.util.Scanner;

public class DiaMesAño {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int dia,mes,año;
        System.out.print("Ingresar el dia: ");
        dia = entrada.nextInt();
        System.out.print("Ingresar el mes: ");
        mes = entrada.nextInt();
        System.out.print("Ingresar el año: ");
        año = entrada.nextInt();
    if (dia <=30 && dia >=1 && mes>=1 && mes<=3 && año>=0){
        System.out.println("dia: "+dia+" - mes: "+mes+" - año: "+año+" y pertenece al primer cuatrimestre");
    }
    else if (dia >=1 && dia <=30 && mes>=4 && mes <=6 && año >=0){
        System.out.println("dia: "+dia+" - mes: "+mes+" - año: "+año+" y pertenece al segundo cuatrimestre");
    }
    else if (dia >=1 && dia <=30 && mes>=7 && mes <=9 && año >=0){
        System.out.println("dia: "+dia+" - mes: "+mes+" - año: "+año+" y pertenece al tercer cuatrimestre");
    }
    else if (dia >=1 && dia <=30 && mes>=10 && mes <=12 && año >=0){
        System.out.println("dia: "+dia+" - mes: "+mes+" - año: "+año+" y pertenece al cuarto cuatrimestre");
    }
    else {
        System.out.println("ERROR");
    }
    }
}
