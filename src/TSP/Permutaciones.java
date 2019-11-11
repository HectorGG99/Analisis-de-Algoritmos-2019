package TSP;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Hector GG
 */
public class Permutaciones {

    public static int[][] matriz = {{0, 13, 33, 28, 37, 7, 32, 40, 80, 26}, {0, 0, 39, 83, 50, 68, 16, 98, 81, 55},
            {0, 0, 0, 80, 88, 49, 53, 75, 63, 55}, {0, 0, 0, 0, 94, 4, 20, 6, 59, 76}, {0, 0, 0, 0, 0, 81, 87, 85, 4, 19}, {0, 0, 0, 0, 0, 0, 96, 53, 40, 37},
            {0, 0, 0, 0, 0, 0, 0, 80, 57, 68}, {0, 0, 0, 0, 0, 0, 0, 0, 65, 41}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 97}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

    public static int a = 0;
    public static void main(String[] args) {
        int acumulador=0;
        for(int a=0;a<matriz.length;a++){
            acumulador = acumulador + matriz[0][a];
        }
        
        System.out.println("El peso de todos los caminos es: "+acumulador);
        System.out.println("Los posibles caminos son");
        
        int[] perm = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        do {
            System.out.println(Arrays.toString(perm));
        } while (nextPermutation(perm));

                
    }

    private static boolean nextPermutation(int[] array) {
        //
        int i = array.length - 1;
        if (array[0] == 0) {
            while (i > 0 && array[i - 1] >= array[i]) {
                i--;
            }
            //
            if (i <= 0) {
                return false;
            }
            //
            int j = array.length - 1;
            while (array[j] <= array[i - 1]) {
                j--;
            }
            //
            int temp = array[i - 1];
            array[i - 1] = array[j];
            array[j] = temp;
            //
            j = array.length - 1;
            while (i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
            return true;

        } else {
            return false;
        }

    }
}
