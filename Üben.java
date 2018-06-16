package PStA;

import java.util.*;

public class Üben {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new LinkedList<>();

        while (sc.hasNextLine()) {
            strings.addAll(Arrays.asList(sc.nextLine().replaceAll("[^A-Za-z0-9 ]", "").split(" ")));
        }

        Map<Integer, Integer> counter = new TreeMap<>();

        for (String s : strings) {
            int key = s.length() > 8 ? 9 : s.length();
            int value = counter.getOrDefault(key, 0);
            counter.put(key, ++value);


            for (Map.Entry<Integer, Integer> e : counter.entrySet()) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
    }
}
