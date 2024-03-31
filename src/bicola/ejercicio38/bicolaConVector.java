package bicola.ejercicio38;

/**
 * Clase que implementa una bicola con un array de enteros.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class bicolaConVector {
    /**
     * Array de enteros que almacena los elementos de la bicola.
     */
    @SuppressWarnings("unused")
    private int[] array;
    /**
     * Índice del primer elemento de la bicola.
     */
    private int primerElemento;
    /**
     * Índice del último elemento de la bicola.
     */
    private int ultimoElemento;
    /**
     * Capacidad de la bicola.
     */
    private int capacidad;

    /**
     * Constructor de la clase.
     * 
     * @param capacidad Capacidad de la bicola.
     */
    public bicolaConVector(int capacidad) {
        this.capacidad = capacidad;
        this.array = new int[capacidad];
        this.primerElemento = -1;
        this.ultimoElemento = 0;
    }

    /**
     * Comprueba si la bicola está vacía.
     * 
     * @return true si la bicola está vacía, false en caso contrario.
     */
    public boolean estaVacia() {
        return (primerElemento == -1);
    }

    /**
     * Comprueba si la bicola está llena.
     * 
     * @return true si la bicola está llena, false en caso contrario.
     */
    public boolean estaLlena() {
        return ((primerElemento == 0 && ultimoElemento == capacidad-1) || primerElemento == ultimoElemento+1);
    }
}