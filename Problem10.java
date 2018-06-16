package PStA;

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
