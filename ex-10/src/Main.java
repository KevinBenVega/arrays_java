import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] nombres1 = new int[5];
        int[] nombres2 = new int[5];
        int[] resultat = new int[5];

        for (int i = 0; i < nombres1.length; i++){
            System.out.println("Ingrese el numero " + i + " del primer array");
            int num = sc.nextInt();
            nombres1[i] = num;
        }

        System.out.println("");
        for (int i = 0; i < nombres1.length; i++){
            System.out.println("Ingrese el numero " + i + " del segundo array");
            int num = sc.nextInt();
            nombres2[i] = num;
        }

        for (int i = 0; i < nombres1.length; i++){
            resultat[i] = nombres1[i] + nombres2[i];
        }

        System.out.println("");
        System.out.println("Primer array: " + Arrays.toString(nombres1));
        System.out.println("Segundo array: " + Arrays.toString(nombres2));
        System.out.println("Resultat: " + Arrays.toString(resultat));

    }
}
