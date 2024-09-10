/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_15_aguila_sello;

/**
 *
 * @author Angel
 */
public class EVA1_15_AGUILA_SELLO {

    public static void main(String[] args) {
        //0.0 --> 0.999999999999999
        //0.5
        //0 1 2 3 4 5 6 7 8 9
        double valor = Math.random();
        if (valor < 0.5) { 
            System.out.println("Aguila");
        } else {
            System.out.println("Sello");
        }
    }
}
