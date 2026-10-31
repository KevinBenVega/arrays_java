import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] nombres = new int[7];
        int varAuxiliar = 0;
        int j = 0;

        for (int i = 0; i < nombres.length; i++){
            System.out.println("Ingrese el numero de la posicion " + i);
            int num = sc.nextInt();
            nombres[i] = num;
        }

        for (int i = (nombres.length - 1); i >= 0 && i >= j; i--){
            varAuxiliar = nombres[i];
            nombres[i] = nombres[j];
            nombres[j] = varAuxiliar;
            j+=1;
        }

        System.out.println("Array final: " + Arrays.toString(nombres));

    }
}
