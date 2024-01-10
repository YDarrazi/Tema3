
package ActividadesClase;

import java.util.Scanner;

public class tarea1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un numero entero: ");
        int numero = sc.nextInt();
        
        if (numero %2 == 0) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " no es par.");
        }
        
        
    }
}
