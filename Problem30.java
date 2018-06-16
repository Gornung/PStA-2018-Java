package PStA;

/*

Caesar's Chiffre

Schreiben Sie ein Programm, das eingegebenen Text in Caesars Chiffre übersetzt. Dabei werden die Buchstaben a bis z um eine feste Anzahl "verschoben". Ist der Schlüssel z.B. 2, so wird aus jedem a ein c, jedem b ein d usw. und zum Ende aus einem z wieder ein b (also zyklisch im Alphabet). Zum Entschlüsseln wird entsprechend ein negativer Wert angegeben, also z.B. -2 um aus g ein e zu machen. Beachten Sie die Groß- und Kleinschreibung.

Die erste Zeile gibt eine Ganzzahl an, um wie viele Zeichen der Text der nachfolgenden Zeilen entsprechend verschoben werden soll.

Beispiele:

Eingabe

0
Peter Pan ist ein Held.
Ausgabe

Peter Pan ist ein Held.
Eingabe

2
Peter Pan ist ein Held.
Ausgabe

Rgvgt Rcp kuv gkp Jgnf.
Eingabe

-2
Jcpu Fcorh pkejv yktmnkej.
Ausgabe

Hans Dampf nicht wirklich.

 */

import java.util.*;

public class Problem30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int schluessel = Integer.parseInt(sc.nextLine());
        String text = sc.nextLine();

        System.out.println(codieren(text, schluessel));
    }

    private static String codieren(String text, int key) {

        char[] alphabetKlein = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] alphabetGross = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        List<Character> listeKlein = new ArrayList<>();
        List<Character> listeGross = new ArrayList<>();

        for (char c : alphabetKlein) {
            listeKlein.add(c);
        }
        for (char c : alphabetGross) {
            listeGross.add(c);
        }

        int schluessel = (((key % 26) + 26) % 26);          // fix wegen negativen rückgabewert ...

        char[] buchstaben = text.toCharArray();
        for (int j = 0; j < buchstaben.length; j++) {
            if (Character.isLetter(buchstaben[j]) && Character.isUpperCase(buchstaben[j])) {
                int index = listeGross.indexOf(buchstaben[j]);
                buchstaben[j] = alphabetGross[(index + schluessel) % 26];
            } else if (Character.isLetter(buchstaben[j]) && Character.isLowerCase(buchstaben[j])) {
                int index = listeKlein.indexOf(buchstaben[j]);
                buchstaben[j] = alphabetKlein[(index + schluessel) % 26];
            }
        }

        return new String(buchstaben);
    }


}
