import java.util.LinkedList;
import java.util.Scanner;

public class Problem38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> verbrauch = new LinkedList<>();

        try {
            while (true) {
                String s = sc.nextLine();
                if (s.equals(""))
                    break;
                verbrauch.add(s);
            }
        } catch (Exception e){

        }


        for (String s : verbrauch) {
            int i = Integer.parseInt(s);
            System.out.println(wochenAnzahl(i));
        }
    }

    public static int wochenAnzahl(int i) {
        return 10000/i;
    }
}