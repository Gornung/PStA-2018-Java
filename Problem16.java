package PStA;

/*

Fibonacci

Schreiben Sie ein Programm, welches eine bestimmte Anzahl Fibonacci-Zahlen berechnet und ausgibt.

Beispiele

Eingabe:

2
4
6
Ausgabe:

0 1
0 1 1 2
0 1 1 2 3 5

 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> liste = new LinkedList<>();

        try {
            while (true) {
                String s = sc.nextLine();
                if (s.equals("")) {
                    break;
                }
                liste.add(s);
            }
        } catch (Exception x){

        }

        for (String zahl : liste) {
            int i = Integer.parseInt(zahl);
            fibonacci(i);
        }
    }

    private static void fibonacci(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++){
            System.out.print(a + " ");
            a = a + b;
            b = a - b;
        }
        System.out.println();
    }
}
