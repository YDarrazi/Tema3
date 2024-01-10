import java.util.Scanner;


public class TEMA3 {

  
    public static void main(String[] args) {
       //Declarar las variables
       int nota;
       String resultado="Nota no valida";
       
       //Iniciar los datos
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Escriba la nota: ");
       nota=sc.nextInt();
         //Zona de procesamiento
          if(nota<5){
             resultado="Insuficiente";
          }
         if(nota==5){
             resultado="Suficiente";
             
         }
         if(nota==6){
             resultado="Bien";
             
         }
         if(nota==7){
             resultado="Bien";
             
         }
          if(nota==8){
             resultado="Notable";
             
         }
           if(nota==9){
             resultado="Notable";
             
         }
            if(nota==10){
             resultado="Sobresaliente";
             
         }
         
         
         //Zona de salida
         System.out.println("El resultado es: "+resultado);
    }
    
}
