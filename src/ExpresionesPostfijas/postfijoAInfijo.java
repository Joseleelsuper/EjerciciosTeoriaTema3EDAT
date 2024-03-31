package ExpresionesPostfijas;

import java.util.HashMap;
import java.util.Stack;

/**
 * Clase que convierte una expresión postfija a infija.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class postfijoAInfijo {

    /**
     * Método principal de la clase.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // TODO: Cambiar expresión a analizar.
        String expresion = ejercicio21.obtenerExpresion();
        
        // Convertir a notación infija
        String expresionInfija = convertirAInfija(expresion);
        expresionInfija = optimizarInfija(expresionInfija);
        System.out.println("Expresión en notación infija: " + expresionInfija + "\n");
        System.out.println("\nResultado de la expresión: " + evaluarPostfija(expresion, new HashMap<>()));
        System.out.print("\n");
    }

    /**
     * Método que comprueba si un carácter es un operador.
     * 
     * @param c Carácter a comprobar.
     * @return <p><b>true</b> si el carácter es un operador.</p><p><b>false</b> en caso contrario.</p>
     */
    public static boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    /**
     * Método que convierte una expresión postfija a infija.
     * 
     * @param expresion Expresión postfija a convertir.
     * @return Expresión en notación infija.
     */
    public static String convertirAInfija(String expresion) {
        Stack<String> pila = new Stack<>();
        // Gracias a esto se puede recorrer la expresión con números de más de un dígito
        StringBuilder valorActual = new StringBuilder();
        for (char c : expresion.toCharArray()) {
            if (c != ' ') {
                valorActual.append(c);
            } else {
                procesarValor(pila, valorActual.toString());
                valorActual = new StringBuilder();
            }
        }
        // Procesar el último valor
        procesarValor(pila, valorActual.toString());
    
        return pila.pop();
    }
    
    /**
     * Método que procesa un valor de la expresión postfija.
     * 
     * @param pila Pila de valores.
     * @param valor Valor a procesar.
     */
    private static void procesarValor(Stack<String> pila, String valor) {
        if (Character.isLetterOrDigit(valor.charAt(0))) {
            pila.push(valor);
        } else if (esOperador(valor.charAt(0))) {
            String operand2 = pila.pop();
            String operand1 = pila.pop();
            String resultado = "(" + operand1 + valor + operand2 + ")";
            pila.push(resultado);
        }
    }

    /**
     * Método que evalúa una expresión postfija.
     * 
     * @param expresion Expresión postfija a evaluar.
     * @param valor_variables Valores de las variables de la expresión.
     * @return Resultado de la expresión.
     */
    private static int evaluarPostfija(String expresion, HashMap<Character, Integer> valor_variables) {
        Stack<Integer> pila = new Stack<>();
        StringBuilder valorActual = new StringBuilder();
        for (char c : expresion.toCharArray()) {
            if (c != ' ') {
                valorActual.append(c);
            } else {
                procesarValor(pila, valorActual.toString(), valor_variables);
                valorActual = new StringBuilder();
            }
        }
    
        // Procesar el último valor
        procesarValor(pila, valorActual.toString(), valor_variables);
        return pila.pop();
    }

    /**
     * Método que procesa un valor de la expresión postfija.
     * 
     * @param pila Pila de valores.
     * @param valor Valor a procesar.
     * @param valor_variables Valores de las variables de la expresión.
     */
    private static void procesarValor(Stack<Integer> pila, String valor, HashMap<Character, Integer> valor_variables) {
        if (Character.isDigit(valor.charAt(0))) {
            pila.push(Integer.parseInt(valor));
            System.out.println("Dígito encontrado: " + valor + ", Apilado: " + pila);
        } else if (Character.isLetter(valor.charAt(0))) {
            if (!valor_variables.containsKey(valor.charAt(0))) {
                throw new IllegalArgumentException("Variable no definida: " + valor.charAt(0));
            }
            pila.push(valor_variables.get(valor.charAt(0)));
            System.out.println("Variable encontrada: " + valor.charAt(0) + ", Apilado: " + pila);
        } else if (esOperador(valor.charAt(0))) {
            if (pila.size() < 2) {
                throw new IllegalArgumentException("Expresión inválida, faltan operandos");
            }
            int operand2 = pila.pop();
            int operand1 = pila.pop();
            System.out.println("Operandos desapilados: " + operand1 + ", " + operand2);
            int resultado = 0;
            switch (valor.charAt(0)) {
                case '+':
                    resultado = operand1 + operand2;
                    break;
                case '-':
                    resultado = operand1 - operand2;
                    break;
                case '*':
                    resultado = operand1 * operand2;
                    break;
                case '/':
                    if (operand2 == 0) {
                        throw new IllegalArgumentException("La división por cero no está permitida");
                    }
                    resultado = operand1 / operand2;
                    break;
            }
            pila.push(resultado);
            System.out.println("Resultado de la operación apilado: " + pila);
        }
    }

    /**
     * Método que optimiza una expresión infija.
     * 
     * @param expresionInfija Expresión infija a optimizar.
     * @return Expresión infija optimizada.
     */
    private static String optimizarInfija(String expresionInfija) {
        expresionInfija = expresionInfija.substring(1, expresionInfija.length() - 1);
        return expresionInfija;
    }
}