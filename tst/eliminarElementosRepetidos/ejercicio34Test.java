package eliminarElementosRepetidos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Clase de test para la clase ejercicio34.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio34Test {
    
    /**
     * Test para el método eliminarRepetidos.
     */
    @Test
    public void testEliminarRepetidos() {
        ejercicio34 ej = new ejercicio34();

        // Test case 1
        Queue<Integer> testQueue1 = new LinkedList<>();
        testQueue1.add(1);
        testQueue1.add(2);
        testQueue1.add(2);
        testQueue1.add(2);
        testQueue1.add(3);
        testQueue1.add(3);
        Queue<Integer> resultQueue1 = ej.eliminarRepetidos(testQueue1);
        assertEquals(3, resultQueue1.size());
        assertEquals(1, resultQueue1.poll());
        assertEquals(2, resultQueue1.poll());
        assertEquals(3, resultQueue1.poll());

        // Test case 2
        Queue<Integer> testQueue2 = new LinkedList<>();
        testQueue2.add(1);
        testQueue2.add(2);
        testQueue2.add(3);
        testQueue2.add(1);
        testQueue2.add(2);
        Queue<Integer> resultQueue2 = ej.eliminarRepetidos(testQueue2);
        assertEquals(5, resultQueue2.size());
        assertEquals(1, resultQueue2.poll());
        assertEquals(2, resultQueue2.poll());
        assertEquals(3, resultQueue2.poll());
        assertEquals(1, resultQueue2.poll());
        assertEquals(2, resultQueue2.poll());

        // Test case 3
        Queue<Integer> testQueue3 = new LinkedList<>();
        testQueue3.add(1);
        testQueue3.add(1);
        testQueue3.add(2);
        testQueue3.add(1);
        testQueue3.add(1);
        Queue<Integer> resultQueue3 = ej.eliminarRepetidos(testQueue3);
        assertEquals(3, resultQueue3.size());
        assertEquals(1, resultQueue3.poll());
        assertEquals(2, resultQueue3.poll());
        assertEquals(1, resultQueue3.poll());
    }
}
