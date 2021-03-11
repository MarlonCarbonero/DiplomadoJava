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
public class Ejercicio014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido\n Por favor, escriba cuántas horas ha trabajado: ");
        int horas = scanner.nextInt();
        System.out.println("Ingrese cuál es el pago por 1 hora de trabajo que recibe: ");
        int pago = scanner.nextInt();
        
        if (horas<=30){
            System.out.println("Su pago total es: " + (horas*pago));
        }
        else if (horas>30){
            System.out.println("Su pago total es: " + ((pago*30)+((pago*1.5)*(horas-30))));
        }
        else 
        {
            System.out.println("Escriba valores validos, por favor");
        }
        
    }

}
