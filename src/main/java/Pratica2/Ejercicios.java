package Pratica2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ejercicios {

    private static final StringBuilder numberString = new StringBuilder(); //cambiar esto

    public static void (){
        int[] numbers = new util.Array();
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                numberString.append(numbers[i]).append(", ");
            } else {
                numberString.append(numbers[i]);
            }
        }
        System.out.println(" ");
        System.out.println("Numbers: " + numberString);
    }


}
