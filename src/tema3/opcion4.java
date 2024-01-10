
package tema3;
import java.util.Scanner;

public class opcion4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int inicio;
        int fin;
        int numserie;
        System.out.println("Introduce el numero de serie");
        numserie=sc.nextInt();
        System.out.println("Introduce el primer numero");
        inicio=sc.nextInt();
        System.out.println("Introduce el segundo numero");
        fin=sc.nextInt();
        int suma = 0;
        System.out.print("Serie: ");
        for (int i = inicio; i <= fin; i += numserie) {
            System.out.print(i + " ");
            suma += i;
        }

        // Mostrar la suma
        System.out.println("\nSuma de la serie: " + suma);
        
    }
    
}
