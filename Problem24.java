package PStA;

/*

Welche Zahl ist die nächste?

Bei einer eingegebenen Zahlenfolge aus 3 Zahlen soll das Program die nächste folgende Zahl berechnen und diese ausgeben. Es handelt sich dabei immer um Ganzzahlen, es gibt genau ein Verfahren um die gesuchte Zahl zu berechnen.

Beispiele

Eingabe

3 6 9
2 2 4
1 1 2
4 2 6
1 2 3
10 10 0
4 6 8
5 7 9
0 10 0
Ausgabe

6
2
1
2
2
-10
4
4
0

 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem24 {
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

        for (String a : liste) {
            System.out.println(berechne(a));
        }
    }

    private static int berechne(String s) {
        String[] array = s.split("[ ]+");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[2]);
        return b - a;
    }
}
