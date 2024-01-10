
package tema3;


public class Ejemplo10_BREAKCONTI {
      public static void main(String[]args){
        //Declaracion e inicializacion de variables
        int numero=7;
        int contador;
        int resultado=0;
        
        //Salida de informacion
        System.out.println("Tabla de multiplicar del "+numero);
        System.out.println("------------------------");
        
        //utilizar la estructura iterativa FOR con BREAK
        for(contador=0;contador <=10;contador++){
            if(contador==7)
                continue;
            resultado=contador*numero;
            System.out.println(numero+ "x" +contador+ "=" +resultado);
        }
                //Salida de informacion
        System.out.println("Tabla de multiplicar del "+numero);
        System.out.println("------------------------");
         for(contador=0;contador <=10;contador++){
            if(contador==7)
                break;
            resultado=contador*numero;
            System.out.println(numero+ "x" +contador+ "=" +resultado);
        }
        
}
}