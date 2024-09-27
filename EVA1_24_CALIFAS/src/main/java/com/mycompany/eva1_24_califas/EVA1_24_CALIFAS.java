/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA1_24_CALIFAS {

    public static void main(String[] args) {
        int calif;
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce tu calificacion (del 0 al 100): ");
        calif = captura.nextInt();
        captura.nextLine();
        
        if(calif >=101){
            System.out.println("No existe tu valor");
       }else if(calif >=90){
            System.out.println("TU calificacion es igual a (A)");
       }else if(calif >=89){
            System.out.println("Tu calificacion es igual a (B)");
        }else if(calif >=79){
            System.out.println("Tu calificacion es igual a (C)");
        }else if(calif >=69){
            System.out.println("Tu calificacion es igual a (D)");
        }else if(calif >=0){
            System.out.println("Tu calificacion es igual a (F)");
        }else{
            System.out.println("Indrodujiste un valor incorrecto");
       
        }
        
        
    }
}
