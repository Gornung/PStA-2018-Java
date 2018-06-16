package PStA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Problem9 {

    private static int countEquals(String a, String b){

        if(a.equals("") || b.equals("")){
            return 0;
        }

        String[] splitA = a.split("[ ]+");
        String[] splitB = b.split("[ ]+");

        int counter = 0;
        Set<String> set = new HashSet<>();


        for (String aSplitA : splitA) {

            for (String aSplitB : splitB) {
                if (aSplitA.equals(aSplitB)) {
                    if (!set.contains(aSplitB)) {
                        set.add(aSplitB);
                        counter++;
                    }
                }
            }

        }
        return counter;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(countEquals(a,b));
    }
}
