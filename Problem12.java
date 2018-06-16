package PStA;

import java.util.*;

public class Problem12 {

    private static int det(String[] s){
        int[][] matrix = new int[s.length][s.length];

        for(int i = 0; i < s.length; i++){
            String[] sSplit = s[i].split("[ ]+");
            for(int j = 0; j < sSplit.length; j++){
                matrix[i][j] = Integer.parseInt(sSplit[j]);
            }
        }

        if(matrix.length == 2){
            return matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        }
        if(matrix.length == 3){
            return matrix[0][0] * matrix[1][1] * matrix[2][2]
                    + matrix[0][1] * matrix[1][2] * matrix[2][0]
                    + matrix[0][2] * matrix[1][0] * matrix[2][1]
                    - matrix[2][0] * matrix[1][1] * matrix[0][2]
                    - matrix[2][1] * matrix[1][2] * matrix[0][0]
                    - matrix[2][2] * matrix[1][0] * matrix[0][1];

        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> liste = new LinkedList<>();
        try {
            while(true) {
                String s = sc.nextLine();
                if (s.equals("")){
                    break;
                }
                liste.add(s);
            }
        }
        catch(Exception e) {
        };

        String[] inputs = new String[liste.size()];
        for(int i = 0; i < liste.size(); i++){
            inputs[i] = liste.get(i);
        }
        System.out.println(det(inputs));
    }
}