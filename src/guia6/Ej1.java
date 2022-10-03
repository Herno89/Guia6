/*
1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros enteros");
        Scanner leer = new Scanner(System.in);
        
        int a= leer.nextInt();
        int b= leer.nextInt();
        int c= a + b;
        System.out.println("La suma de los numeros es: "+c);
        
        
    }
    
}
