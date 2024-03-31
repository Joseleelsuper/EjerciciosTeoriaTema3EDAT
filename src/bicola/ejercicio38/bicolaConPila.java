package bicola.ejercicio38;

import java.util.Stack;

/**
 * Clase que implementa una bicola con dos pilas.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class bicolaConPila {

    /**
     * Pila que almacena los elementos de la bicola.
     */
    private Stack<Integer> pila1;
    /**
     * Pila auxiliar para realizar las operaciones de la bicola.
     */
    private Stack<Integer> pila2;

    /**
     * Constructor de la clase.
     */
    public bicolaConPila() {
        this.pila1 = new Stack<>();
        this.pila2 = new Stack<>();
    }

    /**
     * Inserta un elemento al principio de la bicola.
     * 
     * @param elemento Elemento a insertar.
     */
    public void insertarPrimerElemento(int elemento) {
        pila1.push(elemento);
    }

    /**
     * Inserta un elemento al final de la bicola.
     * 
     * @param elemento Elemento a insertar.
     */
    public void insertarUltimoElemento(int elemento) {
        pila2.push(elemento);
    }

    /**
     * Elimina el primer elemento de la bicola.
     * 
     * @return Elemento eliminado.
     */
    public int eliminarPrimerElemento() {
        if (pila1.isEmpty()) {
            while (!pila2.isEmpty()) {
                pila1.push(pila2.pop());
            }
        }
        return pila1.pop();
    }

    /**
     * Elimina el último elemento de la bicola.
     * 
     * @return Elemento eliminado.
     */
    public int eliminarUltimoElemento() {
        if (pila2.isEmpty()) {
            while (!pila1.isEmpty()) {
                pila2.push(pila1.pop());
            }
        }
        return pila2.pop();
    }
}