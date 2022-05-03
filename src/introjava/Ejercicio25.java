
package introjava;

import java.util.Scanner;
public class Ejercicio25 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int [] [] matriz = new int [4][4];
        // llenamos la matriz con numeros aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz [i][j] = (int) (Math.random()*100);
            }
   
        }
        // Mostramos la matriz completa
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+matriz [i][j]+"]"); 
            }
            System.out.println(" ");
        }
    }
    
}
