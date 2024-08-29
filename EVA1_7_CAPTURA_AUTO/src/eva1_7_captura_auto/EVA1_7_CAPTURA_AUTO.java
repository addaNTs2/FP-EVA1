/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_captura_auto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_7_CAPTURA_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String marca;
        String modelo;
        int año;
        double precio;
        
        Scanner captura;
        captura = new Scanner(System.in);
        
        System.out.println("Introduce la marca de tu automovil: ");
        marca = captura.nextLine();
        System.out.println("Introduce el modelo de tu automovil: ");
        modelo = captura.nextLine();
        System.out.println("Introduce el año de tu automovil: ");
        año = captura.nextInt();
        System.out.println("Introduce el precio de tu automovil: ");
        precio = captura.nextDouble();
        
        System.out.println("<<<<<<<Seccion de impresion de datos>>>>>>>>>>>");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(año);
        System.out.println(precio);
        
    }
    
}
