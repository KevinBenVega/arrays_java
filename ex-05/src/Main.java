import java.util.Scanner;

public class Main {
    public static void main(){

        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[7];

        for (int i = 0; i < array1.length; i++){
            System.out.println("Ingrese el numero " + i);
            int num = sc.nextInt();
            array1[i] = num;
        }

        int maximo = array1[0];
        int posicionMaximo = 0;

        int minimo = array1[0];
        int posicionMinimo = 0;

        for (int i = 1; i < array1.length; i++){
            if (array1[i] > maximo){
                maximo = array1[i];
                posicionMaximo = i;
            }

            if(array1[i] < minimo){
                minimo = array1[i];
                posicionMinimo = i;
            }

        }

        System.out.println("Maximo: " + maximo + ", al indice " + posicionMaximo);
        System.out.println("Minimo: " + minimo + ", al indice " + posicionMinimo);

    }
}
