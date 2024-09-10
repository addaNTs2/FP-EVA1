/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_califas;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA1_14_CALIFAS {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        int calif;
        
        System.out.println("Introduce tu calificacion");
        calif = captura.nextInt();
        
        if (calif >=70){
            System.out.println("Aprobastes");
        }else
            System.out.println("No acreditastes");
        
            }
}
