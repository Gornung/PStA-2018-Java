package PStA;

import java.io.EOFException;
import java.util.*;

public class Problem31 {
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
        } catch (Exception e ){

        }

        for (String s : liste) {
            String[] werte = s.split(" ");

            int teiler1 = Integer.parseInt(werte[0]);
            int teiler2 = Integer.parseInt(werte[1]);
            int teiler3 = Integer.parseInt(werte[2]);

            int zähler = 0;

            if (ggT(teiler1, teiler2) > 1)
                zähler++;
            if (ggT(teiler1, teiler3) > 1)
                zähler++;
            if (ggT(teiler2, teiler3) > 1)
                zähler++;

            System.out.println(zähler);
        }


    }

    private static int ggT(int teiler1, int teiler2) {

        if (teiler1 == 0 || teiler2 == 0)
            return teiler1 + teiler2;

        return ggT(teiler2, teiler1 % teiler2);
    }
}
