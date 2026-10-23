import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] nombres = new int[6];

        for (int i = 0; i < nombres.length; i++){
            System.out.println("Ingrese el numero " + i);
            int num = sc.nextInt();
            nombres[i] = num;
        }

        System.out.println("Array de forma descendente");
        for (int i=(nombres.length - 1); i >= 0; i--){
            System.out.println(nombres[i]);
        }

        System.out.println("Array original");
        for (int i = 0; i< nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }
}
