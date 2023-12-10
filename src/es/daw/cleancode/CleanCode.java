package es.daw.cleancode;

// Queremos un programa que muestre en pantalla el sumatorio y la media de una lista de valores

/*
 Este es un ejemplo de clean code
 1. Los nombres son explicativos, las variables tiene como nombre sustantivos y las funciones verbos
 1.1 Consistencia en los nombres, se usa camel case
 2. Varias funciones que hacen una cosa y la hacen bien
 3. Se reutiliza codigo
 4. El codigo es autoexplicativo, los comentarios solo explican el resultado final
 5. Se usa un for each, lo cual hace el codigo mas legible
*/

/**
 *
 * @author adrian
 */
public class CleanCode {

    public static void main(String[] args) {
        int[] listaEnteros = {1,6,4,7,2,6,5};
        
        System.out.printf("El sumatorio de la lista es : %.2f\n", calcularSumatorio(listaEnteros));
        System.out.printf("La media de la lista es : %.2f\n", calcularMedia(listaEnteros));
    }
    
    /**
     * Devuelve el sumatorio de una lista de enteros
     * @param numeros
     * @return 
     */
    private static double calcularSumatorio(int[] numeros){
        double acumulador = 0;
        for (int numero : numeros)
            acumulador += numero;
        return acumulador;
    }
    
    /**
     * Devualve la media de una lista de enteros
     * @param numeros
     * @return 
     */
    private static double calcularMedia(int[] numeros){
        return calcularSumatorio(numeros) / numeros.length;
    }
    
}
