/*
5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero: ");
        Scanner leer = new Scanner(System.in);
        int a = leer.nextInt();
        
        System.out.println("El doble de "+ a +" es: "+a*2);
        System.out.println("El triple de "+ a + " es: "+a*3);
        System.out.println("El cuadrado de "+a+ " es: "+ Math.pow(a,2) );
        System.out.println("La raiz cuadrada de " + a+" es: " + Math.sqrt(a));
        
        
        
    }
    
}
