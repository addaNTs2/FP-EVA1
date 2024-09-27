/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA1_25_BISIESTO {

    public static void main(String[] args) {
        int año;
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce tu año para verificar si es año bisiesto: ");
        año = captura.nextInt();
        captura.nextLine();
        
        if(año % 400 == 0 || (año % 4 == 0 && año % 100 !=0)){
            System.out.println(año + " Es un año bisiesto");
        }else{
            System.out.println(año + " No es un año bisiesto");
            
        }
        
        
    }
}
