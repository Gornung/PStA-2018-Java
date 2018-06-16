package PStA;

/*

Buchstabendreieck

Für einen eingegebenen Buchstaben soll das Alphabet ab dem Buchstaben A bis zu dem eingegebenen Buchstaben ausgegeben werden. Die Anzahl der Buchstaben pro Zeile entspricht der Zeilennummer. Ist die Anzahl der verbleibenden Buchstaben kleiner als die nötigen Buchstaben pro Reihe wird mit * aufgefüllt.

Alle Buchstaben sind Großbuchstaben.

Beispiele:

Eingabe:

D
Ausgabe:

A
BC
D**

 */

import java.util.*;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char buchstabe = s.charAt(0);

        List<Character> alphabet = new LinkedList<>();
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        for (char c : chars)
            alphabet.add(c);

        int index = alphabet.indexOf(buchstabe);
        int zeile = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= index; i++){
            sb.append(chars[i]);
            if (sb.length() < zeile && i<index)
                continue;
            else
                zeile++;

            while( sb.length() <= zeile-2)
                sb.append("*");

            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }
}
