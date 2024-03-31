package datosRepetidos;

import java.util.HashMap;
import java.util.Queue;

/**
 * Clase que contiene un método que comprueba si todos los elementos de una cola tienen la misma frecuencia.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio33 {
    
    /**
     * Método que comprueba si todos los elementos de una cola tienen la misma frecuencia.
     * 
     * @param <T> Tipo de los elementos de la cola.
     * @param cola Cola de elementos.
     * @return true si todos los elementos tienen la misma frecuencia, false en caso contrario.
     */
    public static <T> boolean mismaFrecuencia(Queue<T> cola) {
        HashMap<T, Integer> frecuencias = new HashMap<>();
    
        while (!cola.isEmpty()) {
            T elemento = cola.poll();
            frecuencias.put(elemento, frecuencias.getOrDefault(elemento, 0) + 1);
        }
    
        int frecuencia = -1;
        for (int f : frecuencias.values()) {
            if (frecuencia == -1) {
                frecuencia = f;
            } else if (frecuencia != f) {
                return false;
            }
        }
    
        return true;
    }
}