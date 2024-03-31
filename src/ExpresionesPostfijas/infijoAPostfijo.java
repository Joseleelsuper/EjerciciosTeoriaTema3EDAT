package ExpresionesPostfijas;

import java.util.HashMap;
import java.util.Stack;

/**
 * Clase que convierte una expresión infija a postfija y evalúa la expresión postfija.
 * 
 * Utilice los algoritmos basados en pilas para convertir dicha expresión a postfijo y su evaluación. 
 * Muestre el estado de la entrada, la salida y la pila en cada paso de los métodos.
 * 
 * @author <a href="mailto:jgc1031@alu.ubu.es">José Gallardo Caballero</a>
 * @version 1.0
 */
public class infijoAPostfijo {

    /**
     * Método principal de la clase.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // TODO: Cambiar ejercicio a evaluar
        String expresion = ejercicio26.obtenerExpresion();
        HashMap<Character, Integer> valor_variables = ejercicio26.obtenerValorVariables();

        boolean hayVariables = false;
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            if (Character.isLetter(c)) {
                hayVariables = true;
                break;
            }
        }

        // Convertir a notación postfija
        String postfija = convertirAPostfija(expresion);
        System.out.print("\n");
        // Evaluar la expresión postfija
        if (!valor_variables.isEmpty()) {
            int resultado = evaluarPostfija(postfija, valor_variables);
            System.out.print("\n");
            System.out.println("Resultado de la expresión: " + resultado);
        } else if (!hayVariables) {
            int resultado = evaluarPostfija(postfija, new HashMap<>());
            System.out.print("\n");
            System.out.println("Resultado de la expresión: " + resultado);
        }
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
     * Método que devuelve la precedencia de un operador.
     * 
     * @param operador Operador a comprobar.
     * @return <p>1 si el operador es + o -.</p><p>2 si el operador es * o /.</p><p>-1 en caso contrario.</p>
     */
    public static int precedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    /**
     * Método que evalúa una expresión postfija.
     * 
     * @param expresion Expresión postfija a evaluar.
     * @param valor_variables Valores de las variables de la expresión.
     * @return Resultado de la evaluación de la expresión postfija.
     */
    public static int evaluarPostfija(String expresion, HashMap<Character, Integer> valor_variables) {
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

        if (pila.size() != 1) {
            throw new IllegalArgumentException("Expresión inválida, faltan operadores");
        }
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
     * Método que convierte una expresión infija a postfija.
     * 
     * @param expresion Expresión infija a convertir.
     * @return Expresión postfija.
     */
    public static String convertirAPostfija(String expresion) {
        StringBuilder resultado = new StringBuilder();
        Stack<Character> pila = new Stack<>();

        System.out.println("Entrada: Expresión: " + expresion + ", Pila: Vacía, Salida: Vacía");

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (Character.isDigit(c) || Character.isLetter(c)) {
                resultado.append(c);
                resultado.append(' ');
                System.out.println("Operando/Variable encontrado: " + c + ", Agregado a la salida: " + resultado.toString());
            } else if (c == '(') {
                pila.push(c);
                System.out.println("Paréntesis de apertura encontrado, agregado a la pila");
            } else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    resultado.append(pila.pop());
                    resultado.append(' ');
                }
                pila.pop(); // Sacamos el '(' de la pila
                System.out.println("Paréntesis de cierre encontrado, sacando operadores de la pila hasta encontrar '('");
            } else if (esOperador(c)) {
                while (!pila.isEmpty() && precedencia(c) <= precedencia(pila.peek())) {
                    resultado.append(pila.pop());
                    resultado.append(' ');
                }
                pila.push(c);
                System.out.println("Operador '" + c + "' encontrado, sacando operadores de la pila hasta que la pila esté vacía o el operador tenga menor precedencia");
            }
            System.out.println("Estado actual: Expresión: " + expresion.substring(i+1) + ", Pila: " + pila.toString() + ", Salida: " + resultado.toString());
        }

        while (!pila.isEmpty()) {
            resultado.append(pila.pop());
            resultado.append(' ');
        }

        System.out.println("Operadores restantes en la pila, sacándolos y agregándolos a la salida");
        System.out.println("\nExpresión postfija final: " + resultado.toString());
        return resultado.toString();
    }
}