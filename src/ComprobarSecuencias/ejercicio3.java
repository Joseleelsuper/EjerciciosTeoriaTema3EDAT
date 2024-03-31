package ComprobarSecuencias;

/**
 * Clase que contiene la secuencia de enteros a comprobar.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio3 {

    /**
     * Secuencia de enteros.
     */
    private static int[][] secuencia = {
        {8, 9, 5, 2, 7, 6, 4, 3, 1},
        {1, 8, 3, 4, 9, 7, 5, 6, 2},
        {5, 4, 3, 2, 6, 7, 9, 8, 1},
        {4, 3, 2, 1, 5, 7, 8, 9, 6},
        {3, 4, 6, 7, 8, 5, 2, 1, 9},
        {7, 3, 8, 4, 6, 1, 5, 2, 9},
        {7, 9, 5, 4, 3, 1, 2, 8, 6},
        {5, 7, 6, 9, 8, 4, 3, 2, 1}
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
