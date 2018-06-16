package PStA;

import java.util.Scanner;

//WUHUUU first Try

public class Problem7 {

    private static int countTokens(String s, char c){

        int counter = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c) {
                counter++;
            }
        }

        return counter;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String s2 = s.toLowerCase();

        String token = sc.nextLine();
        String token2 = token.toLowerCase();

        int[] helper = new int[token.length()];

        for(int i = 0; i < token2.length(); i++) {
            helper[i] = countTokens(s2, token2.charAt(i));

            System.out.print(token2.charAt(i) + " " + helper[i]);
            System.out.println();
        }
    }
}