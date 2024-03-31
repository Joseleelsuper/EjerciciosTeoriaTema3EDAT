package listaEnlazada;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de test para ejercicio43.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio43Test {

    /**
     * Test para el método agruparSumar.
     */
    @Test
    public void testAgruparSumar() {
        ejercicio43 lista = new ejercicio43();

        // Test case 1: []
        lista.agruparSumar();
        assertNull(lista.cabeza);

        // Test case 2: [1]
        lista.agregar(1);
        lista.agruparSumar();
        assertEquals(1, lista.cabeza.dato);
        assertNull(lista.cabeza.siguiente);

        // Test case 3: [1, 2]
        lista = new ejercicio43();
        lista.agregar(2);
        lista.agregar(1);
        lista.agruparSumar();
        assertEquals(3, lista.cabeza.dato);
        assertNull(lista.cabeza.siguiente);

        // Test case 4: [1, 2, 3]
        lista = new ejercicio43();
        lista.agregar(3);
        lista.agregar(2);
        lista.agregar(1);
        lista.agruparSumar();
        assertEquals(3, lista.cabeza.dato);
        assertEquals(3, lista.cabeza.siguiente.dato);
        assertNull(lista.cabeza.siguiente.siguiente);

        // Test case 5: [1, 2, 3, 4]
        lista = new ejercicio43();
        lista.agregar(4);
        lista.agregar(3);
        lista.agregar(2);
        lista.agregar(1);
        lista.agruparSumar();
        assertEquals(3, lista.cabeza.dato);
        assertEquals(7, lista.cabeza.siguiente.dato);
        assertNull(lista.cabeza.siguiente.siguiente);

        // Test case 6: [1, 2, 3, 4, 5]
        lista = new ejercicio43();
        lista.agregar(5);
        lista.agregar(4);
        lista.agregar(3);
        lista.agregar(2);
        lista.agregar(1);
        lista.agruparSumar();
        assertEquals(3, lista.cabeza.dato);
        assertEquals(7, lista.cabeza.siguiente.dato);
        assertEquals(5, lista.cabeza.siguiente.siguiente.dato);
        assertNull(lista.cabeza.siguiente.siguiente.siguiente);
    }
}