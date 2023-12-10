package es.daw.cleancode;

// Queremos un programa que muestre en pantalla el sumatorio y la media de una lista de valores

/*
 Este es un ejemplo de mal codigo
 1. Los nombres son ambiguos, tanto en variables como en funciones
 2. Una funcion que hace muchas cosas
 3. Se repite codigo
 4. Se abusa de comentarios
 5. Se usa for loop tradicional cuando se podrías usar un for each
    esto provoca la creacion de la variable i, que en verdad no sirve para nada.
 6. Las funciones dependen de variables globales, podría provocar efectos secundarios
*/

/**
 *
 * @author adrian
 */
public class CodeSmells {
    
    static int[] lista = {1,6,4,7,2,6,5};
    
    public static void main(String[] args) {
        // Crear una lista de variables
        
        
        // Mostrar en pantalla el sumatorio de la lista
        System.out.println("El sumatorio de la lista es : " + calcular("sumatorio"));
        
        // Mostrar en pantalla la media de la lista
        System.out.println("La media de la lista es : " + calcular("media"));
    }
    
    private static double media(){
        double a = 0;
        for (int i = 0; i < lista.length; i++) {
            a += lista[i];
        }
        return a / lista.length;
    }
    
    
    // Esta funcion toma una lista de numeros
    // y puedes calcular varias cosas con ellas (?)
    private static double calcular(String accion){
        double a = 0; // Que hacía este double?
        switch(accion){
            case "sumatorio":
                // Recorre la array de valores
                // y los añade a un acumulador.
                // Finalmente devuelve el sumatorio
                for (int i = 0; i < lista.length; i++) {
                    a += lista[i];
                }
                return a;
            case "media":
                // Calcula la media de una lista de valores
                // recorre la array y los añade al acumulador
                // Finalmente se divide el acumulador entre la longitud de la array
                // y devuelve la media
                for (int i = 0; i < lista.length; i++) {
                    a += lista[i];
                }
                return a / lista.length;
        }
        return a;
    }
}
