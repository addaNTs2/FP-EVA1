/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_19_operador_or;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA1_19_OPERADOR_OR {

    public static void main(String[] args) {
        int km, meses; //6 meses y 5000km
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce el kilometraje de tu vehiculo: ");
        km = captura.nextInt();
        System.out.println("Introduce los meses desde la ultima vez que cambiastes el aceite: ");
        meses = captura.nextInt();
        
        if(km >= 5000 || meses >= 6){
            System.out.println("Necesitas cambiar el aceite");
        }else{
            System.out.println("No requieres el cambio de aceite");
        }
    }
}
