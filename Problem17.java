package PStA;

import java.util.*;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> text = new LinkedList<>();
        TreeMap<Integer, Integer> anzahl = new TreeMap<>();         //Key = Wortlänge; Val = anzahl TreeMap -> geordnet

        try {
            while (true) {
                String s = sc.nextLine().replaceAll("[^a-zA-ZäöüÄÖÜ ]", "");
                if (s.equals(""))
                    break;
                text.add(s);
            }
        } catch (Exception e){

        }

        for (String zeile : text) {
            String[] worte = zeile.split("[ ]+");
            for (String wort : worte) {
                int key = wort.length();
                if (key > 9)
                    key = 9;

                int val = anzahl.getOrDefault(key, 0);
                anzahl.put(key, ++val);
            }
        }

        //muss in Set... für getter
        for (Map.Entry<Integer, Integer> e : anzahl.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}

//   Character classes
//   [abc]           a, b, or c (simple class)
//   [^abc]          Any character except a, b, or c (negation)
//   [a-zA-Z]        a through z or A through Z, inclusive (range)
//   [a-d[m-p]]      a through d, or m through p: [a-dm-p] (union)
//   [a-z&&[def]]    d, e, or f (intersection)
//   [a-z&&[^bc]]    a through z, except for b and c: [ad-z] (subtraction)
//   [a-z&&[^m-p]]   a through z, and not m through p: [a-lq-z](subtraction)
