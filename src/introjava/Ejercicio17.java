package introjava;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String cadena_caracteres = "";
        int contador_correcto = 0;
        int contador_incorrecto = 0;
        int longuitud;
            
        do {
            System.out.println("Ingrese una secuencia de caracteres");
            cadena_caracteres = leer.next();

            
            if (cadena_caracteres.equals("&&&&&")){
                break;
            }
            cadena_caracteres = cadena_caracteres.toLowerCase();
            longuitud = cadena_caracteres.length();
            
            if (cadena_caracteres.substring(0, 1).equals("x") && cadena_caracteres.substring(longuitud-1, longuitud).equals("o")) {
                contador_correcto = contador_correcto + 1;
            } else {
                contador_incorrecto = contador_incorrecto +1;
            }
            
            
            System.out.println("Para dejar de ingresar caracteres, escriba &&&&&");
            
        } while (!cadena_caracteres.equals("&&&&&"));
        System.out.println("La cantidad de lectutas correctas fueron: " + contador_correcto);
        System.out.println("La cantidad de lecturas incorrectas fueron: " + contador_incorrecto);
    }

}
