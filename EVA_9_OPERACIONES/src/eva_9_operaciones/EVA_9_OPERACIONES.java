/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_9_operaciones;

/**
 *
 * @author invitado
 */
public class EVA_9_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OPERACIONES ARITMETICAS
        //inicializacion de una variable
        int x = 10; //declaracion y asignacion
        int y = 5;
        //si necesitan muchas variables:
        int suma, resta, mult,raiz;
        float div;
        double pot;
        //suma y resta
        suma = x+y; //operador de suma + 
        System.out.println("La suma de x+y es igual a:");
        System.out.println(suma);
        resta = x-y; //operador de resta -
        System.out.println("La resta de x-y es igual a:");
        System.out.println(resta);
        mult = x*y;
        System.out.println("La multiplicacion de x*y es igual a:");
        System.out.println(mult);
        div = x/y;
        System.out.println("La division de x/y es igual a:");
        System.out.println(div);
        x =5;
        y =2;
        div = x/y;
        System.out.println("division de 5/2: ");
        System.out.println(div);
        //division con numeros con puntos flotante
        double val1 =5;
        double val2 = 2;
        double resultado;
        resultado = val1/val2;
        System.out.println("Division del valor 1 y el valor 2;");
        System.out.println(resultado);
        
      
    
          }
    
    
    
}
