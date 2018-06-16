package PStA;

/*

Das Damenproblem

Beim N-Damen-Problem im Schach sollen N Damen so aufgestellt werden, dass keine eine andere Damen schlagen kann. Ein Schachfeld besteht entsprechend aus einer N x N Matrix und eine Dame kann sich in jede Richtung, also vertikal, horizontal und diagonal bewegen. Jede Dame soll dabei in einer Reihe stehen und sie dürfen dabei keine diagonale Linie bilden. Die Eingabe gibt jeweils die Position der Dame in der entsprechenden Reihe ein. Im Beispiel steht die Dame in der 1. Reihe auf dem 3. Quadrat von links, die der 2. Reihe auf dem 5. Quadrat von links, usw. Kann keine Dame eine andere schlagen, so soll true ausgegeben werden, andernfalls false.

Beispiele:

Eingabe:

3 5 2 8 1 7 4 6
Ausgabe:

true

 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem10 {

    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e){
            return false;
        }
        return true;
    }

    private static boolean isAlive(String pos){

        String[] posA = pos.split("[ ]+");

        if(posA.length == 0) {
            return false;
        }

        int[] zahlen = new int[posA.length];

        //int[] [] schachfeld = new int[zahlen.length][zahlen.length];

        for(int i = 0; i < posA.length; i++) {
            if(!isInteger(posA[i])) {                                       // nach Integer überprüfen
                return false;
            }
            zahlen[i] = Integer.parseInt(posA[i]);                          // Array füllen
            zahlen[i]--;                                                    // Translation

        }

        for(int i = 0; i < zahlen.length; i++) {

            if(zahlen.length <= zahlen[i]){                                 // Dame außerhalb des Schachbretts?
                return false;
            }

            for(int j = i+1; j < zahlen.length ; j++) {                     // selbe Spalte, wenn Zahl doppelt
                if(zahlen[i] == zahlen[j]){
                    return false;
                }

                if(Math.abs(i-j) == Math.abs(zahlen[i] - zahlen[j])){  //auf diagonale testen |z(1) -z(2)| == |s(1) -s(2)|
                    return false;
                }
            }


        }

        return  true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pos = sc.nextLine();

        if(isAlive(pos)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
