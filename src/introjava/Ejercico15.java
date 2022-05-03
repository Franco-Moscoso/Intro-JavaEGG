
package introjava;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercico15 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num1;
        int num2;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        int opcion;
        boolean salir = false;    
        String confirmar = "";
        
        System.out.println("Ingrese un numero positivo");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero Positivo");
        num2 = leer.nextInt();
        
       while (!salir){
        
        System.out.println("Bienvenido al menu!");
            System.out.println("1 Sumar");
            System.out.println("2 Restar");
            System.out.println("2 Multiplicar");
            System.out.println("4 Dividir");
            System.out.println("5 Salir");
            
            System.out.println("Escoja una opcion");
            opcion = leer.nextInt();
            
            try {
           
        switch (opcion){
            
            case 1: 
            suma = num1 + num2;
                System.out.println("La suma de los dos numeros es: "+suma);
            break;
            
            case 2: 
            resta = num1 - num2;
                System.out.println("La resta de los dos numeros es: "+resta);
            break;
            
            case 3: 
            multiplicacion = num1 * num2;
                System.out.println("La multiplicacion de los dos numeros es: "+multiplicacion);
            break;
            
            case 4: 
            division = num1 % num2;
                System.out.println("La division de los dos numeros es: "+division);
            break;
            
            case 5: 
                System.out.println("Estas seguro que quieres salir del menu?,S/N");
                confirmar = leer.next();
                 if (confirmar.equals("S"))
                  confirmar.toLowerCase(); 
                 salir = true;
                 
                
            
            break;
            
            default: System.out.println("Opcion no valida");
            
                
        } 
                
    }catch (InputMismatchException e){
    System.out.println("Debes ingresar un numero");
            leer.next();
    }
       }
    }
}