
package ActividadesClase;

import java.util.Scanner;

public class Tarea05 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double euro=0.0060;
        double peseta=166.386;
        System.out.println("\nIntroduzca cuantos euros quiere convertir a pesetas ");
        euro=sc.nextDouble();
        peseta=euro*166.386;
        System.out.printf("Son %.2f pesetas: ",peseta );
        System.out.println("\nIntroduzca la cantidad de pesetas que quiera convertir a euros ");
        peseta=sc.nextDouble();
        euro=peseta*0.0060;
        System.out.printf("Son %.2f euros\n",euro);
        System.out.println("");
        
    }
    
}
