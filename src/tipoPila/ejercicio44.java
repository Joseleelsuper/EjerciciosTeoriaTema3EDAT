package tipoPila;

import java.util.Stack;

/**
 * Clase que implementa una pila para agrupar y sumar elementos de 2 en 2.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio44 {

    /**
     * Pila que almacenará los elementos.
     */
    Stack<Integer> pila;

    /**
     * Constructor de la clase.
     */
    public ejercicio44() {
        pila = new Stack<>();
    }

    /**
     * Método que añade un elemento a la pila.
     * 
     * @param x Elemento a añadir.
     */
    public void push(int x) {
        pila.push(x);
    }

    /**
     * Método que elimina un elemento de la pila.
     */
    public void agruparSumar() {
        Stack<Integer> pilaAux = new Stack<>();
        while (!pila.isEmpty()) {
            int sum = 0;
            if (!pila.isEmpty()) {
                sum += pila.pop();
            }
            if (!pila.isEmpty()) {
                sum += pila.pop();
            }
            pilaAux.push(sum);
        }
        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());
        }
    }

    /**
     * Método que imprime los elementos de la pila.
     */
    public void imprimir() {
        for (int i : pila) {
            System.out.print(i + " ");
        }
    }
}