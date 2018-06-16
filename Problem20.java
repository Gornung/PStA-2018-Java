package PStA;

import java.io.EOFException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem20 {
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
        } catch (Exception e) {

        }

        for (String a : liste) {
            System.out.println(passtKlammern(a));
        }

    }

    private static boolean passtKlammern(String s) {
        int offen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                ++offen;
            else if (s.charAt(i) == ')' && offen <= 0)
                return false;
            else if (s.charAt(i) == ')' && offen > 0)
                --offen;
        }

        if(offen == 0)
            return true;
        else
            return false;

    }
}

