
package introjava;

import java.util.Scanner;


public class Ejercicio12 {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         int motor;
         System.out.println("Ingrese el tamaño del motor,(maximo 4)");
         motor = leer.nextInt();
         
         
         switch (motor){
             case 1: System.out.println("La bomba es de agua");
             break;
             case 2: System.out.println("La bomba es de gasolina");
             break;
             case 3: System.out.println("La bomba es de hormigón");
             break;
             case 4: System.out.println("La bomba es de pasta alimenticia");
             break;
             default: System.out.println("No existe un valor valido para el tipo de bomba");
         }
    }
    
    
}
