package Pratica2;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int menuOpcion;

        do {


            opciones = sc.nextInt();
            switch (menuOpcion) {
                case 1:
                    pedirNumeros();
                    break;
                case 2:
                    numerosInversa();
                    break;
                case 3:
                    mediaNumeros();
                    break;
                case 4:
                    cantidadCaracteres();
                    break;
                case 5:
                    textoInvertido();
                    break;
                case 6:
                    textoSinEspacios();
                    break;
                case 7:
                    concatenarTexto();
                    break;
                case 8:
                    sustituirVocales();
                    break;
                case 9:
                    codigoASCII();
                    break;
                case 0:
                    System.out.println("El proceso a finalizado.");
                    break;
                default:

            }
        } while (menuOpcion != 0);
    }
     /*
     *Para hacer la pregunta directamente y sin no es correcta dara un el mensaje de error
     * lo utilizo en alguno de los metodos no en todos
      */

    public static String pregunta(String text) {
        String value = " ";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(isr);
            System.out.print(text + ": ");
            value = bf.readLine();
        } catch (IOException ex) {
            System.out.println("Tienes un error");
        }
        return value;
    }

    /*
    Case numero 1.
     */
    public static void pedirNumeros(){
        int valor[] = new int[5];
        for(int i=0; i<valor.length; i++)
        {
            System.out.println("Introduce el número: ");
            valor[i] = sc.nextInt();
        }
        System.out.println("Los números en el orden introducidos son: ");
        for(int i=0; i<valor.length; i++){
            System.out.println(valor[i]);
        }
    }
    /*
    Case numero 2.
     */
    public static void numerosInversa(){
        int valorInversa[] = new int[5];
        for(int i=0; i < valorInversa.length; i++){
            System.out.println("Introduce el número:");
            valorInversa[i] = sc.nextInt();
        }
        for (int i = valorInversa.length - 1; i >= 0; i--) {
            System.out.println(valorInversa[i]);

        }
        System.out.println("Los números introducidos a la inversa son: ");
    }
    /*
    Case numero 3
     */
    public static void mediaNumeros() {
        //variables que guardan los numeros introducidos en diferentes grupos
        int numero, suma_posi=0, conteo_pos=0, suma_neg=0, conteo_neg=0, conteo_ceros=0;
        float media_post, media_neg; //guarda las medias de los numero negativos y positivos

        for(int i=1; i<=5; i++){ //Pedir con un bucle for los numeros al usuario
            //lo que se hace con el JOptionPane.showInputDialog es pedir al usuario por pantalla los numeros introducidos
             numero = Integer.parseInt(pregunta("Indroduce el numero: " +i));
            if(numero == 0){ // si el numero es cero
                conteo_ceros++; //aumentamos en 1 el conteo de 0
            }
            else if (numero>0){ //si el numero es positivo
                suma_posi +=numero; //suma iterativa de positivos
                conteo_pos++;
            }
            //si el numero es negativo
            else{
                suma_neg += numero;
                conteo_neg++;
            }

        }
        //Hacemos la media de los numeros positivos
        if(conteo_pos == 0){ //si en el caso que el conteo siga siendo cero nos dara el siguiente mensaje
            System.out.println("No se puede sacar la media de los positivos");
        }
        else{
            media_post =(float) suma_posi /conteo_pos;
            System.out.println("La media de los positivos es: " + media_post);
        }
        //Hacemos la media de los nuemeros negativos
        if(conteo_neg == 0){
            System.out.println("No se puede sacar la media de los negativos");

        }
        else{
            media_neg =(float) suma_neg /conteo_neg;
            System.out.println("La media de los negativos: " + media_neg);
        }
        System.out.println("La cantidad de ceros es: "+conteo_ceros );

    }
    /*
     * Case 4
     */
    public static void cantidadCaracteres() {
        String textoNuevo = pregunta("Introduce un texto");//remplaza los espacios en blanco
        String espacios = textoNuevo.replace(" ", ""); //para tener una mejor respuesta he puesto el valor de la cadena sin espacios y el valor de la cadena con espacios
        System.out.println("Tu cadena tiene " + textoNuevo.length() + "caracteres contando los espacios.");
        System.out.println("Tu cadena tiene " + espacios.length() + " caracteres sin contar los espacios.");// cuenta los caracteres de la cadena sin espacios
    }
    /*
     *Case 5
     */
    public static void textoInvertido (){
        String nuevoTxt = pregunta("Introduce texto que quieres que se muestre a la inversa: "); //pedimos al usuario que introduzca pero tambien es un variable de tipo String que podemos usar
        String textoInversa = new StringBuffer(nuevoTxt).reverse().toString(); //se convierte el texto introducido anterior llamandolo desde el nombre de la variable
        System.out.println("El texto al revés es:  " + textoInversa);
    }

    /*
     *Case 6
     */
    public static void textoSinEspacios(){
        String nuevoTxt= pregunta("Introduce el texto");
        String sinEspacios = nuevoTxt.replace(" ", ""); // los espacios seran remplazados
        System.out.println("El texto sin espacios es : " + sinEspacios);
    }
    /*
     *Case 7
     */
    public static void concatenarTexto(){
        String texto1 = pregunta("Introduce la primera palabra o texto");
        String texto2 = pregunta("Introduce la segunda palabra o texto");
        System.out.println("El resultado de union es:");
        System.out.println(texto1.concat( " " + texto2));//método para concatenar espacios

    }







}
