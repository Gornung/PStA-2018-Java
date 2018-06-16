package PStA;

import java.util.Arrays;
import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("[ ]+");
        int teiler = Integer.parseInt(s[0]);
        int endzahl = Integer.parseInt(s[1]);

        for (int i = 1; i <= endzahl; i++) {
            if (istTeilbar(i, teiler) || istEnthalten(i, teiler)) {
                System.out.println("hop");
            } else {
                System.out.println(i);
            }
        }
    }

    private static boolean istTeilbar(int zahl, int teiler) {
        double ergebnis = (double) zahl / teiler;
        String[] test = Double.toString(ergebnis).split("\\.");
        if (test[1].equals("0"))
            return true;
        else
            return false;
    }

    private static boolean istEnthalten(int zahl, int teiler){
        String s = "" + zahl;
        char c = (char) (teiler + '0');

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return true;
            }
        }

        return false;
    }
}
