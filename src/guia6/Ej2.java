/*
2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre: ");
        Scanner leer = new Scanner(System.in);
        
        String nombre = leer.next();
        
        System.out.println("Su nombre es: "+nombre);
        
    }
    
}
