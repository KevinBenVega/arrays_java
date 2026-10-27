import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] nombres = new int[8];

        for (int i = 0; i < nombres.length; i++){
            System.out.println("Ingresar numero en posicion " + i + ": ");
            int num = sc.nextInt();
            nombres[i] = num;
        }

        System.out.println("Numero a buscar: ");
        int numeroBuscar = sc.nextInt();

        int apariciones = 0;
        int index;

        for (int i = 0; i < nombres.length; i++){
            if(nombres[i] == numeroBuscar){
                apariciones += 1;
                index = i;
                System.out.println(i);
            }
        }

        System.out.println("Total: " + apariciones);
    }
}
