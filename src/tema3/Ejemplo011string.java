
package tema3;


public class Ejemplo011string {
    public static void main (String[]args){
        
        String texto="Hola mundo";
        System.out.println("La longitud es " +texto.length());
        
        System.out.println(texto.charAt(1));
        
        
        char buffer[]=new char[5];
        texto.getChars(5, 9, buffer, 0);
        System.out.println("El buffer copiado es: "+buffer);
        
        //comparaciones
        String nombre1="Juan";
        String nombre2="Ana";
        if (nombre1.equalsIgnoreCase(nombre2)){
            System.out.println("Son iguales");
        }
        else
            System.out.println("Son diferentes");
        //Comparaciones Compareto
        //Devuelve 0 si ambas cadenas son iguales
        //Devuelve valor negativo si el String es mayor
        //Devuelve un valor positivo si el String es mayor
        
        if(nombre1.compareToIgnoreCase(nombre2)==0){
            
        }
        else if(nombre1.compareTo(nombre2)<0){
            System.out.println("Nombre1 seria menor que Nombre2");
        }
        else {System.out.println("Nombre1 seria mayor que Nombre2");
        
        
    
    }
        //Conversion de variables a String
        String sTexto="palabra1 palabra2 palabra3"; //Cadena donde va a buscar
        String busqueda="palabra2"; //Lo que quiere buscar
        int contador=0;//Contador de ocurrencias
        while (sTexto.indexOf( busqueda)>-1){
            sTexto = sTexto.substring(sTexto.indexOf(busqueda)+busqueda.length(),sTexto.length());
            contador++;
            
        }//Fin del while
        System.out.println("El contador es: "+contador);
        int intIndex=sTexto.indexOf(busqueda);
        System.out.println(intIndex);
    
}}
