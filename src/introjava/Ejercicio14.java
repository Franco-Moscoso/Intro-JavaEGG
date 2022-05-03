
package introjava;
import java.util.Scanner;
public class Ejercicio14 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int limite;
        int num;
        int suma = 0;
        int num2;
        System.out.println("Ingrese un valor limite positivo");
        limite = leer.nextInt();
        
        while(limite > suma) {
            
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            System.out.println("Ingrese otro numero");
            num2 = leer.nextInt();
            suma = num + num2;
            
            if (suma > limite){
                System.out.println("La suma de los numeros supero el limite");
                break;
            }
        }
        
    }
    
}
