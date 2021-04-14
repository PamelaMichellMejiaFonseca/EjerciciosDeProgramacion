package Data;

import javax.swing.*;
import java.util.Scanner;

/**
 *3) Lee un número por teclado que pida el precio de un producto
 *  (puede tener decimales) y calcule el precio final con IVA.
 *  El IVA será una constante que será del 21%.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        final double IVA= 0.21;
        Scanner valor = new Scanner(System.in);
      // String texto = System.out.println("Introduce el precio de un producto");

       double cantidad = valor.nextDouble();
        //Pasamos el String a double
       // double precio=Double.parseDouble(Scanner);

        //Obtenemos el precio final (precio+(precio*IVA))
        double precioFinal=(cantidad + (cantidad * IVA));

        System.out.println(precioFinal);
    }


    }
