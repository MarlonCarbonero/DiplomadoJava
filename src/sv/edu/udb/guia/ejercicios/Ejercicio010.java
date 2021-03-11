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
public class Ejercicio010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido. \n A continuación escriba dos numeros: ");
        System.out.println("Primer numero: ");
        int primer = scanner.nextInt();
        System.out.println("Segundo numero: ");
        int segundo = scanner.nextInt();

        if (primer < 0 && segundo > 0) {
            System.out.println("Son de signos diferentes.");
        } else if (segundo < 0 && primer > 0) {
            System.out.println("Son de signos diferentes.");
        } else {
            System.out.println("Su simbolo es igual");
        }
    }

}
