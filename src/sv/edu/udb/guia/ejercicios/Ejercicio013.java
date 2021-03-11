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
public class Ejercicio013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido \n Escriba a continuación los numeros (tienen que ser positivos)");
        System.out.println("Primer numero: ");
        int primer = scanner.nextInt();
        System.out.println("Segundo numero: ");
        int segundo = scanner.nextInt();

        if (primer > segundo) {
            System.out.println("La diferencia entre los numeros es: " + (primer - segundo));
        } else if (segundo > primer) {
            System.out.println("La diferencia entre los numeros es: " + (segundo - primer));
        } else if (primer == segundo || primer <= 0 || segundo <= 0) {
            System.out.println("Por favor escriba numeros que sean distintos, sean positivos y mayores a cero");
        }
    }

}
