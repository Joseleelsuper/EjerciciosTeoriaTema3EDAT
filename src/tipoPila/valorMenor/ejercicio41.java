package tipoPila.valorMenor;

import java.util.Stack;

/**
 * Clase que implementa una pila con un método que devuelve el valor menor de la pila.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio41 {

    /**
     * Pila principal.
     */
    Stack<Integer> pilaPrincipal = new Stack<>();
    /**
     * Pila de valores menores.
     */
    Stack<Integer> pilaMin = new Stack<>();

    /**
     * Método principal.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        ejercicio41 minStack = new ejercicio41();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }

    /**
     * Método que añade un elemento a la pila.
     * 
     * @param x Elemento a añadir.
     */
    public void push(int x) {
        pilaPrincipal.push(x);

        if (pilaMin.isEmpty() || x <= pilaMin.peek()) {
            pilaMin.push(x);
        }
    }

    /**
     * Método que elimina un elemento de la pila.
     */
    public void pop() {
        if (pilaPrincipal.peek().equals(pilaMin.peek())) {
            pilaMin.pop();
        }

        pilaPrincipal.pop();
    }

    /**
     * Método que devuelve el valor menor de la pila.
     * 
     * @return Valor menor de la pila.
     */
    public int getMin() {
        return pilaMin.peek();
    }
}