
package tema3;

import java.util.Scanner;
public class NumFactorial {
        // Función para calcular el factorial de un número
    public static long calcularFactorial(int numero) {
        // Verificar si el número es no negativo
        if (numero < 0) {
            
        }

        // Inicializar el resultado a 1, ya que 0! y 1! son 1
        long resultado = 1;

        // Calcular el factorial utilizando un bucle
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        // Devolver el resultado
        return resultado;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int numero=1;
        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
        
        
    
    

