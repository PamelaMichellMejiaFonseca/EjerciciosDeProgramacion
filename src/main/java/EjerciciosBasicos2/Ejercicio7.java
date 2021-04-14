package EjerciciosBasicos2;
/*
7) Realiza una aplicación que nos pida un número de
productos vendidos, después nos pedirá el precio de cada producto
(tendrá que pedirnos tantos precios como productos le hayamos indicado
 al principio) Al final mostrará la suma del total de productos por el
 precio de cada producto. Piensa que es lo que se repite y lo que no.
 */

import java.util.Scanner;
import java.util.Locale;


public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scannerProduct = new Scanner(System.in);
        scannerProduct.useLocale(Locale.US);
        System.out.print("Introduce el número de productos vendidos:   ");
        int venta = scannerProduct.nextInt();

        double precioProducto;
        double preciofinal = 0; //no se conoce el precio y se pondra un cero

        for(int i = 1; i <= venta; i++ ){
            System.out.println("Escribe el precio de cada producto " + i);
            precioProducto = scannerProduct.nextDouble();
            preciofinal += precioProducto;
        }
        System.out.println("El total del de todo los productos es: " + preciofinal);

    }

}
