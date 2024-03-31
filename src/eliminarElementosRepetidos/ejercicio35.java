package eliminarElementosRepetidos;

/**
 * Clase que elimina los elementos repetidos de una cola.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @param <T> Tipo de los elementos de la cola.
 */
public class ejercicio35<T> {

    /**
     * Nodo que representa el último elemento de la lista.
     */
    private Nodo<T> ultimo;

    /**
     * Clase que representa un nodo de la lista.
     * 
     * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
     * @param <E> Tipo del valor del nodo.
     */
    class Nodo<E> {

        /**
         * Valor del nodo.
         */
        E valor;
        /**
         * Siguiente nodo.
         */
        Nodo<E> siguiente;

        /**
         * Constructor de la clase.
         * 
         * @param valor Valor del nodo.
         */
        Nodo(E valor) {
            this.valor = valor;
        }
    }

    /**
     * Método que añade un elemento a la lista.
     * 
     * @param valor Elemento a añadir.
     */
    public void agregar(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        if (ultimo == null) {
            ultimo = nuevoNodo;
            ultimo.siguiente = ultimo;
        } else {
            nuevoNodo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }
    }

    /**
     * Método que elimina un elemento de la lista.
     * 
     * @return Elemento eliminado.
     */
    public T eliminar() {
        if (ultimo == null) {
            return null;
        }
        Nodo<T> nodoAEliminar = ultimo.siguiente;
        if (ultimo.siguiente == ultimo) {
            ultimo = null;
        } else {
            ultimo.siguiente = nodoAEliminar.siguiente;
        }
        return nodoAEliminar.valor;
    }

    /**
     * Método que comprueba si la lista está vacía.
     * 
     * @return true si la lista está vacía, false en caso contrario.
     */
    public boolean estaVacia() {
        return ultimo == null;
    }

    /**
     * Método que elimina los elementos repetidos de una lista.
     * 
     * @param <E> Tipo de los elementos de la lista.
     * @param listaOriginal Lista original.
     * @return Lista sin elementos repetidos.
     */
    public <E> ejercicio35<E> eliminarRepetidos(ejercicio35<E> listaOriginal) {
        ejercicio35<E> nuevaLista = new ejercicio35<>();
        E ultimoElemento = null;

        while (!listaOriginal.estaVacia()) {
            E elemento = listaOriginal.eliminar();
            if (ultimoElemento == null || !elemento.equals(ultimoElemento)) {
                nuevaLista.agregar(elemento);
                ultimoElemento = elemento;
            }
        }

        return nuevaLista;
    }

    /**
     * Método que devuelve el tamaño de la lista.
     * 
     * @return Tamaño de la lista.
     */
    public int size() {
        if (ultimo == null) {
            return 0;
        }
        int size = 1;
        Nodo<T> nodoActual = ultimo.siguiente;
        while (nodoActual != ultimo) {
            size++;
            nodoActual = nodoActual.siguiente;
        }
        return size;
    }
}