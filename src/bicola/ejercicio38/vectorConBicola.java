package bicola.ejercicio38;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Clase que implementa un vector con una bicola.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class vectorConBicola {
    /**
     * Bicola que almacena los elementos del vector.
     */
    private Deque<Integer> bicola;

    /**
     * Constructor de la clase.
     */
    public vectorConBicola() {
        this.bicola = new LinkedList<>();
    }

    /**
     * Añade un elemento al final del vector.
     * 
     * @param elemento Elemento a añadir.
     */
    public void agregar(int elemento) {
        bicola.addLast(elemento);
    }

    /**
     * Añade un elemento al principio del vector.
     * 
     * @param indice Elemento a añadir.
     * @return true si se ha añadido correctamente, false en caso contrario.
     */
    public int obtener(int indice) {
        if (indice < 0 || indice >= bicola.size()) {
            throw new IndexOutOfBoundsException();
        }

        int i = 0;
        for (Integer elemento : bicola) {
            if (i == indice) {
                return elemento;
            }
            i++;
        }

        throw new IndexOutOfBoundsException();
    }
}