
package introjava;

import java.util.Scanner;


public class Ejercicio3 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        
        System.out.println("Hola "+nombre + " que tengas un lindo día");
        
    }
}
