/*
10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un valor Limite: ");
        Scanner leer = new Scanner(System.in);
        int limit = leer.nextInt();
        int numero = 0;
        System.out.println("Ingrese numeros hasta llegar al limite");
        while (numero<limit){
            numero=numero + leer.nextInt();
            
        }
        System.out.println("La suma total es: " + numero);
    }
    
}
