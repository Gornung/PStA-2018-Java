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

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem34_FAIL {
//
//    public class Zeit {                                 //weil Objekt als return testen, statt Array
//        int diff;
//        boolean warNeg;
//
//        Zeit(int diff, boolean warNeg) {
//            this.diff = diff;
//            this.warNeg = warNeg;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<String> zeiten = new LinkedList<>();
//        while (true){
//            String s = sc.nextLine();
//            if (s.equals(""))
//                break;
//            zeiten.add(s);
//        }
//
//        for (String s : zeiten){                                //schlecht geschrieben ..... + prints
//            String[] startEnde = s.split(" ");
//            String[] start = startEnde[0].split(":");
//            String[] ende = startEnde[1].split(":");
//            int startS = Integer.parseInt(start[2]);
//            int endeS = Integer.parseInt(ende[2]);
//            Zeit ergebnisS = differenzS(startS, endeS);
//            int startM = Integer.parseInt(start[1]);
//            int endeM = Integer.parseInt(ende[1]);
//            Zeit ergebnisM = differenzM(startM, endeM, ergebnisS);
//            int startH = Integer.parseInt(start[0]);
//            int endeH = Integer.parseInt(ende[0]);
//            Zeit ergebnisH = differenzH(startH, endeH, ergebnisM);
//            String ergebnis = "" + ergebnisH.diff + ":" + "" + ergebnisM.diff + ":" + "" + ergebnisS;
//            System.out.println(ergebnis);
//        }
//    }
//
//    private static Zeit differenzS(int start, int ende) {
//        int diff = ende - start;
//        boolean warNeg = false;
//        if (diff < 0) {
//            warNeg = true;
//            diff = 60+diff;                             // + oder - ? weil negativ überpruefen
//        }
//        return new Zeit(diff, warNeg);
//    }
//
//    private static Zeit differenzM(int start, int ende, Zeit sekunden) {
//        int diff = ende - start;
//        boolean warNeg = false;
//        if(sekunden.warNeg) {
//            diff--;
//        }
//        if (diff < 0) {
//            warNeg = true;
//            diff = 60+diff;                             // + oder - ? weil negativ überpruefen
//        }
//        return new Zeit(diff, warNeg);
//    }
//
//    private static Zeit differenzH(int start, int ende, Zeit minuten) {
//        int diff = ende - start;
//        boolean warNeg = false;
//        if(minuten.warNeg) {
//            diff--;
//        }
//        if (diff < 0) {
//            warNeg = true;
//            diff = 24+diff;                             // + oder - ? weil negativ überpruefen
//        }
//        return new Zeit(diff, warNeg);
//    }
}
