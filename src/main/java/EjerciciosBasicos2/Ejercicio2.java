package EjerciciosBasicos2;

import java.util.Scanner;

/**
 * 2) Cambia el ejercicio anterior, para que en lugar de pedir un número,
 * pida un carácter (char) y muestre su código en la tabla ASCII.
 * (Pista: para convertir un carácter a número utilizaremos “(int)+carácter”)
 */

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner valor = new Scanner(System.in);
        System.out.println("Introduce una letra ");
        char letra = valor.next().charAt(0);

        //Se conviente la letra a un número de la tabla ASCII.
        int numero = (int) letra;
        //Imprimir el resultado por pantalla.
        System.out.println("El número es " + numero);
    }
}
