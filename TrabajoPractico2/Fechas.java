package TrabajoPractico2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Fechas {

    public static int calcularDiasTranscurridos(int dia, int mes, int año) {
        LocalDate fechaIngresada = LocalDate.of(año, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(fechaIngresada, fechaActual);
    }

    public static int calcularDiasTranscurridos(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaIngresada = LocalDate.parse(fecha, formatter);
        LocalDate fechaActual = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(fechaIngresada, fechaActual);
    }

    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    public static boolean esBisiesto(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaIngresada = LocalDate.parse(fecha, formatter);
        int año = fechaIngresada.getYear();
        return esBisiesto(año);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dia:");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes:");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el anio:");
        int año = scanner.nextInt();

        int dias1 = calcularDiasTranscurridos(dia, mes, año);
        System.out.println("Dias transcurridos desde " + dia + "/" + mes + "/" + año + ": " + dias1);

        System.out.println("Ingrese la fecha en formato dd/mm/yyyy:");
        String fecha = scanner.next();

        int dias2 = calcularDiasTranscurridos(fecha);
        System.out.println("Dias transcurridos desde " + fecha + ": " + dias2);

        boolean esBisiesto1 = esBisiesto(año);
        System.out.println("El anio " + año + " es bisiesto? " + esBisiesto1);

        boolean esBisiesto2 = esBisiesto(fecha);
        System.out.println("El anio de la fecha " + fecha + " es bisiesto? " + esBisiesto2);

        scanner.close();
    }
}
