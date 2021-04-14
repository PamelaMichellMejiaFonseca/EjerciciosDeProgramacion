package EjerciciosBasicos2;
/*
6) Muestra los números del 1 al 100 (ambos incluidos)
divisibles entre 2 y 3. Utiliza el bucle que desees para realizarlo.
 (Pista: piensa que tienes que hacer para que el número sea divisible
  por 2 o 3)

 */
public class Ejercicio6 {
    public static void main(String[] args) {

        //Definimos el bucle, incluye el 100
        for (int num=1;num<=100;num++){
            //Comprobamos si es divisible entre 2 o 3
            if (num%2==0 || num%3==0){
                System.out.println(num);
            }
        }
    }

}
