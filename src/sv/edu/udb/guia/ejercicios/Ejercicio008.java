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
public class Ejercicio008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saludos. \n Introduzca la cantidad de sus ventas: ");
        float ventas = scanner.nextFloat();
        
        if (ventas > 0 && ventas <200){
            System.out.println("Su salario correspondiente es: $" + (200+ventas));
        }
        else if (ventas == 200){
            System.out.println("Su salario correspondiente es: $500");
        }
        else if (ventas > 200){
            System.out.println("Su salario correspondiente es: $" + (500+(ventas*0.1)));
        }
        else {
            System.out.println("Introduzca un numero mayor a 0, por favor");
        }
    }
    
}
