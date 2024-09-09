/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA1_13_IF {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        int edad;
        
        System.out.println("Introduce tu edad");
        edad = captura.nextInt();
        
        // instrucción IF
        // si (algo se cumple) es verdadero
        // qué hacer si se cumple
        // si no se cumple (opcional) es falso
        // qué hacer si no se cumple
        
        if (edad >= 18) { // Bloque de verdadero
            // Aquí van las instrucciones si la evaluación es VERDADERA
            System.out.println("Eres mayor de edad");
        } else {
            // Aquí van las instrucciones si la evaluación es FALSA
            System.out.println("Eres menor de edad");
        }
    }
}
