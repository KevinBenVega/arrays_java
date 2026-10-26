import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] nombres = new int[5];
        int sumaNombres = 0;

        for (int i = 0; i < nombres.length; i++){
            System.out.println("Ingrese el numero " + i);
            int num = sc.nextInt();
            nombres[i] = num;
            sumaNombres += nombres[i];
        }

        double mitjana = (double) sumaNombres /  nombres.length;

        System.out.println("Suma: " + sumaNombres);
        System.out.println("Mitjana: " + mitjana);

    }
}
