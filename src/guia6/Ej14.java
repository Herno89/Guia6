/*
14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese cantidad de euros a convertir: ");
        Scanner leer = new Scanner(System.in);
        double money = leer.nextDouble();
        System.out.println("Ingrese moneda a convertir (dol/yen/lib)");
        String tipo = leer.next();
        moneymoney(money,tipo);
    }
    
public static void moneymoney(double money, String tipo){
    switch (tipo){
        case "dol":
            System.out.println(money+" euros son: "+(1.28611*money)+" dolar");
            break;
        case "yen":
            System.out.println(money+" euros son: " + (129.852*money)+ " yenes");
            break;
        case "lib":
            System.out.println(money+" euros son: " + (0.86*money)+ " libras");
    }
}

}
