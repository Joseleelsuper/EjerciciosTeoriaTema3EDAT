package listaEnlazada;

/**
 * Clase que implementa una lista enlazada para agrupar y sumar elementos de 2 en 2.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio43 {

    /**
     * Nodo que representa la cabeza de la lista.
     */
    Nodo cabeza;

    /**
     * Método que añade un elemento a la lista.
     * 
     * @param dato Elemento a añadir.
     */
    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    /**
     * Método que agrupa y suma los elementos de la lista.
     */
    public void agruparSumar() {
        Nodo actual = cabeza;

        while (actual != null && actual.siguiente != null) {
            actual.dato += actual.siguiente.dato;
            actual.siguiente = actual.siguiente.siguiente;
            actual = actual.siguiente;
        }
    }

    /**
     * Método que imprime los elementos de la lista.
     */
    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
    }
}

/**
 * Clase que implementa un nodo de una lista enlazada.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
class Nodo {

    /**
     * Dato almacenado en el nodo.
     */
    int dato;
    /**
     * Nodo siguiente.
     */
    Nodo siguiente;

    /**
     * Constructor de la clase.
     * 
     * @param d Dato del nodo.
     */
    Nodo(int d) {
        dato = d;
        siguiente = null;
    }
}