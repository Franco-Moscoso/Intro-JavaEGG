
package introjava;

import java.util.Scanner;


public class Ejercicio4 {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.next();
        
        System.out.println("La palabra en mayusculas es: "+frase.toUpperCase());        
                
        System.out.println("La palabra en minusculas es: "+frase.toLowerCase());
    }

    
    }
    

