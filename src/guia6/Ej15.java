/*
 15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package guia6;

/**
 *
 * @author u543699
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector;
        vector = new int[100];
        llenarv(vector);
        mostrarv(vector);
    }
    public static void llenarv(int[] vector){
                for (int f=0;f<100;f++){
            vector[f]=f;
            
        }
    }
    public static void mostrarv(int[] vector){
        for (int f=99;f>=0;f--){
            System.out.println(vector[f]=f);
        }
    }
}
