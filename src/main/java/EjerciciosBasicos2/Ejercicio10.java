package EjerciciosBasicos2;

import java.util.Scanner;

/**
 * 10) Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no.
 * Usa un switch para ello.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el día de la semana: ");
        String dias = scanner.next();

        switch (dias){
            case "lunes":
            case "martes":
            case "mircoles":
            case "jueves":
            case "virnes":
                System.out.println("El día es laborable.");
                break; //punto de interrupción si se introduce alguno de estos días
            case "sabado":
            case "domingo":
                System.out.println("El día es festivo.");
                break;
            default:
                System.out.println("Error introduce un día de la semana.");
        }
    }
}
