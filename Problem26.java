package PStA;

/*

Zahlensysteme

Schreiben Sie ein Programm, zeilenweise Zahlen von einem Zahlensystem in ein anderes umrechnet. Jede Zeile besteht aus drei Werten: die Zahl, das Quellzahlensystem und das Zielzahlensystem. Es sollen die Systeme zur Basis 2 (binär) bis einschließlich 16 (hexadezimal) unterstützt werden; verwenden Sie dazu die Zahlen 0...9 sowie die Buchstaben a...f.

Beispiel

Eingabe

beef 16 10
123 10 16
10 10 8
Ausgabe

48879
7b
12

 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem26 {
    static char[] zSystem = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> liste = new LinkedList<>();

        while (true) {
            String s = sc.nextLine();
            if (s.equals(""))
                break;
            liste.add(s);
        }

        for (String a : liste) {

        }
    }
}
