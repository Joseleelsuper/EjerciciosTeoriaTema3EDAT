package ComprobarSecuencias;

/**
 * Clase que contiene la secuencia de enteros a comprobar.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio5 {
    
    /**
     * Secuencia de enteros.
     */
    private static int[][] secuencia = {
        {1, 2, 4, 6, 3, 7, 8, 5, 9},
        {2, 3, 6, 7, 5, 8, 4, 9, 1},
        {4, 3, 8, 9, 7, 6, 5, 2, 1},
        {4, 7, 3, 8, 2, 9, 6, 5, 1},
        {5, 7, 8, 6, 4, 3, 2, 9, 1},
        {6, 2, 8, 5, 9, 3, 7, 4, 1},
        {6, 5, 8, 7, 4, 3, 9, 2, 1},
        {7, 3, 5, 4, 6, 9, 8, 2, 1}
    };

    /**
     * Método que devuelve la secuencia de enteros.
     * 
     * @return Secuencia de enteros.
     */
    public static int[][] obtenerSecuencia() {
        return secuencia;
    }
}
