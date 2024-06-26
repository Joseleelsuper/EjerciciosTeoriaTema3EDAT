package ComprobarSecuencias;

/**
 * Clase que contiene la secuencia de enteros a comprobar.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio1 {

    /**
     * Secuencia de enteros.
     */
    private static int[][] secuencia = {
        {4, 3, 2, 1, 0, 9, 8, 7, 6, 5},
        {4, 6, 8, 7, 5, 3, 2, 9, 0, 1},
        {2, 5, 6, 7, 4, 8, 9, 3, 1, 0},
        {4, 3, 2, 1, 0, 5, 6, 7, 8, 9},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
        {0, 4, 6, 5, 3, 8, 1, 7, 2, 9},
        {1, 4, 7, 9, 8, 6, 5, 3, 0, 2},
        {2, 1, 4, 3, 6, 5, 8, 7, 9, 0}
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