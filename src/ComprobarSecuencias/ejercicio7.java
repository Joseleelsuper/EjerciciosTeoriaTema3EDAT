package ComprobarSecuencias;

/**
 * Clase que contiene la secuencia de enteros a comprobar.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio7 {
    
    /**
     * Secuencia de enteros.
     */
    private static int[][] secuencia = {
        {1, 4, 7, 6, 5, 3, 2, 9, 8},
        {1, 5, 2, 6, 4, 9, 8, 3, 7},
        {2, 1, 4, 3, 7, 6, 8, 9, 5},
        {2, 5, 6, 4, 7, 1, 8, 3, 9},
        {3, 2, 1, 6, 5, 7, 8, 9, 4},
        {6, 5, 4, 8, 9, 7, 3, 2, 1},
        {8, 5, 3, 7, 4, 9, 2, 6, 1},
        {9, 4, 1, 2, 7, 6, 5, 8, 3}
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
