package PStA;

import java.util.*;

public class Problem35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> text = new LinkedList<>();
        int maxLaenge = 0;

        try {
            while (true) {
                String s = sc.nextLine();
                if (s.equals(""))
                    break;

                String[] sArray = s.split("[ ]+");
                if (sArray.length > maxLaenge)                                   // = Zeilen nach Transponierung = maxLaenge
                    maxLaenge = sArray.length;

                text.add(sArray);
            }
        } catch (Exception e){

        }

        LinkedList<String> textTransponiert = transponieren(text, maxLaenge);

        for (String s : textTransponiert) {
            System.out.println(s);
        }
    }

    private static LinkedList<String> transponieren(List<String[]> text, int zeilen) {
        LinkedList<String> textNeu = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < text.size(); j++) {
                String[] zeile = text.get(j);

                if (sb.length() > 0)
                    sb.append(" ");

                if (i < zeile.length) {
                    sb.append(text.get(j)[i]);
                } else {
                    sb.append("-");
                }

            }
            textNeu.add(sb.toString());
            sb.setLength(0);
        }

        return textNeu;
    }
}
