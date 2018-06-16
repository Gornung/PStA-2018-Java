package PStA;

/*

Wie die Zeit vergeht

Es werden Zeilen mit je zwei Zeiten einer 24-Uhr, im Format hh:mm:ss eingegeben. Geben Sie aus, wie viele Stunden, Minuten und Sekunden dazwischen liegen, ebenfalls im Format hh:mm:ss

Beispiele:

Eingabe:

10:03:43 15:00:58
13:00:00 14:00:00
00:00:00 12:05:00
12:05:00 00:00:00
Ausgabe:

04:57:15
01:00:00
12:05:00
11:55:00

 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> zeiten = new LinkedList<>();

        try {
            while (true) {
                String s = sc.nextLine();
                if (s.equals(""))
                    break;
                zeiten.add(s);
            }
        } catch (Exception e){

        }

        for (String s : zeiten) {                                       //absolut hässlich
            String[] startEnde = s.split(" ");
            String[] start = startEnde[0].split(":");
            String[] ende = startEnde[1].split(":");

            int startS = Integer.parseInt(start[2]);
            int endeS = Integer.parseInt(ende[2]);
            int[] ergebnisS = differenzS(startS, endeS);

            int startM = Integer.parseInt(start[1]);
            int endeM = Integer.parseInt(ende[1]);
            int[] ergebnisM = differenzM(startM, endeM, ergebnisS[1]);

            int startH = Integer.parseInt(start[0]);
            int endeH = Integer.parseInt(ende[0]);
            int[] ergebnisH = differenzH(startH, endeH, ergebnisM[1]);

            int[] ergebnis = {ergebnisH[0], ergebnisM[0], ergebnisS[0]};
            boolean[] sindZwei = new boolean[3];

            for (int i = 0; i < ergebnis.length; i++){                          // überprüfe auf anzahl zahlen
                int length = String.valueOf(ergebnis[i]).length();
                if (length == 2)
                    sindZwei[i] = true;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < ergebnis.length; i++){
                if (!sindZwei[i])
                    sb.append("0");

                sb.append(ergebnis[i]);

                if (i < 2)
                    sb.append(":");
            }
            System.out.println(sb.toString());
        }
    }

    private static int[] differenzS(int start, int ende) {
        int diff = ende - start;
        int warNeg = 0;                                   // 0 = false; 1 = true;
        if (diff < 0) {
            warNeg = 1;
            diff = 60 + diff;                             // + oder - ? weil negativ überpruefen
        }

        return new int[]{diff, warNeg};
    }

    private static int[] differenzM(int start, int ende, int warNegS) {
        int diff = ende - start;
        int warNeg = 0;                                   // 0 = false; 1 = true;
        if (warNegS == 1) {
            diff--;
        }
        if (diff < 0) {
            warNeg = 1;
            diff = 60 + diff;                             // + oder - ? weil negativ überpruefen
        }
        return new int[]{diff, warNeg};
    }

    private static int[] differenzH(int start, int ende, int warNegM) {
        int diff = ende - start;
        int warNeg = 0;                                   // 0 = false; 1 = true;
        if (warNegM == 1) {
            diff--;
        }
        if (diff < 0) {
            warNeg = 1;
            diff = 24 + diff;                             // + oder - ? weil negativ überpruefen
        }
        return new int[]{diff, warNeg};
    }
}
