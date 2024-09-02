/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nombre;
        String genero;
        int duracion;
        String Reparto;
        String clasificacion;
        
        Scanner captura;
        captura = new Scanner(System.in);
        
        System.out.println("Introduce el nombre de tu pelicula");
        Nombre = captura.nextLine();
       
        System.out.println("Inttroduce el genero de tu pelicula");
        genero = captura.nextLine();
        
        System.out.println("Introduce la duracion de tu pelicula");
        duracion = captura.nextInt();
        
        System.out.println("Introduce el reparto de tu pelicula");
        Reparto = captura.nextLine();
        Reparto = captura.nextLine();
        System.out.println("Introduce la clasificacion de tu pelicula");
        clasificacion = captura.nextLine();
        
        System.out.println("<<<<<<<<<<<Imprimiendo datos>>>>>>>>>>");
        System.out.println(Nombre);
        System.out.println(genero);
        System.out.println(duracion);
        System.out.println(Reparto);
        System.out.println(clasificacion);
              
    }
    
}
