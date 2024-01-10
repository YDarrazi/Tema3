
package tema3;


import java.util.Scanner;

public class AñoBi {

    // Funcio para saber si año es bisiesto o no
    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
            int año = scanner.nextInt();

            if (esBisiesto(año)) {
                System.out.println(año + " es un año bisiesto.");
            } else {
                System.out.println(año+ " no es un año bisiesto.");
            }
         
        }
    }
