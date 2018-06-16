package PStA;

/*

Diamantendrucker

Dieses Programm soll einen Diamanten, bestehend aus Sternen (*) ausgeben. Die Eingabe ist eine positive Zahl größer als zwei, welche die Anzahl der Sternsymbole auf der Mittellinie angibt. Die Reihen darüber und darunter sollen jeweils immer zwei Sterne weniger besitzen als die Mittellinie.

Beispiel:

Eingabe:

5
Ausgabe:

  *
 ***
*****
 ***
  *
Eingabe:

4
Ausgabe:

 **
****
 **

 */

import java.util.Scanner;

public class Problem13 {

    private static void diamond(int sterne) {

        if(sterne == 0)
            return;

        int ebene = 0;
        int mitte = sterne;

        while (mitte != 1 && mitte != 2) {      //sobald 1 für ungerade oder 2 für gerade erreicht raus
            mitte = mitte - 2;
            ebene++;
        }

        //print top
        for (int i = ebene; i > 0; i--) {
            for (int j = 0; i > j; j++) {         //rücke je nach Ebenenanzahl ein
                System.out.print(" ");
            }
            for (int t = 0; t < mitte; t++) {     //drucke aus
                System.out.print("*");
            }
            mitte++;
            mitte++;
            System.out.println();
        }

        //print mid
        for (int i = 0; i < sterne; i++) {
            System.out.print("*");
        }

        //print bot
        for (int i = 0; i < ebene; i++) {
            System.out.println();
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int t = 1; t < mitte-1; t++){
                System.out.print("*");
            }
            mitte--;
            mitte--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sterne = Integer.parseInt(sc.nextLine());
        diamond(sterne);
    }
}
