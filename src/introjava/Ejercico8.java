
package introjava;

import java.util.Scanner;


public class Ejercico8 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero se determinara si es par o impar");
        num = leer.nextInt();
        
        
        if (num % 2 == 0 )  {
            System.out.print("El numero ingreaso es par");
            
        } else { 
            System.out.print("El numero ingresado es impar");
        }
    }
    
}
