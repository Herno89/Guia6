/*
19. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia6;

/**
 *
 * @author u543699
 */
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matrix={{0,-2,4},{2,0,2},{-4,-2,0}};
        mostrarm(matrix);
        System.out.println("*****");
        mostrarmt(matrix);
        matrizanti(matrix);
    }
    public static void matrizanti(int[][] matrix){
        
        int cont=0;
        for (int f=0; f<3;f++){
            for (int c=0;c<3;c++){
                if (matrix[f][c]==(matrix[c][f])*-1){
                    cont++;
                }
            }
        }
        if (cont==9){
            System.out.println("La matriz es antimatriz");
        }
    }
    public static void mostrarm(int[][] matrix){
        for (int f=0; f<3;f++){
            for (int c=0;c<3;c++){
                if (matrix[f][c]>=0){
                    System.out.print(" ");
                }
                System.out.print(""+matrix[f][c]+"");
            }
            System.out.println("");
        }
    }
    public static void mostrarmt(int[][] matrix){
        for (int f=0; f<3;f++){
            for (int c=0;c<3;c++){
                
            if (matrix[f][c]>=0){
                    System.out.print(" ");
                }
            System.out.print(""+matrix[c][f]+"");
            }
            System.out.println("");
        }
    }
}
