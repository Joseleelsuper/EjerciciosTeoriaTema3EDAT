package eliminarElementosRepetidos;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Clase que elimina los elementos repetidos de una cola.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio34 {

    /**
     * Método que elimina los elementos repetidos de una cola.
     * 
     * @param <T> Tipo de los elementos de la cola.
     * @param colaOriginal Cola original.
     * @return Cola sin elementos repetidos.
     */
    public <T> Queue<T> eliminarRepetidos(Queue<T> colaOriginal) {
        Queue<T> nuevaCola = new LinkedList<>();
        T ultimoElemento = null;

        while (!colaOriginal.isEmpty()) {
            T elemento = colaOriginal.remove();
            if (ultimoElemento == null || !elemento.equals(ultimoElemento)) {
                nuevaCola.add(elemento);
                ultimoElemento = elemento;
            }
        }

        return nuevaCola;
    }
}