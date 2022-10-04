/*
4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese grados centigrados a convertir: ");
        Scanner leer = new Scanner(System.in);
        
        int a = leer.nextInt();
        
        System.out.println(a+"º Centigrados es igual a "+ (32 + (9 * a / 5))+ "º Fahrenheit");
        
    }
    
}
