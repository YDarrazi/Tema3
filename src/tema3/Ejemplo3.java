
package tema3;
import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
 // Declaración e inicialización de variables
 int numAciertos;
 int numErrores;
 int numPreguntas;
 float nota;
 String calificacion="";
 
 
 Scanner sc=new Scanner(System.in);
 System.out.println("Escriba el numero de aciertos: ");
 numAciertos=sc.nextInt();
 System.out.println("Escriba el numero de errores: ");
 numErrores=sc.nextInt();
 System.out.println("Cuantas preguntas son: ");
 numPreguntas=sc.nextInt();
 //Procesamiento de datos
 nota =(float) ((numAciertos - (numErrores/2))*10)/numPreguntas;

          if(nota<5){
             calificacion="Insuficiente";
          }
         if(nota==5){
             calificacion="Suficiente";
             
         }
         if(nota==6){
             calificacion="Bien";
             
         }
         if(nota==7){
             calificacion="Bien";
             
         }
          if(nota==8){
            calificacion="Notable";
             
         }
           if(nota==9){
             calificacion="Notable";
             
         }
            if(nota==10){
            calificacion="Sobresaliente";
             
         }
         
 //Salida de información
 System.out.printf ("La nota obtenida es: %.2f ", nota);
 System.out.println ("y la calificacion obtenida es: " + calificacion);
 }
}
    

