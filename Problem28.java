package PStA;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> worte  = new LinkedList<>();

        try {
            while (true) {
                String s = sc.nextLine();
                if (s.equals(""))
                    break;
                worte.add(s);
            }
        } catch (Exception e){

        }

        for (String s : worte){
            printTop(s);
            printBot(s);
        }

    }

    private static void printTop(String wort){
        int leerzeichen = wort.length() - 1 ;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < wort.length(); i++){
            for (int j = 0; j < leerzeichen;j++){      //setze leerzeichen
                sb.append(" ");
            }
            leerzeichen--;
            for (int j = 0; j <= i; j++){
                sb.append(wort.charAt(j));
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }

    private static void printBot(String wort){
        int leerzeichen = wort.length() - 1 ;
        StringBuilder sb = new StringBuilder();

        for (int i = wort.length()-1; i >= 0; i--){
            for (int j = wort.length()-i; j < wort.length(); j++) {
                sb.append(wort.charAt(j));
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }
}
