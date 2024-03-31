package ComprobarSecuencias;

import java.util.Stack;

/**
 * Clase que comprueba si una secuencia de enteros se puede obtener mediante
 * un proceso de insercion y eliminacion en una pila.
 * 
 * Dada una pila inicialmente vacía, se realizan entremezcladas operaciones de inserción y de eliminación. 
 * Los valores que se insertan, en orden ascendente. Cada vez que se saca un elemento, se imprime. 
 * Indique cuales de las siguientes secuencias se pueden obtener mediante este proceso.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class comprobarSecuencias {

    /**
     * Método principal de la clase.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        
        // TODO: Cambiar la secuencia por las que se desee comprobar.
        int[][] secuencia = ejercicio7.obtenerSecuencia();

        for (int i = 0; i < secuencia.length; i++) {
            if (checkSecuencia(secuencia[i])) {
                System.out.println("La secuencia " + (char)('a' + i) + ") acierta.");
            } else {
                System.out.println("La secuencia " + (char)('a' + i) + ") falla.");
            }
        }
    }

    /**
     * Método que comprueba si una secuencia de enteros se puede obtener mediante
     * un proceso de insercion y eliminacion en una pila.
     * 
     * @param secuencia Secuencia de enteros.
     * @return
     * <p><b>true</b> si la secuencia se puede obtener a través de operaciones de inserción y eliminación en una pila.</p>
     * <p><b>false</b> en caso contrario, es decir, la secuencia no puede ser obtenida a través de operaciones de inserción y eliminación en una pila.</p>
     */
    public static boolean checkSecuencia(int[] secuencia) {
        Stack<Integer> stack = new Stack<>();
        int n = secuencia.length;
        int j = 0;

        for (int i = 1; i <= n; i++) {
            stack.push(i);
            while (!stack.isEmpty() && stack.peek() == secuencia[j]) {
                stack.pop();
                j++;
            }
        }

        return stack.isEmpty();
    }
}