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
public class Ejercicio018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido.\nEscriba los siguientes datos por favor.");
        String[] nombre = new String[10];
        int[] cal1 = new int[10];
        int[] cal2 = new int[10];
        int[] cal3 = new int[10];
        double[] promedio = new double[10];
        String[] estado = new String[10];
        double totalA = 0;
        double totalR = 0;
        double totalAA = 0;

        for (int i = 0; i < nombre.length; i++) {

            System.out.println("Escriba el nombre del estudiante numero " + (i + 1) + ": ");
            nombre[i] = scanner.nextLine();
            System.out.println("Escriba su primera calificación: ");
            cal1[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Escriba su segunda calificación: ");
            cal2[i] = scanner.nextInt();
            System.out.println("Escriba su tercera calificación: ");
            cal3[i] = scanner.nextInt();
            scanner.nextLine();
            promedio[i] = (cal1[i] + cal2[i] + cal3[i]) / 3;

            if (promedio[i] < 60) {
                totalR++;
                estado[i] = "REPROBADO";

            } else if (promedio[i] >= 60) {
                totalA++;
                estado[i] = "APROBADO";
                if (promedio[i] >= 80) {
                    totalAA++;

                }
            }

        }

        System.out.println("El estudiante " + nombre[0] + " con las calificaciones " + cal1[0] + ", " + cal2[0] + ", " + cal3[0] + ", " + " tiene un promedio de " + promedio[0] + ", siendo asi " + estado[0]);
        System.out.println("El estudiante " + nombre[1] + " con las calificaciones " + cal1[1] + ", " + cal2[1] + ", " + cal3[1] + ", " + " tiene un promedio de " + promedio[1] + ", siendo asi " + estado[1]);
        System.out.println("El estudiante " + nombre[2] + " con las calificaciones " + cal1[2] + ", " + cal2[2] + ", " + cal3[2] + ", " + " tiene un promedio de " + promedio[2] + ", siendo asi " + estado[2]);
        System.out.println("El estudiante " + nombre[3] + " con las calificaciones " + cal1[3] + ", " + cal2[3] + ", " + cal3[3] + ", " + " tiene un promedio de " + promedio[3] + ", siendo asi " + estado[3]);
        System.out.println("El estudiante " + nombre[4] + " con las calificaciones " + cal1[4] + ", " + cal2[4] + ", " + cal3[4] + ", " + " tiene un promedio de " + promedio[4] + ", siendo asi " + estado[4]);
        System.out.println("El estudiante " + nombre[5] + " con las calificaciones " + cal1[5] + ", " + cal2[5] + ", " + cal3[5] + ", " + " tiene un promedio de " + promedio[5] + ", siendo asi " + estado[5]);
        System.out.println("El estudiante " + nombre[6] + " con las calificaciones " + cal1[6] + ", " + cal2[6] + ", " + cal3[6] + ", " + " tiene un promedio de " + promedio[6] + ", siendo asi " + estado[6]);
        System.out.println("El estudiante " + nombre[7] + " con las calificaciones " + cal1[7] + ", " + cal2[7] + ", " + cal3[7] + ", " + " tiene un promedio de " + promedio[7] + ", siendo asi " + estado[7]);
        System.out.println("El estudiante " + nombre[8] + " con las calificaciones " + cal1[8] + ", " + cal2[8] + ", " + cal3[8] + ", " + " tiene un promedio de " + promedio[8] + ", siendo asi " + estado[8]);
        System.out.println("El estudiante " + nombre[9] + " con las calificaciones " + cal1[9] + ", " + cal2[9] + ", " + cal3[9] + ", " + " tiene un promedio de " + promedio[9] + ", siendo asi " + estado[9]);
        System.out.println("El numero de estudiantes aprobados es de:" + totalA);
        System.out.println("El numero de estudiantes reprobados es de: " + totalR);
        System.out.println("El numero de estudiantes con un promedio es de: " + totalAA);
    }

}