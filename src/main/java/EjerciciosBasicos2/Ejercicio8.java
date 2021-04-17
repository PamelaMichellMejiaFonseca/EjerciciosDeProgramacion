package EjerciciosBasicos2;

import java.util.Scanner;

/**
 8) Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no
 lo es lo volverá a pedir (do while), después haz que nos muestre el número por consola..
 */
public class Ejercicio8 {
    public static void main(String[] args) {

        int number; //declara una varaible sin contenido ya que el valor se pide despues
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Escribe un número: ");
            number = scanner.nextInt();
        }
        while(number <= 0);

        System.out.println("El número " + number+" es mayor o igual a cero");
    }
}
