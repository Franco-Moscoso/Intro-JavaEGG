
package introjava;
import java.util.Scanner;

public class Ejercicio23 {
/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido*/
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        boolean no_repite = false;
        int vector [] = new int [n];
        // llenamos el vector con numeros aleatorios
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*100);
            System.out.println("["+vector[i]+"]");
        }
        // recorremos el vector para averiguar si un numero se repite
        for (int i = 0; i < vector.length; i++) {
            
              for (int j = 0; j < vector.length; j++) {
                if (i!=j && vector[i] == vector[j]){
                    
                  System.out.println("El numero esta repetido, y se encuentra en la posicion "+i);
                }else{
                    no_repite = true;
                }
                    
                       
                }
                
                
            }
             if (no_repite = true){
                    System.out.println("El numero no se repite");
                }
        }
    }
    
    

