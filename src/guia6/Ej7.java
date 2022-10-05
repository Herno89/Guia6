/*
7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase: ");
        Scanner leer = new Scanner(System.in);
        String frase = leer.next();
        
        if (frase.equals("eureka")){
            System.out.println("Correcto!!");
        } else {
            System.out.println("Incorrecto!!");
        }
        
    }
    
}
