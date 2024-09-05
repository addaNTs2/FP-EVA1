/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA_1_12_FORMULAS {

    public static void main(String[] args) {
        double vel, time, accel, dist;
        Scanner captura = new Scanner(System.in);
        
        System.out.println("Introduce la velocidad inicial");
        vel = captura.nextDouble();
        
        System.out.println("Introduce el tiempo");
        time = captura.nextDouble();
        
        System.out.println("Introduce la aceleracion");
        accel = captura.nextDouble();
        
        dist = vel*time+0.5*accel*Math.pow(time,2);
        
        System.out.println("Tu resultado es: " +dist);
    }
}
