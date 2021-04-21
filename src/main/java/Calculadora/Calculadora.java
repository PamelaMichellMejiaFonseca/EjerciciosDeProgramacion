package Calculadora;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {
        //se crea un objeto llamado scanner de la clase Scanner y se declara una variable de tipo string que almacena la frase,
        Scanner scanner = new Scanner(System.in);
        //Se declara una variable de tipo Boleano y se inicializa con un valor falso
        boolean salir = false;
        int opcion; //Guardaremos la opción del usuario
        while (!salir) { //Inicia la estructura de iteracion while, con una condicion en donde debe ser una opcion diferente a salir
            //Se muestran impresiones en pantalla con las diferentes opciones de nuestro menu
            System.out.println("*************------------------*****************");
            System.out.println("*               MENÚ PRINCIPAL                 *");
            System.out.println("*************-------------------****************");
            System.out.println(" ");
            System.out.println("-----------------------------------------------");
            System.out.println("------------                        -----------");
            System.out.println("Introduce el número de la opción que quieras  -");
            System.out.println("-----------------------------------------------");
            System.out.println(" ");
            System.out.println("        1. Suma ");
            System.out.println("        2. Resta ");
            System.out.println("        3. Multiplicación ");
            System.out.println("        4. Division");
            System.out.println("        5. Resto  ");
            System.out.println("-----------------------------------------------");
            System.out.println("        6. Salir                              -");
            System.out.println("-----------------------------------------------");
            System.out.println(" ");

            try { // Se inicia la sencia try para prever excepciones en el transcurso de la ejecución
                //Se realiza la impresion en pantalla en donde se pide al usuario que ingrese una de las opciones
                System.out.println("Selecciona una opcion");
                opcion = scanner.nextInt();

                switch (opcion) { //Se inicia la sentencia switch para estructura la seleccion multiple de nuestro menu
                    case 1: //Se crean los diferentes casos para las opciones de nuestro menu
                        System.out.println("Has seleccionado la opción 1: Suma ");
                        double num1, num2, suma;
                        System.out.println("Ingresa el primero numero");
                        num1 = scanner.nextDouble();
                        System.out.println("Ingresa el segundo numero");
                        num2 = scanner.nextDouble();
                        suma = num1 + num2;
                        System.out.println("El resultado de la suma es: " + suma);
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opción 2: Resta ");
                        double rest1, rest2, resta;
                        System.out.println("Ingresa el primer numero");
                        rest1 = scanner.nextInt();
                        System.out.println("Ingresa el segundo numero");
                        rest2 = scanner.nextInt();
                        resta = rest1 - rest2;
                        System.out.println("El resultado de la resta es: " + resta);
                        System.out.println(" ");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opción 3: Multiplicación ");
                        double mult1, mult2, multiplica;
                        System.out.println("Ingresa el primer numero");
                        mult1 = scanner.nextInt();
                        System.out.println("Ingresa el segundo numero");
                        mult2 = scanner.nextInt();
                        multiplica = mult1 * mult2;
                        System.out.println("El resultado de la  es: " + multiplica);
                        System.out.println(" ");
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opción 4: Division ");
                        double div1, div2, division;
                        System.out.println("Ingresa el primer numero");
                        div1 = scanner.nextInt();
                        System.out.println("Ingresa el segundo numero");
                        div2 = scanner.nextInt();
                        division = div1 / div2;
                        System.out.println("El resultado de la division es: " + division);
                        System.out.println(" ");
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opción 5: Resto");
                        double resto1, resto2, resto;
                        System.out.println("Ingresa el primer numero");
                        resto1 = scanner.nextInt();
                        System.out.println("Ingresa el segundo numero");
                        resto2 = scanner.nextInt();
                        resto = resto1 % resto2;
                        System.out.println("El resultado de la division es: " + resto);
                        System.out.println(" ");
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("El valor introducido es incorrecto, prueba de nuevo.");
                }

            }catch (InputMismatchException e){ // se capturan errores y excepciones que puedan ocurrir dentro del programa
                System.out.println("Debes insertar un numero");
                scanner.next();
            }
        }

    }
}



