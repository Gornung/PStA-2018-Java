package PStA;

import java.util.*;

public class Problem30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int schluessel = Integer.parseInt(sc.nextLine());
        String text = sc.nextLine();

        System.out.println(codieren(text, schluessel));
    }

    private static String codieren(String text, int key) {

        char[] alphabetKlein = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] alphabetGross = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        List<Character> listeKlein = new ArrayList<>();
        List<Character> listeGross = new ArrayList<>();

        for (char c : alphabetKlein) {
            listeKlein.add(c);
        }
        for (char c : alphabetGross) {
            listeGross.add(c);
        }

        int schluessel = (((key % 26) + 26) % 26);          // fix wegen negativen rückgabewert ...

        char[] buchstaben = text.toCharArray();
        for (int j = 0; j < buchstaben.length; j++) {
            if (Character.isLetter(buchstaben[j]) && Character.isUpperCase(buchstaben[j])) {
                int index = listeGross.indexOf(buchstaben[j]);
                buchstaben[j] = alphabetGross[(index + schluessel) % 26];
            } else if (Character.isLetter(buchstaben[j]) && Character.isLowerCase(buchstaben[j])) {
                int index = listeKlein.indexOf(buchstaben[j]);
                buchstaben[j] = alphabetKlein[(index + schluessel) % 26];
            }
        }

        String verschlüsselt = new String(buchstaben);
        return verschlüsselt;
    }


}
