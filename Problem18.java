package PStA;

/*

Fast Römisch

Schreiben Sie ein Programm, dass eine Buchstabenkombination durch Aufsummierung der Buchstabenwerte in eine Zahl umwandelt. Dabei ist A 1, B 10, C 100, usw. bis G 1000000 wert.

Es werden nun zeilenweise Kombination beliebiger Länge der Buchstaben A-G eingegeben, für die jeweils die Dezimalzahl ausgegeben werden soll.

Beispiele:

Eingabe:

CCBBBBA
ABC
Ausgabe:

241
111

 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem18 {
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
        } catch (Exception e){

        }

        for(String a : liste){
            System.out.println(berechnen(a));
        }


    }

    private static int berechnen(String s) {
        int ergebnis = 0;

        int[] werte = {1, 10, 100, 1000, 10000, 100000, 1000000};
        char[] buchstaben = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int[] zaehler = new int[7];

        for (int i = 0; i < s.length(); i++) {
            for (int o = 0; o < buchstaben.length; o++) {
                if(s.charAt(i) == buchstaben[o])
                    zaehler[o]++;
            }
        }

        for (int j = 0; j < buchstaben.length; j++) {
            ergebnis += zaehler[j] * werte[j];
        }

        return ergebnis;
    }
}