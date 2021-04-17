package EjerciciosBasicos2;

import java.util.Scanner;

/**
 * 9) Crea una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá por consola
 * que introduzcas la contraseña (utiliza el método “equals” para comparar), con 3 intentos.
 * Cuando aciertes ya no pedirá más la contraseña y mostrará un mensaje diciendo “Enhorabuena”.
 * Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "Devel0per";
        int intentos = 3;
        String input ="";

        while(input != password && intentos > 0) {
            System.out.print("Introduce tu contraseña: ");
            input = scanner.nextLine();
            if(input.equals(password)) {
                System.out.println("Enhorabuena"); //si la contraseña es correcta nos dara el mensaje
                break;
            } else {
                intentos--;
                if(intentos == 1){ //segundo intento
                    System.out.println("Tienes " + intentos + " intento.");
                } else {
                    System.out.println("Tienes " + intentos + " intentos.");
                }
                if(intentos == 0){ //ultimo intento
                    System.out.println("La contraseña es incorrecta no tienes más intentos");
                    break;
                }
                continue;
            }
        }




    }
}
