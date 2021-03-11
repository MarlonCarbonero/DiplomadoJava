/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.guia.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MarlonCarbonero
 */
public class Ejercicio016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido.\nEscriba los siguientes datos por favor.");
        String[] nombre = new String[6];
        String[] genero = new String[6];
        int[] pago = new int[6];
        int[] horas = new int[6];
        int masculino = 0;
        int femenino = 0;
        int totalm = 0;
        int totalf = 0;
        int genm = 0;
        int genf = 0;

        for (int i = 0; i < nombre.length; i++) {

            System.out.println("Escriba el nombre del empleado numero " + (i + 1) + ": ");
            nombre[i] = scanner.nextLine();
            System.out.println("Escriba el genero del empleado numero " + (i + 1) + ": ");
            genero[i] = scanner.nextLine();
            System.out.println("Escriba el pago por hora del empleado numero " + (i + 1) + ": ");
            pago[i] = scanner.nextInt();
            System.out.println("Escriba las horas trabajadas por el empleado numero " + (i + 1) + ": ");
            horas[i] = scanner.nextInt();
            scanner.nextLine();

            if (genero[i].equals("masculino")) {

                genm++;
                masculino = (pago[i] * horas[i]);
                totalm = totalm + masculino;

            } else if (genero[i].equals("femenino")) {
                genf++;
                femenino = (pago[i] * horas[i]);
                totalf = totalf + femenino;
            }

        }

        System.out.println("El empleado " + nombre[0] + " ha trabajado " + horas[0] + " horas por $" + pago[0] + " cada una, con un total de : $" + (horas[0] * pago[0]));
        System.out.println("El empleado " + nombre[1] + " ha trabajado " + horas[1] + " horas por $" + pago[1] + " cada una, con un total de : $" + (horas[1] * pago[1]));
        System.out.println("El empleado " + nombre[2] + " ha trabajado " + horas[2] + " horas por $" + pago[2] + " cada una, con un total de : $" + (horas[2] * pago[2]));
        System.out.println("El empleado " + nombre[3] + " ha trabajado " + horas[3] + " horas por $" + pago[3] + " cada una, con un total de : $" + (horas[3] * pago[3]));
        System.out.println("El empleado " + nombre[4] + " ha trabajado " + horas[4] + " horas por $" + pago[4] + " cada una, con un total de : $" + (horas[4] * pago[4]));
        System.out.println("El empleado " + nombre[5] + " ha trabajado " + horas[5] + " horas por $" + pago[5] + " cada una, con un total de : $" + (horas[5] * pago[5]));

        System.out.println("El total pagado al genero masculino es: $" + totalm);
        System.out.println("El promedio de pago masculino es: $" + (totalm / genm));
        System.out.println("El total pagado al genero femenino: $" + totalf);
        System.out.println("El promedio de pago masculino es: $" + (totalm / genf));
    }

}
