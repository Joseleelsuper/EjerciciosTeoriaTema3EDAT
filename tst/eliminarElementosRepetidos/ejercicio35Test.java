package eliminarElementosRepetidos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de test para la clase ejercicio35.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio35Test {
    
    /**
     * Test para el método eliminarRepetidos.
     */
    @Test
    public void testEliminarRepetidos() {
        ejercicio35<Integer> ej = new ejercicio35<>();

        // Test case 1
        ejercicio35<Integer> testQueue1 = new ejercicio35<>();
        testQueue1.agregar(1);
        testQueue1.agregar(2);
        testQueue1.agregar(2);
        testQueue1.agregar(2);
        testQueue1.agregar(3);
        testQueue1.agregar(3);
        ejercicio35<Integer> resultQueue1 = ej.eliminarRepetidos(testQueue1);
        assertEquals(3, resultQueue1.size());
        assertEquals(1, resultQueue1.eliminar());
        assertEquals(2, resultQueue1.eliminar());
        assertEquals(3, resultQueue1.eliminar());

        // Test case 2
        ejercicio35<Integer> testQueue2 = new ejercicio35<>();
        testQueue2.agregar(1);
        testQueue2.agregar(2);
        testQueue2.agregar(3);
        testQueue2.agregar(1);
        testQueue2.agregar(2);
        ejercicio35<Integer> resultQueue2 = ej.eliminarRepetidos(testQueue2);
        assertEquals(5, resultQueue2.size());
        assertEquals(1, resultQueue2.eliminar());
        assertEquals(2, resultQueue2.eliminar());
        assertEquals(3, resultQueue2.eliminar());
        assertEquals(1, resultQueue2.eliminar());
        assertEquals(2, resultQueue2.eliminar());

        // Test case 3
        ejercicio35<Integer> testQueue3 = new ejercicio35<>();
        testQueue3.agregar(1);
        testQueue3.agregar(1);
        testQueue3.agregar(2);
        testQueue3.agregar(1);
        testQueue3.agregar(1);
        ejercicio35<Integer> resultQueue3 = ej.eliminarRepetidos(testQueue3);
        assertEquals(3, resultQueue3.size());
        assertEquals(1, resultQueue3.eliminar());
        assertEquals(2, resultQueue3.eliminar());
        assertEquals(1, resultQueue3.eliminar());
    }
}