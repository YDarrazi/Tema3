
package ActividadesClase;


import java.util.Scanner;

public class Tarea03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Introduzca el primer caracter: ");
        char letra1 = sc.next().charAt(0);

        System.out.print("Introduzca el segundo caracter: ");
        char letra2 = sc.next().charAt(0);

      
        if (letra1 < letra2) {
            System.out.println("Los caracteres estan en orden alfabetico.");
        } else if (letra2<letra1){
            System.out.println("Los caracteres no estan en orden alfabetico.");
        }else{
            System.out.println("Los caracteres son iguales.");
            
        }
    }
}
