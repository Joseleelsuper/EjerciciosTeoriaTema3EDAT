package invertirElementos;

import java.util.Queue;
import java.util.LinkedList;

/**
 * Clase que invierte los elementos de una cola.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio39 {
    
    /**
     * Método principal.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        cola.add(5);

        invertirCola(cola);

        while (!cola.isEmpty()) {
            System.out.print(cola.poll() + " ");
        }
    }

    /**
     * Invierte los elementos de una cola.
     * 
     * @param cola Cola a invertir.
     */
    public static void invertirCola(Queue<Integer> cola) {
        if (cola.isEmpty())
            return;
        
        int frente = cola.poll();
        invertirCola(cola);
        cola.add(frente);
    }
}