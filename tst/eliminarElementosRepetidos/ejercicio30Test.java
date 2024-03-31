package eliminarElementosRepetidos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Clase de test para la clase ejercicio30.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio30Test {

    /**
     * Test para el método eliminarRepetidos con una cola.
     */
    @Test
    public void testEliminarRepetidosQueue() {
        ejercicio30 ej = new ejercicio30();

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

    /**
     * Test para el método eliminarRepetidos con una lista simplemente enlazada.
     */
    @Test
    public void testEliminarRepetidosNode() {
        ejercicio30 ej = new ejercicio30();

        // Test case 1
        ejercicio30.Node head1 = ej.new Node(1);
        head1.next = ej.new Node(1);
        head1.next.next = ej.new Node(2);
        head1.next.next.next = ej.new Node(1);
        head1.next.next.next.next = ej.new Node(1);
        ejercicio30.Node resultNode1 = ej.eliminarRepetidos(head1);
        assertEquals(1, resultNode1.value);
        assertEquals(2, resultNode1.next.value);
        assertEquals(1, resultNode1.next.next.value);
        assertNull(resultNode1.next.next.next);

        // Test case 2
        ejercicio30.Node head2 = ej.new Node(1);
        head2.next = ej.new Node(2);
        head2.next.next = ej.new Node(3);
        head2.next.next.next = ej.new Node(1);
        head2.next.next.next.next = ej.new Node(2);
        ejercicio30.Node resultNode2 = ej.eliminarRepetidos(head2);
        assertEquals(1, resultNode2.value);
        assertEquals(2, resultNode2.next.value);
        assertEquals(3, resultNode2.next.next.value);
        assertEquals(1, resultNode2.next.next.next.value);
        assertEquals(2, resultNode2.next.next.next.next.value);
        assertNull(resultNode2.next.next.next.next.next);

        // Test case 3
        ejercicio30.Node head3 = ej.new Node(1);
        head3.next = ej.new Node(1);
        head3.next.next = ej.new Node(2);
        head3.next.next.next = ej.new Node(1);
        head3.next.next.next.next = ej.new Node(1);
        ejercicio30.Node resultNode3 = ej.eliminarRepetidos(head3);
        assertEquals(1, resultNode3.value);
        assertEquals(2, resultNode3.next.value);
        assertEquals(1, resultNode3.next.next.value);
        assertNull(resultNode3.next.next.next);
    }
}