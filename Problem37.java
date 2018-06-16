package PStA;

/*

Zensiert

Sie kennen bestimmt das Mathespiel aus der Grundschule, 1-2-hop: Ein Spieler beginnt mit 1, und nachfolgende sagen entweder die nächstgrößere Zahl, oder aber hop, wenn diese durch 3 teilbar ist oder eine 3 enthält. Zum Beispiel: 1-2-hop-4-5-hop-7-8-hop-...

Schreiben Sie ein Programm, den Teiler sowie das Spielende vorgibt, und die entsprechende Folge zeilenweise ausgibt. Der Teiler ist immer größer als 0 und kleiner als 10.

Beispiel

Eingabe

3 10
Ausgabe

1
2
hop
4
5
hop
7
8
hop
10

 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("[ ]+");
        int teiler = Integer.parseInt(s[0]);
        int endzahl = Integer.parseInt(s[1]);

        for (int i = 1; i <= endzahl; i++) {
            if (istTeilbar(i, teiler) || istEnthalten(i, teiler)) {
                System.out.println("hop");
            } else {
                System.out.println(i);
            }
        }
    }

    private static boolean istTeilbar(int zahl, int teiler) {
        double ergebnis = (double) zahl / teiler;
        String[] test = Double.toString(ergebnis).split("\\.");
        if (test[1].equals("0"))
            return true;
        else
            return false;
    }

    private static boolean istEnthalten(int zahl, int teiler){
        String s = "" + zahl;
        char c = (char) (teiler + '0');

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return true;
            }
        }

        return false;
    }
}
