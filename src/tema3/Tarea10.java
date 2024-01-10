
package tema3;

import java.util.Scanner;
public class Tarea10 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
       int suma = 0;
        String letra;

        System.out.println("Introduce numeros enteros. Para salir, introduce 's' o 'S'.");

        do {
            System.out.print("Ingrese un numero ( Pulse 's' para salir): ");
            letra = sc.next();

            if (!letra.equalsIgnoreCase("s")) {
                  
                    int numero = Integer.parseInt(letra);
                    suma += numero; 
            }

        } while (!letra.equalsIgnoreCase("s"));

        System.out.println("La suma total es: " + suma);
        
        
               
        
        
    }
    
    
}
