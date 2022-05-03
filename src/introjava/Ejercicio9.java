
package introjava;

import java.util.Scanner;


public class Ejercicio9 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String frase;
        
        System.out.println("Ingrese una frase");
        frase = leer.next();
        
        frase = frase.toLowerCase();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
           
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
