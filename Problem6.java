package PStA;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem6 {

    static long binaryToDecimal(String s){
        String s2 = "0";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                s2 = s.substring(i, s.length());
                break;
            }
        }
        long sum = 0L;
        for(int i = 0; i < s2.length(); i++) {
            if(s2.charAt(s2.length()-1-i) == '1') {
                long zsum = (long) (Math.pow(2,i));
                sum += zsum;
            }
        }
        return sum;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> liste = new LinkedList<>();
        try {
            while(true) {
                String binary = sc.nextLine();
                if (binary.equals("")){
                    break;
                }
                liste.add(binary);
            }
        }
        catch(Exception e) {
        };


        for (String aListe : liste) {
                System.out.println(binaryToDecimal(aListe));
        }
    }
}
