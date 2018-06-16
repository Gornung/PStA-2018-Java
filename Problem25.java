package PStA;

/*

Nummern umdrehen

Schreiben Sie ein Programm, welches zeilenweise Ganzzahlen einliest und rückwärts wieder ausgibt, also die Dezimalstellen in umgekehrter Reihenfolge.

Beispiel:

Eingabe

8954
Ausgabe

4598

 */

import java.util.*;

public class Problem25 {

    private static class CharElement {
        char value;
        CharElement next;

        CharElement(char c, CharElement v) {
            next = v;
            value = c;
        }
    }

    private static CharElement top;

    private static void push(char c) {
        top = new CharElement(c, top);
    }

    private static char pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        char v = top.value;
        top = top.next;
        return v;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> liste = new LinkedList<>();


        try {
            while (true) {

                String s = sc.nextLine();

                if (s.equals(""))
                    break;

                liste.add(s);
            }

        } catch (Exception e) {

        };

        for (String s : liste) {
            char[] c = s.toCharArray();

            for (char a : c) {
                push(a);
            }
            for (int i = 0; i < c.length; i++) {
                c[i] = pop();
            }

            String result = new String(c);
            System.out.println(c);
        }
    }
}
