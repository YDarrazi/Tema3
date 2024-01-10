
package tema3;

import java.util.Scanner;
public class Ejemplo2 {
    public static void main(String[] args){
        int nota;
        String resultado=" ";
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba su nota: ");
        nota=sc.nextInt();
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                resultado = "SUSPENSO";
                break;
            case 5:
                resultado = "APROBADO";
                break;
            case 6:
                resultado = "Bien";
                break;
            case 7,8:
                resultado = "Notable";
                break;
            case 9,10:
                resultado = "Sobresaliente";
                break;
                        default:
                            resultado = "ERROR AL INTRODUCIR LOS DATOS";
        
    }//fin switch
    }
         
}
