package tipoPila.dosPilas;

/**
 * Clase que contiene un método que crea una pila con dos pilas y permite apilar y desapilar elementos en cada una de ellas.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio32 {
    /**
     * Vector que almacenará los elementos de las pilas.
     */
    private int[] vector;
    /**
     * Variables que almacenarán la cima de cada pila.
     */
    private int cima1, cima2;

    /**
     * Método principal que crea una pila con capacidad de 5 elementos y añade 5 elementos a cada pila.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        ejercicio32 pila = new ejercicio32(5);
        pila.apilar(1, 1);
        pila.apilar(1, 2);
        pila.apilar(1, 3);
        pila.apilar(2, 4);
        pila.apilar(2, 5);
        System.out.println(pila.desapilar(1));
        System.out.println(pila.cima(1));
        System.out.println(pila.cima(2));
        System.out.println(pila.estanLlenas());
    }

    /**
     * Constructor de la clase.
     * 
     * @param capacidad Capacidad de la pila.
     */
    public ejercicio32(int capacidad) {
        vector = new int[capacidad];
        cima1 = -1;
        cima2 = capacidad;
    }

    /**
     * Método que apila un elemento en la pila indicada.
     * 
     * @param numeroPila Número de la pila.
     * @param valor Valor a apilar.
     */
    public void apilar(int numeroPila, int valor) {
        if (cima1 + 1 == cima2) throw new IllegalStateException("Las pilas están llenas");
        if (numeroPila == 1) {
            vector[++cima1] = valor;
        } else if (numeroPila == 2) {
            vector[--cima2] = valor;
        } else {
            throw new IllegalArgumentException("El número de pila debe ser 1 o 2");
        }
    }

    /**
     * Método que desapila un elemento de la pila indicada.
     * 
     * @param numeroPila Número de la pila.
     * @return Elemento desapilado.
     */
    public int desapilar(int numeroPila) {
        if (numeroPila == 1) {
            if (cima1 == -1) throw new IllegalStateException("La pila 1 está vacía");
            return vector[cima1--];
        } else if (numeroPila == 2) {
            if (cima2 == vector.length) throw new IllegalStateException("La pila 2 está vacía");
            return vector[cima2++];
        } else {
            throw new IllegalArgumentException("El número de pila debe ser 1 o 2");
        }
    }

    /**
     * Método que devuelve la cima de la pila indicada.
     * 
     * @param numeroPila Número de la pila.
     * @return Cima de la pila.
     */
    public int cima(int numeroPila) {
        if (numeroPila == 1) {
            if (cima1 == -1) throw new IllegalStateException("La pila 1 está vacía");
            return vector[cima1];
        } else if (numeroPila == 2) {
            if (cima2 == vector.length) throw new IllegalStateException("La pila 2 está vacía");
            return vector[cima2];
        } else {
            throw new IllegalArgumentException("El número de pila debe ser 1 o 2");
        }
    }

    /**
     * Método que indica si las pilas están llenas.
     * 
     * @return {@code true} si las pilas están llenas, {@code false} en caso contrario.
     */
    public boolean estanLlenas() {
        return cima1 + 1 == cima2;
    }
}