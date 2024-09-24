/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_control_acceso;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA1_17_CONTROL_ACCESO {

    public static void main(String[] args) {
        String usu, psw;
        Scanner captura = new Scanner(System.in);
        System.out.println("Usuario: ");
        usu = captura.nextLine(); //ASIGNACION
        System.out.println("Password: ");
        psw = captura.nextLine();
        
        // usu == "Admin" //COMPARACION
        if(usu.equals("Admin") && psw.equals("1234")) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

    }
}