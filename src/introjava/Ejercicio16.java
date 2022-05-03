package introjava;

import java.util.Scanner;

public class Ejercicio16 {

    /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int suma = 0;
        int num;
        int num2;
        int limite = 20;
        for (int i = 0; i <= limite; i++) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            System.out.println("Ingrese otro numero");
            num2 = leer.nextInt();
            suma = suma + num + num2;

            if (num == 0 || num2 == 0) {
                System.out.println("Se capturo el cero");
                break;
            } 
            if (num>1|| num2>1){
                suma = suma + num + num2;
            }   
        }
        System.out.println("La suma de los numeros ingresados es " + suma);
    }

}
