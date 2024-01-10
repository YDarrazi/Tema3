/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author alumno
 */
public class Multiplicacion_de_numeros {
    public static void main(String[]args){
        //Declarar las variables
        int numero = 8;
        int contador;
        int resultado=0;
        //Salida de la informacion
        System.out.println("Tabla de multiplicar del "+numero);
        System.out.println("-----------------");
        //utilizar la estructura iterativa FOR
        for(contador=0;contador<=10;contador++){
            resultado= contador*numero;
            System.out.println(numero+ " x " + contador + " = " +resultado);
        }
    }
    
}
