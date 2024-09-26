/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_switch;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA1_22_SWITCH {

    public static void main(String[] args) {
        int diaSem;
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce tu dia de la semana (1 al 7): ");
        diaSem = captura.nextInt();
        captura.nextLine();
        
        switch(diaSem){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break; //iinterrumpe el switch (Lo termina)
            default: //opcional, se ejecuta cuando no existe una opcion
                //no tiene break, Y ES LA UTLIMA INSTRUCCION DEL SWITCH
                System.out.println("Numero no valido, selecciona del 1 al 7");
        }
    }
}
