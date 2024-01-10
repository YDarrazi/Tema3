/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tema3;

/**
 *
 * @author alumno
 */
public class GeneradorAleatorio {
  public static void main(String[] args) {
        char Letra = generate();

        System.out.println("Letra generada aleatoriamente: " + Letra);

        switch (Letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal.");
                break;
            default:
                System.out.println("Es una consonante.");
        }
    }

    public static char generate() {
        int c = (int) (Math.random() * 26) + 97; // 97 es el valor ASCII de 'a', y 26 es el número de letras en el alfabeto
        return (char) c;
    }
}