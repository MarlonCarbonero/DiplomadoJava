/*
Elaborar un programa que permita convertir una medida escogiendo las unidades actuales
y el tipo de conversion que desea. Conversiones de centimetro a pulgadas, metros a pies,
pies a pulgadas, metros a centimetros
 */
package sv.edu.udb.guia.ejercicios;

import java.util.Scanner;

/**
 *
 * @author MarlonCarbonero
 */
public class Ejercicio004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tipo;
        double cantidad;
        double respuesta;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que desea convertir: ");
        cantidad = scanner.nextDouble();
        System.out.println("Ingrese el numero segun el tipo de conversion que desea");
        System.out.println("Ingrese 1 si desea de cm a pulg");
        System.out.println("Ingrese 2 si desea de metros a pies");
        System.out.println("Ingrese 3 si desea de pies a pulg");
        System.out.println("Ingrese 4 si desea de metros a cm");
        tipo = scanner.nextInt();

        if (tipo == 1) {
            respuesta = cantidad / 2.54;
            System.out.println("Respuesta = " + respuesta);
        } else if (tipo == 2) {
            respuesta = cantidad * 3.28;
            System.out.println("Respuesta = " + respuesta);
        } else if (tipo == 3) {
            respuesta = cantidad * 12;
            System.out.println("Respuesta = " + respuesta);
        } else if (tipo == 4) {
            respuesta = cantidad * 100;
            System.out.println("Respuesta = " + respuesta);
        }
    }

}
