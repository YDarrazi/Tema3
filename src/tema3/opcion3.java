
package tema3;

import java.util.Scanner;
public class opcion3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         int num1;
        int num2;
        
        System.out.println("Introduce el primer numero");
        num1=sc.nextInt();
        System.out.println("Introduce el segundo numero");
        num2=sc.nextInt();

        int suma = sumaSerieNumero3(num1, num2);

        System.out.println("La suma de la serie del numero 3 entre " + num1 + " y " + num2 + " es: " + suma);
    }
    public static int sumaSerieNumero3(int inicio, int fin) {
        int suma = 0;
        inicio = inicio + (3 - (inicio % 3)) % 3;

        for (int i = inicio; i <= fin; i += 3) {
            suma += i;
        }
        return suma;
    }
}
    

