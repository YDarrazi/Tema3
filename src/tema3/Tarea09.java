
package tema3;

import java.util.Scanner;
public class Tarea09 {
    public static void main(String[]args){
        
    
    Scanner sc=new Scanner(System.in);
    int num1;
    int contador=0;
    int mayores=0;
    int menores=0;
    int otros=0;
    System.out.println("Introduce los numeros ");
    do{
    num1=sc.nextInt();
    contador++;
    if(num1<18){
        menores++;
    }
    else if(num1>=18 || num1<=65){
        mayores++;
   }   
    else{
            otros++;
            } 
        
                    
} while (contador<10);
    System.out.println("Numeros menores que 18: " + menores);
        System.out.println("Numeros entre 18 y 65: " + mayores);
        System.out.println("Numeros mayores que 65: " + otros);
    }
}