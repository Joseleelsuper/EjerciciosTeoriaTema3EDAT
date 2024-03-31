package datosRepetidos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Clase que implementa una cola para comprobar si tiene la misma frecuencia de
 * elementos.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio33Test {


    /**
     * Test de cola vacía.
     */
    @Test
    public void colaVacia() {
        Queue<String> cola = new LinkedList<>();
        assertTrue(ejercicio33.mismaFrecuencia(cola));
    }

    /**
     * Test de misma frecuencia.
     */
    @Test
    public void mismaFrecuencia() {
        //Test case 1
        Queue<String> cola = new LinkedList<>();
        cola.add("a");
        cola.add("b");
        cola.add("c");
        assertTrue(ejercicio33.mismaFrecuencia(cola));

        //Test case 2
        cola = new LinkedList<>();
        cola.add("a");
        cola.add("b");
        cola.add("b");
        cola.add("a");
        assertTrue(ejercicio33.mismaFrecuencia(cola));
    }

    /**
     * Test de frecuencia no igual.
     */
    @Test
    public void frecuenciaNoIgual() {
        Queue<String> cola = new LinkedList<>();
        cola.add("a");
        cola.add("b");
        cola.add("a");
        assertFalse(ejercicio33.mismaFrecuencia(cola));
    }
}