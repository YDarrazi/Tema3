
package tema3;

public class EstructuraWhile {
    public static void main(String[]args){
        //Declaracion e inicializacion de variables
        int numero=7;
        int contador;
        int resultado=0;
        
        //Salida de informacion
        System.out.println("Tabla de multiplicar del "+numero);
        System.out.println("------------------------");
        
        //Uso del bucle WHILE
        contador=0;
        do{
            resultado=contador*numero;
            System.out.println(numero + " x " + contador + "=" + resultado);
            contador++;
        }while(contador<=10);
                        
        
    }
    
}
