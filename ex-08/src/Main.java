import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(){

        Scanner sc = new Scanner(System.in);

        int[] nombres = new int[5];
        int indexModificar = 0;

        for(int i = 0; i < nombres.length; i++){
            System.out.println("Ingrese el numero en posicion " + i);
            int num = sc.nextInt();
            nombres[i] = num;
        }


        System.out.println("");
        System.out.println("Ingrese el indice a modificar");
        int index = sc.nextInt();

        System.out.println("");
        while (index < 0 || index >= nombres.length){
            System.out.println("Ingrese el indice correcto (0-4)");
            index = sc.nextInt();
        }

        System.out.println("");
        System.out.println("Ingrese el nuevo valor");
        int nuevoValor = sc.nextInt();

        for (int i = 0; i < nombres.length; i++){
            if(i == index){
                nombres[i] = nuevoValor;
            }
        }

        System.out.println("");
        System.out.println("Nuevo array: " + Arrays.toString(nombres));
    }
}
