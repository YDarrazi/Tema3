
package ActividadesClase;

import java.util.Scanner;

public class Tarea02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese los tres números
        System.out.print("Ingresa el numero A: ");
        int numeroA = scanner.nextInt();
        System.out.print("Ingresa el numero B: ");
        int numeroB = scanner.nextInt();
        System.out.print("Ingresa el numero C: ");
        int numeroC = scanner.nextInt();

        // Calcula el número mayor
        int numeroMayor = calcularMayor(numeroA, numeroB, numeroC);

        // Muestra el resultado
        System.out.println("El numero mayor es: " + numeroMayor);
    }

    // Método para calcular el número mayor de tres números
    public static int calcularMayor(int a, int b, int c) {
        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }

        return mayor;
    }
}