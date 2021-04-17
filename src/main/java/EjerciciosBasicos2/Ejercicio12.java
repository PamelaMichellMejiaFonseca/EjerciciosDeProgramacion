package EjerciciosBasicos2;

import java.util.Scanner;

/**12) Pide por teclado un número entero positivo y muestra el número
 * de cifras que tiene. Por ejemplo: si introducimos 1250,
 * nos muestra que tiene 4 cifras. Tendremos que controlar
 * si tiene una o más cifras, al mostrar el mensaje. (Pista: tendrás
 * que hacer dos bucles para lograrlo)
 *
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
         int numero = scanner.nextInt();

         if(numero == 1){
             System.out.println("El número " + numero+ " tiene " + String.valueOf(numero).length() + " cifras");
         } //se contara el valor de la cadena con length
          else {
        System.out.println("El número" + numero + " tiene " + String.valueOf(numero).length() + " cifras");
    }
}
}


