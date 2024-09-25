/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_21_meses;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA1_21_MESES {

    public static void main(String[] args) {
        int meses;
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce tu mes (1 al 12): ");
        meses = captura.nextInt();
        captura.nextLine();
        //Enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre y diciembre
        
        if(meses == 1){
            System.out.println("Enero");
        }else if(meses == 2){
            System.out.println("Febrero");
        }else if(meses == 3){
            System.out.println("Marzo");
        }else if(meses == 4){
            System.out.println("Abril");
        }else if(meses == 5){
            System.out.println("Mayo");
        }else if(meses == 6){
            System.out.println("Junio");
        }else if(meses == 7){
            System.out.println("Julio");
        }else if(meses == 8){
            System.out.println("Agosto");
        }else if(meses == 9){
            System.out.println("Septiembre");
        }else if(meses == 10){
            System.out.println("Octubre");
        }else if(meses == 11){
            System.out.println("Noviembre");
        }else if(meses == 12){
            System.out.println("Diciembre");
        }else{
            System.out.println("Tu mes no existe");
    
        }
    }
}
