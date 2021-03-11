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
public class Ejercicio006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la mejor zapateria\n Cual es su total a pagar?");
        float total = scanner.nextFloat();

        if (total >= 150) {
            System.out.println("Su total con un descuento del 15% es de: \n " + (total * 0.85));
        } else if (total <= 150 && total > 0) {
            System.out.println("Su total con un descuento del 5% es de: \n " + (total * 0.95));

        } else {
            System.out.println("Coloque una cantidad mayor a cero, por favor.");
        }
    }

}
