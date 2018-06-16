package PStA;

/*

Transponieren

Schreiben Sie ein Programm, welches Text Zeile für Zeile einliest. Betrachtet man nun die Wörter als Spalte, so kann man den Text transponieren, also die Wörter der Zeile i nun jeweils in der Spalte i ausgeben. Spalten in denen weniger Wörter wären als in anderen werden mit - aufgefüllt.

Ein Beispiel erklärt das Gewünschte.

Beispiel

Eingabe

Mary had a little lamb.
Peter paid a pretty penny.
Java sucks.
Ausgabe

Mary Peter Java
had paid sucks.
a a -
little pretty -
lamb. penny. -

 */

import java.util.*;

public class Problem35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> text = new LinkedList<>();
        int maxLaenge = 0;

        try {
            while (true) {
                String s = sc.nextLine();
                if (s.equals(""))
                    break;

                String[] sArray = s.split("[ ]+");
                if (sArray.length > maxLaenge)                                   // = Zeilen nach Transponierung = maxLaenge
                    maxLaenge = sArray.length;

                text.add(sArray);
            }
        } catch (Exception e){

        }

        LinkedList<String> textTransponiert = transponieren(text, maxLaenge);

        for (String s : textTransponiert) {
            System.out.println(s);
        }
    }

    private static LinkedList<String> transponieren(List<String[]> text, int zeilen) {
        LinkedList<String> textNeu = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < text.size(); j++) {
                String[] zeile = text.get(j);

                if (sb.length() > 0)
                    sb.append(" ");

                if (i < zeile.length) {
                    sb.append(text.get(j)[i]);
                } else {
                    sb.append("-");
                }

            }
            textNeu.add(sb.toString());
            sb.setLength(0);
        }

        return textNeu;
    }
}
