
package introjava;

import java.util.Scanner;
public class Ejercicio10 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String frase;
        
        System.out.println("Ingrese una frase o palabra de 8 caracteres");
        frase = leer.next();
        
        
                
        
        if (frase.length()== 8) {
            System.out.println("Correcto");
            
        } else { 
            System.out.println("Incorrecto, intente nuevamente");
        }
    }
    
}
