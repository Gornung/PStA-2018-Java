package PStA;

/*

Binary Check

Schreiben Sie ein Programm, das überprüft, ob zeilenweise eingegebene Binärzahlen wirklich dem Binärformat entsprechen. Führende Nullen, also z.B. 0101 sind nicht erlaubt.

Beispiele:

Eingabe:

11001
9876
Ausgabe:

true
false

 */
import java.io.EOFException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem5 {

    private static boolean isBinary(String s) {

        if (s.length() == 1 && s.charAt(0) == '0') {
            return true;
        }

        if (s.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '0') {
                continue;
            } else if (s.charAt(i) == '1') {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> liste = new LinkedList<>();

        try {
            while(true) {

                String s = sc.nextLine();

                if (s.equals(""))
                    break;

                liste.add(s);
            }

        }
        catch(Exception e) {

        };



        for (String aListe : liste) {


            if (isBinary(aListe))
                System.out.println("true");
            else
                System.out.println("false");
        }

    }
}