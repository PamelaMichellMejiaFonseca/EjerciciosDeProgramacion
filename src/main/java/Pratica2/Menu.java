package Pratica2;

public class Menu {
    public static void main(String[] args) {

        String opciones;
        do{
            opciones = Until.askOpciones();
            switch(opciones){
                case 1:
                   Ejercicios.pedirNumeros();
                    break;
                case 2:
                    Ejercicios.numerosInversa();
                    break;
                case 3:
                    Ejercicios.mediaNumeros();
                    break;
                case 4:
                    Ejercicios.cantidadCaracteres();
                    break;
                case 5:
                    Ejercicios.textoInvertido();
                    break;
                case 6:
                    Ejercicios.textoSinEspacios();
                    break;
                case 7:
                    Ejercicios.concatenacion();
                    break;
                case 8:
                    Ejercicios.sustituirVocales();
                    break;
                case 9:
                    Ejercicios.codigoASCII();
                    break;
                case 0:
                    System.out.println("El proceso a finalizado.");
                    break;
                default:


            }
        }
    }

}
