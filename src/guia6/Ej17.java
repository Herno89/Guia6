/*
17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector;
        System.out.println("Ingrese el tamaño del vector: ");
        Scanner leer = new Scanner(System.in);
        
        int tam = leer.nextInt();
        vector = new int[tam];
       // System.out.println("Ingrese valor a buscar: ");
        //int valor = leer.nextInt();
        
        llenarv(vector,tam);
        mostrarv(vector, tam);
        buscarv(vector, tam);
    }
    public static void llenarv(int[] vector,int tam){
        for (int f=0;f<tam;f++){
            vector[f]= (int) (Math.random() * 100000);
        }
    }
    public static void mostrarv(int[] vector, int tam){
        for (int f=0;f<tam;f++){
            System.out.println(f+" = "+vector[f]);
        }
    }
    public static void buscarv(int[] vector, int tam){
        int cont5=0;
        int cont4=0;
        int cont3=0;
        int cont2=0;
        int cont1=0;
        
        for (int f=0; f<tam; f++){
           if (vector[f]<=99999 && vector[f]>9999){
               cont5++;
           } else if(vector[f]<9999 && vector[f]>999){
               cont4++;
           } else if(vector[f]<999 && vector[f]>99){
               cont3++;
           } else if(vector[f]<99 && vector[f]>9){
               cont2++;
           } else if(vector[f]<9 && vector[f]>=0){
               cont1++;
           }
        }
        System.out.println("La cantidad de valores de 5 cifras son: "+cont5);
        System.out.println("La cantidad de valores de 4 cifras son: "+cont4);
        System.out.println("La cantidad de valores de 3 cifras son: "+cont3);
        System.out.println("La cantidad de valores de 2 cifras son: "+cont2);
        System.out.println("La cantidad de valores de 1 cifras son: "+cont1);
    }
    
}
