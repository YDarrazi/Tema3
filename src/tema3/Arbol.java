package tema3;
import java.util.Scanner;

public class Arbol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                           ****************************************
                           
                           *** Programa de Arbol de Navidad                                                
                           
                           \tAuthor: tu nombre                                          
                           
                           \tVersión 1.0                                                        
                           
                           ****************************************
                           """);
        int opcion;
        do {
            menu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Seleccione la altura: ");
                    int alturaCopa=scanner.nextInt();
                    System.out.print("Introduzca un simbolo: ");
                    String simbolo = scanner.next();
                    dibujarCopa(alturaCopa, simbolo);
                    dibujarTronco(alturaCopa, simbolo);
                    break;
                case 2:
                    System.out.println("Cerrando Programa...");
                    break;
                default:
                    System.out.println("Opción no válida\n");
            }
        } while (opcion!=2);
    }
    
    
    public static void menu(){
        System.out.println("Menú:");
        System.out.println("1. Dibujar árbol de Navidad");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void dibujarCopa(int alturaCopa, String simbolo) {
        int pantalla=80;
        for (int i=1; i<=alturaCopa; i++){
            int espacio=pantalla/2-i;
            for(int k=0; k<espacio; k++){
                System.out.print(" ");   
            }
             for(int k=0; k<i*2-1; k++){
                System.out.print(simbolo);   
            }
            System.out.println(); 
        }
    }
    
     public static void dibujarTronco(int alturaCopa, String simbolo) {
        int pantalla=80;
        int alturaTronco = (int) Math.ceil((double)alturaCopa/3);
        int ancho = (2 * alturaCopa - 1) / 3;
        
        int espacio = (pantalla - ancho)/2;
        for (int i=1; i<=alturaTronco; i++){
            for(int k=0; k<espacio; k++){
                System.out.print(" ");   
            }
             for(int k=0; k<ancho; k++){
                System.out.print(simbolo);   
            }
            System.out.println(); 
        }
    }

}
