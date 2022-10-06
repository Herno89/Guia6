/*
 18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package guia6;

/**
 *
 * @author u543699
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz;
        matriz = new int[4][4];
        llenamatriz(matriz);
        mostrarm(matriz);
        System.out.println("***************");
        mostrarmt(matriz);
    }
    public static void llenamatriz(int[][] matriz){
        for (int f=0;f<4;f++){
            for (int c=0;c<4;c++){
                matriz[f][c]=(int) (Math.random() * 10);
            }
        }
    }
    public static void mostrarm(int[][] matriz){
        for (int f=0;f<4;f++){
            for (int c=0;c<4;c++){
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println("");
        }
    }
     public static void mostrarmt(int[][] matriz){
        for (int f=0;f<4;f++){
            for (int c=0;c<4;c++){
                System.out.print(matriz[c][f]+ " ");
            }
            System.out.println("");
        }
    }
    
    
}
