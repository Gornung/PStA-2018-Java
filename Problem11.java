package PStA;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem11 {

    private static void inBruch(String s) {
        String[] sArray = s.split("[,\\.]");
        if (sArray.length == 1) {
            System.out.println(sArray[0]);
            return;
        }
        int zaehler = Integer.parseInt(sArray[1]);
        int nenner = (int) Math.pow(10, sArray[1].length());
        int[] bruch = {zaehler, nenner};
        bruch = kuerzen(bruch);

        if (sArray[1].equals("0")) {
            System.out.println(sArray[0]);
        } else if (!sArray[0].equals("0")) {
            System.out.println(sArray[0] + " " + bruch[0] + "/" + bruch[1]);
        } else {
            System.out.println(bruch[0] + "/" + bruch[1]);
        }

    }

    private static int[] kuerzen(int[] bruch) {
        int zaehler = bruch[0];
        int nenner = bruch[1];
        while (zaehler % 2 == 0 && nenner % 2 == 0) {
            zaehler = zaehler / 2;
            nenner = nenner / 2;
        }
        while (zaehler % 5 == 0 && nenner % 5 == 0) {
            zaehler = zaehler / 5;
            nenner = nenner / 5;
        }
        return new int[]{zaehler, nenner};
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> queue = new LinkedList<>();
        try{
        while (true) {
            String input = sc.nextLine();
            if (input.equals(""))
                break;
            queue.add(input);
        }
        }
        catch(Exception e) {
        };

        for (String aQueue : queue) {
            inBruch(aQueue);
        }
    }
}
