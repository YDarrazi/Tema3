/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadesClase;
import java.io.*;
/**
 *
 * @author alumno
 */
public class Tarea07 {
    
    public static void main(String[]args) throws IOException{
        //Declaracion de variables
        int nota=0;
        char calificacion;
        boolean notValida;
        System.out.println("Introduce la calificacion(I,F,B,N,S):");
        calificacion=Character.toUpperCase((char)System.in.read());
        
        switch(calificacion){
            case 'I':
                nota= 4;
                break;
            case 'F':
                nota= 5;
                break;
            case 'B':
                nota= 6;
                break;
            case 'N':
                nota=8;
                break;
            case 'S':
                nota=9;
                break;
            default: 
                notValida=false;
                break;}
                System.out.println("su nota es: " +nota);
                
                
        }
    }
    

