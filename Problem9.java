package PStA;

/*

Gemeinsame Elemente in Arrays

Schreiben Sie ein Programm, welches abzählt wie viele Elemente in beiden Zeilen zu finden sind.

Beispiele:

Eingabe:

1 4 Hans Peter 3
2 Peter 1
Ausgabe:

2
Da "Peter" und 1 in beiden Zeilen zu finden sind.

Eingabe:

Peter, der schreckliche.
Peter Pan
Ausgabe:

0
Da Peter, nicht gleich Peter ist.

 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Problem9 {

    private static int countEquals(String a, String b){

        if(a.equals("") || b.equals("")){
            return 0;
        }

        String[] splitA = a.split("[ ]+");
        String[] splitB = b.split("[ ]+");

        int counter = 0;
        Set<String> set = new HashSet<>();


        for (String aSplitA : splitA) {

            for (String aSplitB : splitB) {
                if (aSplitA.equals(aSplitB)) {
                    if (!set.contains(aSplitB)) {
                        set.add(aSplitB);
                        counter++;
                    }
                }
            }

        }
        return counter;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(countEquals(a,b));
    }
}
