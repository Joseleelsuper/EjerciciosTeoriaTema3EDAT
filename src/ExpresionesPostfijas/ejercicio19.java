package ExpresionesPostfijas;

import java.util.HashMap;

/**
 * Clase que contiene la expresión a y el valor de las variables a evaluar.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio19 {
    /**
     * Expresión a evaluar.
     */
    private static String expresion = "2 7 10 5 / + 6 2 * + 4 1 - / *";
    /**
     * Valor de las variables en la expresión.
     */
    private static HashMap<Character, Integer> valor_variables = new HashMap<>();

    /**
     * Obtiene la expresión a evaluar.
     * 
     * @return Expresión a evaluar.
     */
    public static String obtenerExpresion() {
        return expresion;
    }

    /**
     * Método que obtiene el valor de las variables de la expresión.
     * 
     * @return Valor de las variables de la expresión.
     */
    public static HashMap<Character, Integer> obtenerValorVariables() {
        return valor_variables;
    }
}