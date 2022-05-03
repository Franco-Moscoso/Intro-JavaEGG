package introjava;

import java.util.Scanner;

public class Ejercicio26 {

    /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de 
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o 
viceversa)*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;

        System.out.println("Ingrese el tamaño de las filas");
        n = leer.nextInt();
        System.out.println("Ingrese el tamaño de las columnas");
        n = leer.nextInt();
        int matriz [][] = new int[n][n];
        
        // llenamos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = (int) (Math.random() * 20);
            }

        }
        //mostramos matriz original
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print("[" + matriz[i][j] + "]"+" ");

            }
            System.out.println(" ");
        }
        // transponiendo la matriz
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;

            }

        }
        // Mostramos la matriz transpuesta
        System.out.println("-----------------");
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print("[" + matriz[i][j] + "]"+" ");
            }
            System.out.println(" ");

        } 
        //System.out.println (matrizT [n][n] matriz);
    }

    /*public static void  matrizT(int[][] matriz) {
        // llenamos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = (int) (Math.random() * 20);
            }

        }
        //mostramos matriz original
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println(" ");
        }
        // transponiendo la matriz
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;

            }

        }
        // Mostramos la matriz transpuesta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.println("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");

        }
        
    } */ 

}
