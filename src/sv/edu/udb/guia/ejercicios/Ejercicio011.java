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
public class Ejercicio011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido \n Escriba el peso en onzas:");
        int peso = scanner.nextInt();
        
        if (peso == 1){
            System.out.println("El costo es: $0.25");
        }
        else if (peso >= 1){
            System.out.println("El costo es: $" + (((peso-1)*0.04)+0.25));
        }
    }

}
