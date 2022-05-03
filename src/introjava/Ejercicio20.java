
package introjava;

import java.util.Scanner;
public class Ejercicio20 {
/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor*/
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
       int n;
       int num2;
       int num3;
       int num4;
        System.out.println("Ingrese un numero del 1 al 20");
        n = leer.nextInt();
        System.out.println("Ingrese un numero del 1 al 20");
        num2 = leer.nextInt();
        System.out.println("Ingrese un numero del 1 al 20");
        num3 = leer.nextInt();
        System.out.println("Ingrese un numero del 1 al 20");
        num4 = leer.nextInt();
        
       System.out.println(n);
       for (int i = 0; i < n; i++){
           System.out.print("*");
       }
        
       System.out.println(num2);
       for (int i = 0; i < num2; i++){
           System.out.print("*");
       }
        
       for (int i = 0; i < num3; i++){
           System.out.print("*");
       }
       System.out.println(num3);
        
       for (int i = 0; i < num4; i++){
           System.out.print("*");
       }
        System.out.println(num4);
    }
    
}
