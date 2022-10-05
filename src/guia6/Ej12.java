/*
12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals()
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese cadenas de un tamaño de 5, para finalizar ingrese &&&&&");
        Scanner leer = new Scanner(System.in);
        String cadena;
        boolean fin = true;
        int tam;
        int cont =0;
        //cadena.equals("&&&&&")
        while (fin ){
            cadena = leer.next();
            tam = cadena.length();
            if(tam==5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")){
                cont++;
            } else if (cadena.equals("&&&&&")){
                fin =false;
            }
            
        }
        System.out.println("La cantidad de palabras ingresadas correctamente son: "+cont);
    }
    
}
