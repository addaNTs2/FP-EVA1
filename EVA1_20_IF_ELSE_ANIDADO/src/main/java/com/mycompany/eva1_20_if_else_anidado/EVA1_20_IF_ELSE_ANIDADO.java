/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_20_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA1_20_IF_ELSE_ANIDADO {

    public static void main(String[] args) {
        int diaSem;
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce tu dia de la semana (1 al 7): ");
        diaSem = captura.nextInt();
        captura.nextLine();
        
        if(diaSem == 1){
            System.out.println("Domingo");
        }else if(diaSem == 2){
            System.out.println("Lunes");
        }else if(diaSem == 3){
            System.out.println("Martes");
        }else if(diaSem == 4){
            System.out.println("Miercoles");
        }else if(diaSem == 5){
            System.out.println("Jueves");
        }else if(diaSem == 6){
            System.out.println("Viernes");
        }else if(diaSem == 7){
            System.out.println("Sabado");    
        }else{
            System.out.println("Tu dia de la semana no existe");
                
          }
    }
}
