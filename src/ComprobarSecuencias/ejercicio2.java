package ComprobarSecuencias;

/**
 * Clase que contiene la secuencia de enteros a comprobar.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio2 {

    /**
     * Secuencia de enteros.
     */
    private static int[][] secuencia = {
        {1, 3, 4, 7, 6, 5, 8, 2, 9},
        {1, 8, 5, 3, 4, 6, 2, 9, 7},
        {3, 2, 6, 7, 5, 4, 8, 9, 1},
        {4, 3, 2, 5, 6, 1, 7, 9, 8},
        {4, 8, 3, 2, 1, 6, 5, 9, 7},
        {6, 5, 4, 7, 3, 2, 8, 1, 9},
        {7, 6, 5, 4, 9, 3, 8, 2, 1},
        {9, 8, 6, 2, 4, 3, 7, 1, 5}
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