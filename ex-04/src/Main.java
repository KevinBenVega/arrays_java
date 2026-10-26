import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] nombres = new int[8];
        int numPositivos = 0;
        int numNegativos = 0;
        int numCeros = 0;

        for (int i = 0; i < nombres.length; i++){
            System.out.println("Ingrese el numero " + i);
            int num = sc.nextInt();
            nombres[i] = num;
        }

        for (int i = 0; i < nombres.length; i++){
            if (nombres[i] > 0) {
                numPositivos += 1;
            } else if (nombres[i] < 0) {
                numNegativos += 1;
            } else {
                numCeros += 1;
            }
        }

        System.out.println("Positivos: " + numPositivos);
        System.out.println("Negativos: " + numNegativos);
        System.out.println("Ceros: " + numCeros);

    }
}
