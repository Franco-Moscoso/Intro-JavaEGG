package introjava;

import java.util.Scanner;

public class Ejeicio21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double cantidad;

        System.out.println("Ingrese una cantidad en euros");
        cantidad = leer.nextFloat();

        System.out.println(cambiodivisas(cantidad));
    }

    public static float cambiodivisas(double cantidad) {
        Scanner leer = new Scanner(System.in);
        String confirmar = "";
        int opcion;

        do {

            System.out.println("1.Cambiar dinero a libras");
            System.out.println("2.Cambiar dinero a yenes");
            System.out.println("3.Cambiar dinero a dolares");
            System.out.println("4.Salir");
            System.out.println("Escoja una opcion");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cantidad = cantidad *  0.86;
                    
                System.out.println(cantidad + " Libras");
                    break;
                case 2:
                    
                    cantidad = cantidad * 129.852;
                    
                System.out.println(cantidad + " Yenes");
                    break;
                case 3:
                    cantidad = cantidad * 1.28611;
                    
                System.out.println(cantidad + " Dolares");
                    break;
                case 4:
                    System.out.println("Estas seguro que quieres salir? S/N");
                    confirmar = leer.next();
                    
                    break;
                default:
                    System.out.println("Opcion no valida intente nuevamente");

            }

        } while (!confirmar.equals("S"));

        return (float) cantidad;

    }
}
