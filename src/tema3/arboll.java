/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

import java.util.Scanner;

public class arboll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Dibujar árbol de Navidad");
            System.out.println("2. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    dibujarArbol();
                    break;
                case 2:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 2);
        
        scanner.close();
    }

    static void dibujarArbol() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura de la copa del árbol: ");
        int alturaCopa = scanner.nextInt();

        System.out.print("Ingrese el símbolo de relleno: ");
        char simbolo = scanner.next().charAt(0);

        int anchoTronco = alturaCopa / 3;
        int alturaTronco = alturaCopa / 3;

        dibujarCopa(alturaCopa, simbolo);
        dibujarTronco(anchoTronco, alturaTronco, simbolo);

        scanner.close();
    }

    static void dibujarCopa(int alturaCopa, char simbolo) {
        for (int i = 0; i < alturaCopa; i++) {
            // Espacios en blanco
            for (int j = 0; j < alturaCopa - i - 1; j++) {
                System.out.print(" ");
            }

            // Símbolos de relleno
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(simbolo);
            }

            System.out.println();
        }
    }

    static void dibujarTronco(int anchoTronco, int alturaTronco, char simbolo) {
        int espacios = (alturaTronco / 2) + 1;

        for (int i = 0; i < alturaTronco; i++) {
            // Espacios en blanco
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            // Símbolos de relleno
            for (int j = 0; j < anchoTronco; j++) {
                System.out.print(simbolo);
            }

            System.out.println();
        }
    }
}
