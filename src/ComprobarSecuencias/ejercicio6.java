package ComprobarSecuencias;

/**
 * Clase que contiene la secuencia de enteros a comprobar.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio6 {
    
    /**
     * Secuencia de enteros.
     */
    private static int[][] secuencia = {
        {2, 3, 1, 6, 8, 7, 5, 9, 4},
        {3, 1, 5, 2, 4, 6, 7, 9, 8},
        {3, 2, 6, 8, 7, 9, 5, 4, 1},
        {4, 3, 7, 6, 5, 2, 1, 9, 8},
        {4, 5, 3, 8, 2, 6, 7, 9, 1},
        {5, 3, 4, 2, 6, 7, 8, 9, 1},
        {6, 3, 2, 7, 1, 4, 9, 8, 5},
        {6, 5, 4, 7, 8, 3, 2, 1, 9}
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
