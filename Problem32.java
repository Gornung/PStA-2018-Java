package PStA;

/*

Pim-a, die zweite!

Schreiben Sie ein Programm, welches überprüft, ob zeilenweise eingegebene Zahlen auch wirkich prim sind.

Beispiele

Eingabe

2
5
7
9
10
12
13
Ausgabe

true
true
true
false
false
false
true

 */
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> liste = new LinkedList<>();

        try {
            while (true) {
                String s = sc.nextLine();
                if (s.equals(""))
                    break;
                liste.add(Integer.parseInt(s));
            }
        } catch (Exception e){

        }

        for (int a : liste){
            System.out.println(isPrim(a));
        }
    }

    private static boolean isPrim(int zahl) {
        if(zahl == 1 || zahl == 0)
            return false;

        for (int i = 2; i < zahl; i++) {
            if (zahl % i == 0) {
                return false;
            }
        }
        return true;
    }

}
