package Cajero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int [][] billetes = {{500, 1},{200, 3},{100, 0},
                {50,0},{20,0}, {10, 18}, {5,25}};
        CajeroAutomatico cajeroAutomatico = new CajeroAutomatico();
        cajeroAutomatico.setBilletes(billetes);

        TarjetaDebito tarjeta1 = new TarjetaDebito("12345678a", 1111, "Fran", "Fran", 20000);
        TarjetaCredito tarjeta2 = new TarjetaCredito("87654321b", 2222, "Javi", "Javi", 1000, 5000);
        CajeroAutomatico.getTarjeta().add(tarjeta1);
        CajeroAutomatico.getTarjeta().add(tarjeta2);


        while(true){
            Scanner scanner =new Scanner(System.in);
            cajeroAutomatico.mostrarCajero();

            System.out.println("********************************************************\n");
            System.out.println(     "Bienvenido al Cajero Automático de DAW");
            System.out.println("Introduce el número de las siguiente opciones");
            System.out.println("1. Sacar Dinero");
            System.out.println("2. Salir ");
            System.out.println("****************************************************+*****\n");


            int opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    cajeroAutomatico.sacarDinero();
                    break;
                case 2:
                    System.out.println("La aplicación ha Finalizado");
                     break;
                default:
                    System.out.println("Los datos introducidos no son correctos");
                    break;
            }

        }

    }

}
