package PStA;

/*

Wochenzähler

Eine Stadt im Death Valley hat einen Wassertank, gefüllt mit 10.000 Liter Wasser. Schreiben Sie ein Programm welches zweilenweise den wöchentlichen Verbrauch einliest, und damit die Anzahl der Wochen berechnet die das Wasser ausreicht, wenn es nicht regnet.

Sollte die Wassermenge nicht mehr für eine komplette Woche reichen, wird diese auch nicht mitgezählt.

Beispiele:

Eingabe

1750
1000
Ausgabe

5
10

 */

import java.util.LinkedList;
import java.util.Scanner;

public class Problem38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> verbrauch = new LinkedList<>();

        try {
            while (true) {
                String s = sc.nextLine();
                if (s.equals(""))
                    break;
                verbrauch.add(s);
            }
        } catch (Exception e){

        }


        for (String s : verbrauch) {
            int i = Integer.parseInt(s);
            System.out.println(wochenAnzahl(i));
        }
    }

    public static int wochenAnzahl(int i) {
        return 10000/i;
    }
}