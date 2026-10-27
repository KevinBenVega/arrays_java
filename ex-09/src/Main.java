import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arrayOriginal = new int[5];
        int[] arrayCopia = new int[5];

        for(int i = 0; i < arrayOriginal.length; i++){
            System.out.println("Ingrese el numero en posicion " + i);
            int num = sc.nextInt();
            arrayOriginal[i] = num;
        }

        for(int i = 0; i < arrayCopia.length; i++){
            arrayCopia[i] = arrayOriginal[i];
        }

        for(int i = 0; i < arrayCopia.length; i++){
            arrayCopia[i] *= 2;
        }

        System.out.println("Original: " + Arrays.toString(arrayOriginal));
        System.out.println("Copia: " + Arrays.toString(arrayCopia));

    }
}
