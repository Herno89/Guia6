/*
6. Crear un programa que dado un numero determine si es par o impar.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para verificar paridad: ");
        Scanner leer = new Scanner(System.in);
        
        int a = leer.nextInt();
        
        if (a%2==0){
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }
        
    }
    
}
