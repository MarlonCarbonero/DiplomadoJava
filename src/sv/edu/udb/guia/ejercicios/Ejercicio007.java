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
public class Ejercicio007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite los siguientes dados. \n Cual es su nombre?");
        String nombre = scanner.nextLine();
        System.out.println("Cual es su edad?");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Cual es su numero telefonico?");
        String telefono = scanner.nextLine();
        System.out.println("Cual es su genero?");
        String sexo = scanner.nextLine();
        
        if(sexo.equalsIgnoreCase("femenino") || sexo.equalsIgnoreCase("f")){
            System.out.println("La Sra. " + nombre + " ha sido registrada");
        }
        else if(sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")){
            System.out.println("El Sr. " + nombre + " ha sido registrada");
        }
    }

}
