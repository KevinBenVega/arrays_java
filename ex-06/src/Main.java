import java.util.Scanner;

public class Main {
    public static void main(String[] arcs){

        Scanner sc = new Scanner(System.in);

        int[] array = new int[8];

        for (int i = 0; i < array.length; i++){
            System.out.println("Ingresar numero en posicion " + i + ": ");
            int num = sc.nextInt();
            array[i] = num;
        }

        System.out.println("");
        System.out.println("Numero a buscar: ");
        int numeroBuscar = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < array.length && encontrado == false; i++){
            if(array[i] == numeroBuscar){
                System.out.println("Indice del valor encontrado: " + i);
                encontrado = true;
            }
        }

        System.out.println("");
        if (encontrado == false){
            System.out.println("Valor no encontrado");
        }

    }
}
