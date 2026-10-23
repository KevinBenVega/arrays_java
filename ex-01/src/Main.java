import java.util.Scanner;

public class Main {
    public static void main(){

        Scanner sc = new Scanner(System.in);

        int[] dades = new int[5];

        for (int i = 0; i < dades.length; i++){
            System.out.println("Ingrese el numero " + i);
            int num = sc.nextInt();
            dades[i] = num;
        }

        for (int i = 0; i< dades.length; i++){
            System.out.println(i + ": "+ dades[i]);
        }

        System.out.println("Longitud: " + dades.length);
        System.out.println("Primer valor: " + dades[0]);
        System.out.println("Ultimo valor: " + dades[dades.length - 1]);
    }
}
