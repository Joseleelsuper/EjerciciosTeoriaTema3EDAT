package ExpresionesPostfijas;

import java.util.HashMap;

/**
 * Clase que contiene la expresión a y el valor de las variables a evaluar.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class ejercicio9 {
    /**
     * Expresión a evaluar.
     */
    private static String expresion = "(x+(4*(x+2*y))-3/x)*y";
    /**
     * Valor de las variables en la expresión.
     */
    private static HashMap<Character, Integer> valor_variables = new HashMap<>();

    static {
        valor_variables.put('x', 1);
        valor_variables.put('y', 2);
    }

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