package PStA;

/*

Buchstabieren

Schreiben Sie ein Programm, das Zeilen mit jeweils zwei Wörtern einliest, die dann verglichen werden sollen. Geben Sie jeweils aus, ob diese gleich sind (richtig) oder sich in höchstens einem Buchstaben unterscheiden (ok), ansonsten falsch.

Beispiele

Eingabe

Sample Simple
Sample simple
Sample Sample
Haus Hans
Hauswein Hanswurscht
wein ein
Ausgabe:

ok
ok
richtig
ok
falsch
ok

 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//noch nicht gelöst wegen mitte aber idee mit counter

public class Problem33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> liste = new LinkedList<>();

        while(true){
            String s = sc.nextLine();
            if(s.equals(""))
                break;
            liste.add(s);
        }


    }

    private static int fehlerAnzahl(String wort1, String wort2){
        int counter = 0;
        if(wort1.equals(wort2))
            return 0;

        int diff = Math.abs(wort1.length() - wort2.length());

        if(diff >= 2)
            return 2;


        return 1;
    }
}
// Simpel