/*
 */
package ejercicio2;

import ListasGenericas.PilaGenerica;

public class Ejercicio4 {

    public static boolean esBalanceado(PilaGenerica<Character> pila, String txt) {
        char ch;
        for (int i = 0; i < txt.length(); i++) {
            ch = txt.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                pila.apilar(ch);
            } else if (ch == ']') {
                if (pila.esVacia() || pila.tope() != '[') {
                    return false;
                } else {
                    pila.desapilar();
                }
            } else if (ch == '}') {
                if (pila.esVacia() || pila.tope() != '{') {
                    return false;
                } else {
                    pila.desapilar();
                }
            } else if (ch == ')') {
                if (pila.esVacia() || pila.tope() != '(') {
                    return false;
                } else {
                    pila.desapilar();
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "({}{}{[tutu nadie mas que tutu]}{}{})";

        PilaGenerica<Character> pila = new PilaGenerica();
        
        System.out.println("Es balanceado? " + esBalanceado(pila, s));
    }

}
