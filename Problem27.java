package PStA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ints = new ArrayList<>();

        try {
            while (true) {
                String s = sc.nextLine();
                if (s.equals(""))
                    break;
                int i = Integer.parseInt(s);
                ints.add(i);
            }
        } catch (Exception e){

        }

        int[] array = new int[ints.size()];

        for (int i = 0; i < ints.size(); i++) {
            array[i] = ints.get(i);
        }

        Arrays.sort(array);

        for (int i = array.length-1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
