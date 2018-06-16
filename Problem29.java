package PStA;

/*

Vollkommene Zahlen

Schreiben Sie ein Programm, welches zeilenweise Ganzzahlen einliest, und für jede true ausgibt, wenn sie eine vollkommene Zahl ist, oder false, wenn nicht. Hinweise: - Es kommen Zahlen größer als 2147483647 aber kleiner als 9223372036854775807 vor. - Wenn sie die Herausforderung suchen, wählen Sie nicht die allerleichteste (und allerschnellste) Lösung.

Beispiele

Eingabe

6
28
496
1000
8128
10000
Ausgabe

true
true
true
false
true
false

 */

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> vollkommen= Arrays.asList("6", "28", "496", "8128", "33550336", "8589869056", "137438691328", "2305843008139952128", "2658455991569831744654692615953842176");
        ArrayList<String> liste= new ArrayList<>();

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
            if(vollkommen.contains(a))
                System.out.println("true");
            else{
                System.out.println("false");
            }
        }
    }
}
