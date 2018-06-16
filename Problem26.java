package PStA;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem26 {
    static char[] zSystem = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> liste = new LinkedList<>();

        while (true) {
            String s = sc.nextLine();
            if (s.equals(""))
                break;
            liste.add(s);
        }

        for (String a : liste) {

        }
    }
}
