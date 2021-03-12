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
public class Ejercicio017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido.\nEscriba los siguientes datos por favor.");
        String[] nombre = new String[10];
        int[] edad = new int[10];
        int[] pago = new int[10];
        int[] horas = new int[10];
        double[] total = new double[10];
        double[] retenido = new double[10];
        double[] endTotal = new double[10];
        double totalMenor = 0;
        double totalMayor = 0;
        String nombreMayor = null;
        double totalFinal = 0;
        String nombreMayorM = null;
        double totalFinalM = 0;

        for (int i = 0; i < nombre.length; i++) {

            System.out.println("Escriba el nombre del empleado numero " + (i + 1) + ": ");
            nombre[i] = scanner.nextLine();
            System.out.println("Escriba la edad del empleado numero " + (i + 1) + ": ");
            edad[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Escriba el pago por hora del empleado numero " + (i + 1) + ": ");
            pago[i] = scanner.nextInt();
            System.out.println("Escriba las horas trabajadas por el empleado numero " + (i + 1) + ": ");
            horas[i] = scanner.nextInt();
            scanner.nextLine();

            if (horas[i] < 40) {
                total[i] = horas[i] * pago[i];
                if (total[i] > 200) {
                    retenido[i] = ((total[i] - 200) * 0.2) + 20;
                    endTotal[i] = total[i] - retenido[i];
                    
                    
                } else {
                    retenido[i] = total[i] * 0.1;
                    endTotal[i] = total[i] - retenido[i];

                }
            } else if (horas[i] > 40) {
                total[i] = (40 * pago[i]) + ((horas[i] - 40) * (pago[i] * 1.5));
                if (total[i] > 200) {
                    retenido[i] = ((total[i] - 200) * 0.2) + 20;
                    endTotal[i] = total[i] - retenido[i];

                } else {
                    retenido[i] = total[i] * 0.1;
                    endTotal[i] = total[i] - retenido[i];

                }
            }

            if (edad[i] >= 55) {
                totalMayor = totalMayor + total[i];
                if(endTotal[i]>totalFinal){
                        totalFinalM = endTotal[i];
                        nombreMayorM=nombre[i];
                    }

            } else if (edad[i] < 55) {

                totalMenor = totalMenor + total[i];
                if(endTotal[i]>totalFinal){
                        totalFinal = endTotal[i];
                        nombreMayor=nombre[i];
                    }
            }

        }

        System.out.println("El empleado " + nombre[0] + " de " + edad[0] + " años, ha trabajado " + horas[0] + " por $" + pago[0] + " cada una, con un total de : $" + total[0] + " y se le ha retenido $" + retenido[0] + " con un sueldo total: $" + endTotal[0]);
        System.out.println("El empleado " + nombre[1] + " de " + edad[1] + " años, ha trabajado " + horas[1] + " por $" + pago[1] + " cada una, con un total de : $" + total[1] + " y se le ha retenido $" + retenido[1] + " con un sueldo total: $" + endTotal[1]);
        System.out.println("El empleado " + nombre[2] + " de " + edad[2] + " años, ha trabajado " + horas[2] + " por $" + pago[2] + " cada una, con un total de : $" + total[2] + " y se le ha retenido $" + retenido[2] + " con un sueldo total: $" + endTotal[2]);
        System.out.println("El empleado " + nombre[3] + " de " + edad[3] + " años, ha trabajado " + horas[3] + " por $" + pago[3] + " cada una, con un total de : $" + total[3] + " y se le ha retenido $" + retenido[3] + " con un sueldo total: $" + endTotal[3]);
        System.out.println("El empleado " + nombre[4] + " de " + edad[4] + " años, ha trabajado " + horas[4] + " por $" + pago[4] + " cada una, con un total de : $" + total[4] + " y se le ha retenido $" + retenido[4] + " con un sueldo total: $" + endTotal[4]);
        System.out.println("El empleado " + nombre[5] + " de " + edad[5] + " años, ha trabajado " + horas[5] + " por $" + pago[5] + " cada una, con un total de : $" + total[5] + " y se le ha retenido $" + retenido[5] + " con un sueldo total: $" + endTotal[5]);
        System.out.println("El empleado " + nombre[6] + " de " + edad[6] + " años, ha trabajado " + horas[6] + " por $" + pago[6] + " cada una, con un total de : $" + total[6] + " y se le ha retenido $" + retenido[6] + " con un sueldo total: $" + endTotal[6]);
        System.out.println("El empleado " + nombre[7] + " de " + edad[7] + " años, ha trabajado " + horas[7] + " por $" + pago[7] + " cada una, con un total de : $" + total[7] + " y se le ha retenido $" + retenido[7] + " con un sueldo total: $" + endTotal[7]);
        System.out.println("El empleado " + nombre[8] + " de " + edad[8] + " años, ha trabajado " + horas[8] + " por $" + pago[8] + " cada una, con un total de : $" + total[8] + " y se le ha retenido $" + retenido[8] + " con un sueldo total: $" + endTotal[8]);
        System.out.println("El empleado " + nombre[9] + " de " + edad[9] + " años, ha trabajado " + horas[9] + " por $" + pago[9] + " cada una, con un total de : $" + total[9] + " y se le ha retenido $" + retenido[9] + " con un sueldo total: $" + endTotal[9]);
      
        System.out.println("El pago total a todos los empleados menores de 55 años es de $" + totalMenor);
        System.out.println("El pago total a todos los empleados mayores de 55 años es de $" + totalMayor);
        System.out.println("El empleado de al menos 55 años con mayor salario es:"+nombreMayorM +" con un sueldo de $"+totalFinalM);
        System.out.println("El empleado de menos de 55 años con mayor salario es:"+nombreMayor +" con un sueldo de $"+totalFinal);
    }

}
