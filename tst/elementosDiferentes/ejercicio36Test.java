package elementosDiferentes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Clase que implementa una cola para contar elementos únicos.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio36Test {
    
    /**
     * Test de contar elementos únicos.
     */
    @Test
    public void testContarElementosUnicos() {
        ejercicio36 ej = new ejercicio36();

        Queue<Integer> testQueue1 = new LinkedList<>();
        testQueue1.add(1);
        testQueue1.add(2);
        testQueue1.add(2);
        testQueue1.add(3);
        testQueue1.add(3);

        long startTime = System.currentTimeMillis();
        assertEquals(3, ej.contarElementosUnicos(new LinkedList<>(testQueue1)));
        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " ms");
    }
}