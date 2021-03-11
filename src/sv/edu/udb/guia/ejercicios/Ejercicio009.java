/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.guia.ejercicios;

import java.util.Scanner;

/**
 *
 * @author MarlonCarbonero
 */
public class Ejercicio009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saludos.\n Qué tipo de dato es? ");
        String conv = scanner.nextLine();
        System.out.println("Escriba el dato numerico: ");
        int cantidad = scanner.nextInt();

        if (conv.equalsIgnoreCase("Celsius") || conv.equalsIgnoreCase("C")) {
            System.out.println("El resultado de su conversion es: " + ((cantidad * 1.8) + 32));
        } else if (conv.equalsIgnoreCase("farenheit") || conv.equalsIgnoreCase("F")) {
            System.out.println("El resultado de su conversion es: " + (((cantidad - 32) / 1.8)));
        }

    }

}
