
package introjava;

import java.util.Scanner;


public class Ejercicio27 {
/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un 
programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9*/
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 3;
        
        int cuadradoMagico [][] = new int [n][n];
        // Le pedimos al usuario que llene el cuadrado
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico.length; j++) {
                System.out.print("CuadradoMagico["+i+"]"+"["+j+"]: ");
                cuadradoMagico[i][j] = leer.nextInt();
            }
            
        }
        // Mostramos el cuadrado
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico.length; j++) {
                System.out.print("["+cuadradoMagico[i][j]+"]");
            }
            System.out.println(" ");
        }
    }
    
}
