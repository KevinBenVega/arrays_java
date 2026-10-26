import java.util.Scanner;

public class Main {
    public static void main(){

        Scanner sc = new Scanner(System.in);

        int[] nombres = new int[7];

        for (int i = 0; i < nombres.length; i++){
            System.out.println("Ingrese el numero " + i);
            int num = sc.nextInt();
            nombres[i] = num;
        }

        int maximo = nombres[0];
        int posicionMaximo = 0;

        int minimo = nombres[0];
        int posicionMinimo = 0;

        for (int i = 1; i < nombres.length; i++){
            if (nombres[i] > maximo){
                maximo = nombres[i];
                posicionMaximo = i;
            }

            if(nombres[i] < minimo){
                minimo = nombres[i];
                posicionMinimo = i;
            }
        }

        System.out.println("Maximo: " + maximo + ", al indice " + posicionMaximo);
        System.out.println("Minimo: " + minimo + ", al indice " + posicionMinimo);

    }
}
