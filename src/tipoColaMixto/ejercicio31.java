package tipoColaMixto;

/**
 * Clase que contiene un método que crea una cola con capacidad variable
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio31 {
    /**
     * Variables que almacenarán el primer y último nodo de la cola.
     */
    private Node first, last;
    /**
     * Variables que almacenarán el tamaño de la cola y la capacidad de los nodos.
     */
    private int size, nodeCapacity;

    /**
     * Método principal que crea una cola con capacidad de 3 elementos y añade 9 elementos a la cola.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        ejercicio31 queue = new ejercicio31(3);
        for (int i = 1; i <= 9; i++) {
            queue.anadir(i);
        }

        while (queue.size() > 0) {
            System.out.println(queue.mostrarYEliminar());
        }
    }

    /**
     * Constructor de la clase.
     * 
     * @param nodeCapacity Capacidad de los nodos.
     */
    public ejercicio31(int nodeCapacity) {
        this.nodeCapacity = nodeCapacity;
    }

    /**
     * Método que añade un elemento a la cola.
     * 
     * @param value Valor a añadir.
     */
    public void anadir(int value) {
        if (last == null || last.count == nodeCapacity) {
            Node newNode = new Node(nodeCapacity);
            newNode.values[newNode.count++] = value;
            if (first == null) {
                first = last = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }
        } else {
            last.values[last.count++] = value;
        }
        size++;
    }

    /**
     * Método que muestra y elimina el primer elemento de la cola.
     * 
     * @return Primer elemento de la cola.
     */
    public int mostrarYEliminar() {
        if (first == null) throw new IllegalStateException("Queue is empty");
        int value = first.values[--first.count];
        if (first.count == 0) {
            first = first.next;
            if (first == null) last = null;
        }
        size--;
        return value;
    }

    /**
     * Método que devuelve el tamaño de la cola.
     * 
     * @return Tamaño de la cola.
     */
    public int size() {
        return size;
    }

    /**
     * Clase que representa un nodo de la cola.
     * 
     * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
     * @version 1.0
     */
    private static class Node {
        /**
         * Array que almacena los valores del nodo.
         */
        int[] values;
        /**
         * Número de elementos del nodo.
         */
        int count;
        /**
         * Siguiente nodo.
         */
        Node next;

        /**
         * Constructor de la clase.
         * 
         * @param capacity Capacidad del nodo.
         */
        Node(int capacity) {
            values = new int[capacity];
        }
    }
}