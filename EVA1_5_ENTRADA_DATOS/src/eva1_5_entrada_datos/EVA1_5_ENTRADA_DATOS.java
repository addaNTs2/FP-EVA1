/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        
        //CAPTURA DE DATOS DEL TECLADO:
        //Scanner --> herramienta (Clase)
        //Scanner: es un tipo de dato
        Scanner captura; //incorporar la herramienta al codigo (import)
        //no existe, hay que crearla
        captura = new Scanner(System.in);//cramos la herramienta scanner
        
        //DARLE LA INSTRUCCION AL USUARIO
        System.out.println("Introduce tu nombre completo: ");
        //capturar (asignar un valor a la variable)
        nombre =captura.nextLine();//Capturamos todo el texto
                                   //hasta que presione "enter"
        //IMPRIMIR LOS DATOS:
        System.out.println("<<<<<<<<<<DATOS CAPTURADOS>>>>>>>>>>");
        System.out.println(nombre);
        
        
    }
    
}
