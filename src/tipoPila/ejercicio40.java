package tipoPila;

import java.util.Queue;
import java.util.LinkedList;

/**
 * Clase que implementa una pila con dos colas.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio40 {

    /**
     * Cola 1.
     */
    Queue<Integer> q1 = new LinkedList<>();
    /**
     * Cola 2.
     */
    Queue<Integer> q2 = new LinkedList<>();

    /**
     * Método principal.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        ejercicio40 pila = new ejercicio40();
        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
    }

    /**
     * Método que añade un elemento a la pila.
     * 
     * @param x Elemento a añadir.
     */
    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        q1.add(x);

        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
    }

    /**
     * Método que elimina un elemento de la pila.
     * 
     * @return Elemento eliminado.
     */
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("La pila está vacía");
            return -1;
        }
        return q1.poll();
    }
}