
package introjava;

import java.util.Scanner;


public class Ejercicio7 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num,num2;
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        System.out.println("Ingrese otro numero");
        num2 = leer.nextInt();
        
        if (num > num2) { 

        System.out.println("El primero numero ingresado es mayor");
        
        } else  {
        System.out.println("El segundo numero ingresado es mayor");
    }
    }
    
}
