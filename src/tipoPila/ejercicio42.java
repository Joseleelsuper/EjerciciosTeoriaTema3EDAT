package tipoPila;

/**
 * Clase que implementa una pila con capacidad variable.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio42 {

    /**
     * Array que almacenará los elementos de la pila.
     */
    private int[] arr;
    /**
     * Índice del último elemento de la pila.
     */
    private int top;

    /**
     * Constructor de la clase.
     * 
     * @param n Tamaño de la pila.
     */
    public ejercicio42(int n) {
        arr = new int[n];
        top = -1;
    }

    /**
     * Método principal.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        ejercicio42 pila = new ejercicio42(3);
        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
    }

    /**
     * Método principal.
     * 
     * @param x Elemento a añadir.
     */
    public void push(int x) {
        if (top == arr.length - 1) {
            System.arraycopy(arr, 1, arr, 0, top);
        } else {
            top++;
        }

        arr[top] = x;
    }

    /**
     * Método que elimina un elemento de la pila.
     * 
     * @return Elemento eliminado.
     */
    public int pop() {
        if (top == -1) {
            throw new IllegalStateException("La pila está vacía");
        }

        int poppedElement = arr[top];
        arr[top] = 0;
        top--;
        return poppedElement;
    }

    /**
     * Método que devuelve el último elemento de la pila.
     * 
     * @return Último elemento de la pila.
     */
    public int peek() {
        if (top == -1) {
            throw new IllegalStateException("La pila está vacía");
        }

        return arr[top];
    }
}