package EjerciciosBasicos2;

import java.util.Scanner;

/**
 * 1) Lee un número por teclado y haz que se muestre por consola
 * el carácter al que pertenece en la tabla ASCII. Por ejemplo:
 * si introduzco un 97, me muestre una a. (Pista: para convertir un
 * número a carácter utilizaremos “(char)+numero”)
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: "); //pedir por pantalla el número
        int number = scanner.nextInt();
        char valorletra = (char) number; //convertir el  numero a letra
        System.out.println("Tu valor en ASCII es " + valorletra); //devolver los datos optenidos

    }




}
