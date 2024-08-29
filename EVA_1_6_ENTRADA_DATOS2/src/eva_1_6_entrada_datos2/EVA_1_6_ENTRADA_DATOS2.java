/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_1_6_entrada_datos2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_1_6_ENTRADA_DATOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DECLARACION DE VARIABLES
        String nombre;
        String curp;
        int edad;
        double promedio;
        //CREAR NUESTRO SCANNER
        Scanner captura;
        captura = new Scanner(System.in);
        
        //CAPTURAR:
        System.out.println("Captura tu nombre completo: ");
        nombre = captura.nextLine();
        System.out.println("Captura tu curp: ");
        curp = captura.nextLine();
        System.out.println("Captura tu edad: ");
        edad = captura.nextInt();
        System.out.println("Captura tu promedio: ");
        promedio = captura.nextDouble();
        
        //IMPRESION
        System.out.println("<<<<<<Seccion de impresion de datos>>>>>>>>");
        System.out.println(nombre);
        System.out.println(curp);
        System.out.println(edad);
        System.out.println(promedio);
        
    }
    
}
