
package introjava;

import java.util.Scanner;


public class Ejercicio5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float gradosF;
        float gradosC;
        
        System.out.println("Ingrese los grados actuales del día");
        gradosC = leer.nextInt();
        
        gradosF = 32 + gradosC * 9/5;
        System.out.println("Su equivalente en grados fahrenheit es: " + gradosF+ "°");
    }
    
}
