import java.io.EOFException;
import java.util.*;

public class Problem36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> zahlen = new LinkedList<>();

        try {
            while (sc.hasNextLine()) {
                zahlen.add(Integer.parseInt(sc.nextLine()));
            }
        } catch (Exception e) {

        }

        int[] intArray = new int[zahlen.size()];

        for(int i = 0; i < zahlen.size(); i++){
            intArray[i] = zahlen.get(i);
        }

        Arrays.sort(intArray);

        System.out.println(intArray[intArray.length-2]);
        System.out.println(intArray[intArray.length-1]);
    }
}