/*
13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del cuadrado: ");
        int tam = leer.nextInt();
        
        for (int f=0; f<tam; f++){
            for (int c=0; c<tam; c++){
                if (f==0 || c==0 || f==tam-1 || c==tam-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            
        }
    }
    
}
