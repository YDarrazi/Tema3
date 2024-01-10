
package ActividadesClase;

import java.util.Scanner;

public class Tarea04 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, ingresa un caracter: ");
        char caracter = sc.next().charAt(0); 

        if (caracter >= 'i' && caracter <= 'm') {
            System.out.println("El caracter esta comprendido entre 'I' y 'M'.");
        } else {
            System.out.println("El caracter NO esta comprendido entre 'I' y 'M'.");
        }

     
    }
}
        
        
    
