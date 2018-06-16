package PStA;

/*

Duplikatentferner

Schreiben Sie ein Programm, in jeder Zeile jeweils Duplikate entfernt. Die ursprüngliche Reihenfolge der Elemente soll dabei erhalten werden, d.h. es werden nur nachfolgende Duplikate entfernt.

Beispiele:

Eingabe:

2 2 2 3 3 3 4
4 1 5 2 3 5 2
Ausgabe:

2 3 4
4 1 5 2 3

 */
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem15 {

    private static void removeDuplicate(List<String> liste){

        LinkedList<Character> merke = new LinkedList<>();

        for(int i = 0; i < liste.size(); i++){

            String s = liste.get(i);
            String ersetzt = s.replaceAll("[ ]+", "");

            for(int j = 0; j < ersetzt.length(); j++){
                if(!merke.contains(ersetzt.charAt(j))){
                    merke.add(ersetzt.charAt(j));
                }
            }

            String merkeS = merke.toString();
            for (int z = 0; z < merke.size(); z++){
                System.out.print(merke.get(z) + " ");
            }
            merke.clear();
            System.out.println();
        }
    }

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
        } catch (Exception x) {

        }

        removeDuplicate(liste);
    }
}
