
package introjava;

import java.util.Scanner;


public class Ejercicio6 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num,num2,num3;
        
        System.out.println("Ingrese un numero entero");
        num = leer.nextInt();
        
        num2 = num *2;
        num3 = num *3;
        
        double Rc = Math.sqrt(num);
        
        System.out.println("El doble del numero ingresado es: "+num2);
        System.out.println("El triple del numero ingresado es: "+num3); 
        System.out.println("La raiz cuadrada del numero ingresado es: "+Rc);
    }
    
}
