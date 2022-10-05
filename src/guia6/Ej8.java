/*
8. Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra de tamaño 8: ");
        Scanner leer = new Scanner(System.in);
        String palabra = leer.next();
        int tam = palabra.length();
        if (tam == 8){
            System.out.println("Correcto!!");
        } else {
            System.out.println("Incorrecto!!");
        }
        
    }
    
}
