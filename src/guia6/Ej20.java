/*
20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz;
        matriz = new int[3][3];
        llenadom(matriz);
        mostrarm(matriz);
        validarmagia(matriz);
    }
    public static void llenadom(int[][] matriz){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los 9 valores del cuadrado entre el 1 y 9: ");
        for (int f=0;f<3;f++){
            for (int c=0;c<3;c++){
                matriz[f][c]=leer.nextInt();
                while (matriz[f][c]>9 || matriz[f][c]<0){
                    System.out.println("Usted ingreso un valor incorrecto, vuelva a intentarlo:");
                    matriz[f][c]=leer.nextInt();
                }
            }
        }
    }
    public static void mostrarm(int[][] matriz){
        for (int f=0;f<3;f++){
            for (int c=0;c<3;c++){
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println("");
        }
    }
    public static void validarmagia(int[][] matriz){
        boolean diago= false;
        int dp=0;
        int ds=0;
        int contc;
        int contf;
        int cont=0;
        for (int f=0;f<3;f++){
            for (int c=0;c<3;c++){
                if (f==c){
                    dp+=matriz[f][c];
                }
                if (f+c ==2){
                   ds+=matriz[f][c];
                }
            }
        }
        if (dp==ds){
            diago=true;
        }
        for (int f=0;f<3;f++){
            contc=0;
            contf=0;
            for (int c=0;c<3;c++){
                if (f==0){
                    contc+=matriz[f][c];
                    contf+=matriz[c][f];
                }
                if (f==1){
                    contc+=matriz[f][c];
                    contf+=matriz[c][f];
                }
                if (f==2){
                    contc+=matriz[f][c];
                    contf+=matriz[c][f];
                }
            }
            if (contc==dp){
                cont++;
            }
            if (contf==dp){
                cont++;
            }
        }
        if (cont==6 && diago == true){
            System.out.println("La matriz es magica!");
        }
    }
}
