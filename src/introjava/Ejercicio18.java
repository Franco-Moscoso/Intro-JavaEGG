
package introjava;
import java.util.Scanner;
public class Ejercicio18 {
/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E.*/ 
   
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num;
        int contador = 0;
        int limite = 9;
        String letra="";
        
        while(contador <limite);{
       for (int i = 0; i <= limite ; i++){
           contador = contador +1;
           
           
           
           if (contador == 3) {
              letra.equals("E");
              
           }
       }  
    }
        
            
        
    }
    
}
