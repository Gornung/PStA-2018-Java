package PStA;

/*

Buchstabensuppe

Eingelesen werden Zeilen. Die erste besteht aus einem Satz bzw. einer Zeichenkette. Die zweite gibt an welche Buchstaben aus dem 1. String man zählen möchte. Es wird unabhängig von Groß- und Kleinschreibung gezählt, Sonderzeichen (inklusive Leerzeichen) können ebenfalls abgezählt werden.

Beispiele:

Eingabe:

All is quiet now, but wait!
QAET
Ausgabe:

q 1
a 2
e 1
t 3

 */

import java.util.Scanner;

//WUHUUU first Try

public class Problem7 {

    private static int countTokens(String s, char c){

        int counter = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c) {
                counter++;
            }
        }

        return counter;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String s2 = s.toLowerCase();

        String token = sc.nextLine();
        String token2 = token.toLowerCase();

        int[] helper = new int[token.length()];

        for(int i = 0; i < token2.length(); i++) {
            helper[i] = countTokens(s2, token2.charAt(i));

            System.out.print(token2.charAt(i) + " " + helper[i]);
            System.out.println();
        }
    }
}