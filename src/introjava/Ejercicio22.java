
package introjava;
import java.util.Scanner;

public class Ejercicio22 {
/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int aux;
        int [] vector =  new int [100];
        // lleno el vector con numeros randoms
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*100);
            System.out.println("["+ vector[i]+"]");
        }
        // Ordeno el vector de menor a mayor
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                
                if (vector[i] > vector[j]){
                   aux = vector[i];
                   vector[i] = vector[j];
                   vector[j] = aux;
                }
            }
    
        }
        System.out.println("Vector aleatorio, ordenado de menor a mayor");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]"+" ,");
        }
    }
    
}
