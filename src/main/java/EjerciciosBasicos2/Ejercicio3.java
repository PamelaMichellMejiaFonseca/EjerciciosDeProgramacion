package EjerciciosBasicos2;

import java.util.Scanner;

/**
 *3) Lee un número por teclado que pida el precio de un producto
 *  (puede tener decimales) y calcule el precio final con IVA.
 *  El IVA será una constante que será del 21%.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        final double IVA= 1.21;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio de un producto para calcular el IVA: ");
        double precio = scanner.nextInt();
       //Obtenemos el precio final (precio*IVA)
        double precioFinal=(precio * IVA);
        System.out.println("El precio del producto con el IVA incluido es: " + precioFinal);
    }


    }
