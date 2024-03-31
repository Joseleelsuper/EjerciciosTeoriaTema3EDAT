package eliminarElementosRepetidos;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Clase que contiene dos métodos para eliminar elementos repetidos de una cola o una lista simplemente enlazada.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio30 {

    /**
     * Método que elimina los elementos repetidos de una cola.
     * 
     * @param colaOriginal Cola original.
     * @return Cola sin elementos repetidos.
     */
    public Queue<Integer> eliminarRepetidos(Queue<Integer> colaOriginal) {
        Queue<Integer> nuevaCola = new LinkedList<>();
        Integer ultimoElemento = null;

        while (!colaOriginal.isEmpty()) {
            Integer elemento = colaOriginal.remove();
            if (ultimoElemento == null || !elemento.equals(ultimoElemento)) {
                nuevaCola.add(elemento);
                ultimoElemento = elemento;
            }
        }

        return nuevaCola;
    }

    /**
     * Método que elimina los elementos repetidos de una lista simplemente enlazada.
     * 
     * @param head Cabeza de la lista.
     * @return Cabeza de la lista sin elementos repetidos.
     */
    public Node eliminarRepetidos(Node head) {
        if (head == null) return null;
        Node nuevaHead = new Node(head.value);
        Node tail = nuevaHead;

        while (head != null) {
            if (head.value != tail.value) {
                Node newNode = new Node(head.value);
                tail.next = newNode;
                tail = newNode;
            }
            head = head.next;
        }

        return nuevaHead;
    }

    /**
     * Clase que representa un nodo de una lista simplemente enlazada.
     * 
     * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
     * @version 1.0
     */
    class Node {
        /**
         * Valor del nodo.
         */
        int value;
        /**
         * Siguiente nodo.
         */
        Node next;

        /**
         * Constructor de la clase.
         * 
         * @param value Valor del nodo.
         */
        Node(int value) {
            this.value = value;
        }
    }
}