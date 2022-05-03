package introjava;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n;
        System.out.println("Ingrese el tamaño del cuadrado");
        n = leer.nextInt();

        if (n >= 0 && n <= 50) {
            //linea superior del cuadrado
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();

            //centro del cuadrado
            for (int i = 0; i < n - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            //linea inferior del cuadrado
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("El valor no esta entre los parametros, intente nuevamente");
        }

    }
}
