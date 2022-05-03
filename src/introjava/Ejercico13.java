
package introjava;

import java.util.Scanner;


public class Ejercico13 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int notas;
    
        
        System.out.println("Ingrese su calificación");
         notas = leer.nextInt();
      
             
         
         while (notas > 10 || notas <1 )  { 
        System.out.println("Calificacion incorrecta");
        
             System.out.println("Ingrese nuevamente la calificacion");
             notas = leer.nextInt();
        
         }
}
}