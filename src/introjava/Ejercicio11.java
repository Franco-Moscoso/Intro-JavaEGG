
package introjava;

import java.util.Scanner;


public class Ejercicio11 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String frase;
        String caracteres;
       
        System.out.println("Ingrese una frase");
        frase = leer.next();
        
        frase = frase.toLowerCase();
       
        
        if (frase.substring(0, 1).equals("a")){
            System.out.println("Correcto");
        } else { 
            System.out.println("Incorrecto");
      
        }
    }
    
}
