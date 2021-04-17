package EjerciciosBasicos2;

import java.util.Scanner;

/**
 * 11) Pide por teclado dos números y genera 10 números aleatorios
 * entre esos números.Usa el método Math.random para generar
 * un número aleatorio.
 */
public class Ejercicio11 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.println("Escribe el segundo número: ");
        int segundoNumero = scanner.nextInt();

        int minimo; //variables de tipo numerica declaradas
        int maximo;

        if(primerNumero > segundoNumero){ //el primer numero es menor que el segundo numero
            minimo = primerNumero;
            maximo = segundoNumero;
        }
        else{
            minimo = segundoNumero;
            maximo = primerNumero;
        }

        for(int i = 0; i <10; i++){ //round para redondear los números
            System.out.println(Math.round(Math.random() * (maximo - minimo) + minimo));
        }


    }

}
