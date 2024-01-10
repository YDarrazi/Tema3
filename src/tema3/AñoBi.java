
package tema3;


import java.util.Scanner;

public class A�oBi {

    // Funcio para saber si a�o es bisiesto o no
    public static boolean esBisiesto(int a�o) {
        return (a�o % 4 == 0 && a�o % 100 != 0) || (a�o % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un a�o: ");
            int a�o = scanner.nextInt();

            if (esBisiesto(a�o)) {
                System.out.println(a�o + " es un a�o bisiesto.");
            } else {
                System.out.println(a�o+ " no es un a�o bisiesto.");
            }
         
        }
    }
