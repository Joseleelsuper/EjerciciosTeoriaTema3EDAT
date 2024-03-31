package elementosDiferentes;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Clase que cuenta los elementos únicos de una cola.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio36 {
    
    /**
     * Método que cuenta los elementos únicos de una cola.
     * 
     * @param <T> Tipo de los elementos de la cola.
     * @param cola Cola de elementos.
     * @return Número de elementos únicos de la cola.
     */
    public <T> int contarElementosUnicos(Queue<T> cola) {
        int contador = 0;
        int size = cola.size();
        Queue<T> colaAux = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            T elemento = cola.remove();
            if (!colaAux.contains(elemento)) {
                contador++;
            }
            colaAux.add(elemento);
        }

        return contador;
    }
}