/*
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase: ");
        Scanner leer = new Scanner(System.in);
        
        String frase = leer.nextLine();
        String fraseMayus = frase.toUpperCase();
        String fraseMinus = frase.toLowerCase();
        
        System.out.println("Frase en mayuscula: "+ fraseMayus);
        System.out.println("");
        System.out.println("Frase en minuscula: "+ fraseMinus);
        
    }
    
}
