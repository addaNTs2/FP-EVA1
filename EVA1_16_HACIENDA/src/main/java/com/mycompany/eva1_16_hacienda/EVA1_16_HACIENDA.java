/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_hacienda;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA1_16_HACIENDA {

    public static void main(String[] args) {
        char tipo;
        Scanner captura = new Scanner(System.in);
        System.out.println("Tipo de persona F --> Física, M--> Moral: ");
        tipo = captura.nextLine().charAt(0);
        System.out.println(tipo);
        
        //IMPRIMIR EL TIPO DE PERSONA con if y else
        if (tipo == 'F') {
            System.out.println("Persona Física");
        } else  {
            System.out.println("Persona Moral");
        }
    }
}
