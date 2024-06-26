package ComprobarSecuencias;

/**
 * Clase que contiene la secuencia de enteros a comprobar.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio4 {
    
    /**
     * Secuencia de enteros.
     */
    private static int[][] secuencia = {
        {1, 7, 9, 4, 5, 6, 8, 2, 3},
        {2, 1, 4, 5, 7, 6, 8, 9, 3},
        {3, 2, 8, 7, 6, 1, 4, 5, 9},
        {4, 2, 8, 1, 9, 3, 6, 5, 7},
        {4, 3, 5, 6, 2, 7, 1, 8, 9},
        {5, 4, 7, 6, 8, 3, 2, 9, 1},
        {6, 5, 3, 2, 4, 7, 1, 9, 8},
        {6, 5, 4, 7, 3, 2, 8, 9, 1}
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
