
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.guia.ejercicios;

/**
 *
 * @author MarlonCarbonero
 */
public class Ejercicio015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int yarda=1;
        System.out.println("Yarda \tPulgadas");
        while (yarda<11){
            int pulg = yarda*36;
            System.out.println(yarda+" \t"+pulg );
            yarda++;
        }
        
    }
    
}
