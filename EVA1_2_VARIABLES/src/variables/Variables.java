/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package variables;

/**
 *
 * @author invitado
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                                          //TIPOS DE DATOS
        System.out.println("Hola mundo "); //Cadena De Texto
        System.out.println(100); //Entero
        System.out.println(3.14); //Numero Con Punto Flotante
        System.out.println('c'); //Caracter
        System.out.println(true); //Valores Logicos (Boleanos)
        System.out.println(false); //Valores Logicos (Boleanos)
        ;// El ";" --> FIN DE INSTRUCCION (SIEMPRE PONERLO AL FINAL)
        
        //TIPOS DE DATOS
        
        //ENTERO:
        //int
        //long
        //short
        
        //NUMEROS CON PARTE DECIMAL (FLOTANTES):
        //float
        //double
        
        //CADENAS DE TEXTO:
        //string
        
        //CARACTERES:
        //char
        
        //VALORES LÓGICOS:
        //boolean
        
        //DECLARACION DE VARIABLES:
        //SINTAXIS PARA DECLARR VAIABLES (REGLAS)
        //TIPO_DE_DATO NOMBRE_DE_LA_VARIABLE;
        String nombre;
        String apellido;
        String curp;
        double promedio;
        int edad;
        
        edad = 18; //ASIGNACION: estoy colocando el valor 18
                   //dentro de la variable edad
        nombre = "ANGEL";
        apellido = "ALONSO DOMINGUEZ";
        promedio = 7.9;
        
        
        System.out.println(edad);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(promedio);
    }
    
}