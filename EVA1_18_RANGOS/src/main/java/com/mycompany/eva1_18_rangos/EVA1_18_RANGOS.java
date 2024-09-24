/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18_rangos;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA1_18_RANGOS {

    public static void main(String[] args) {
        int calif; 
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce tu calificacion");
        calif = captura.nextInt();
        
        if(calif >= 0 && calif <= 100){
            System.out.println("CALIFICACION VALIDA");
        }else{
            System.out.println("CALIFICACION NO VALIDA");
        }
    }
}
