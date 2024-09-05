/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_conversiones;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA1_11_CONVERSIONES {

    public static void main(String[] args) {
        double fahr, cent, kelvin;
        Scanner captura = new Scanner(System.in);
        
        System.out.println("Escribe los fahrenheits para convertir a centigrados");
        fahr = captura.nextDouble();
        cent = (fahr-32)/1.8;
        System.out.println("°C = "+ cent);
        
        System.out.println("Escribe los centigrados para convertirlos a fahrenheits");
        cent = captura.nextDouble();
        fahr = cent*1.8+32;
        System.out.println("°F = "+ fahr);
        
        System.out.println("Escribe los fahrenheits para convertir a kelvin");
        fahr = captura.nextDouble();
        kelvin = (fahr-32)*5/9+273.15;
        System.out.println("°K = "+ fahr);
    }
}
