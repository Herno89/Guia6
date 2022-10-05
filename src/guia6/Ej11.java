/*
11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese dos valores enteros positivos: ");
        Scanner leer = new Scanner(System.in);
        int a = leer.nextInt();
        int b = leer.nextInt();
        boolean var = true;
        while (var){
            System.out.println("Elija que operacion quiere realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir.");
            int op = leer.nextInt();
            switch (op){
                case 1:
                    System.out.println("El resultado de la suma es: "+ (a + b));
                break; 
                case 2:
                    System.out.println("El resultado de la resta es: " + (a - b));
                break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es: "+ (a*b));
                break;
                case 4:
                    System.out.println("El resultado de la division es: "+ (a/b));
                break;
                case 5:
                    System.out.println("Estas seguro que desea salir? S/N");
                    String Salir = leer.next();
                    if (Salir.equals("S")){
                        var=false;
                    }
                break;
                default:
                    System.out.println("Ingreso una opcion incorrecta :( ");
            }
          /*  System.out.println("Elija que operacion quiere realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir.");
            op = leer.nextInt(); */    
                               
            
            
        }
        System.out.println("Chau mundo!");
    }
    
}
