package PStA;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem24 {
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
        } catch (Exception e){

        }

        for (String a : liste) {
            System.out.println(berechne(a));
        }
    }

    private static int berechne(String s) {
        String[] array = s.split("[ ]+");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[2]);
        return b - a;
    }
}
