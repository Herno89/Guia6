/*
16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector;
        System.out.println("Ingrese el tamaño del vector: ");
        Scanner leer = new Scanner(System.in);
        
        int tam = leer.nextInt();
        vector = new int[tam];
        System.out.println("Ingrese valor a buscar: ");
        int valor = leer.nextInt();
        
        llenarv(vector,tam);
        mostrarv(vector, tam);
        buscarv(vector, tam, valor);
    }
    public static void llenarv(int[] vector,int tam){
        for (int f=0;f<tam;f++){
            vector[f]= (int) (Math.random() * 100);
        }
    }
    public static void mostrarv(int[] vector, int tam){
        for (int f=0;f<tam;f++){
            System.out.println(f+" = "+vector[f]);
        }
    }
    public static void buscarv(int[] vector, int tam, int valor){
        int cont=0;
        for (int f=0; f<tam; f++){
            if (vector[f]==valor){
                cont++;
                System.out.println("El valor"+valor+" se encuentra en la posicion "+f );
            }
        }
        if (cont>1){
            System.out.println("El valor se repite "+cont+"veces");
            
        }
    }
}
