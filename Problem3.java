package PStA;

import java.util.Scanner;

/*

Grüß aus Paris

Schreiben Sie ein Programm, welches eine feste Anzahl an Namen einliest, und diese dann begrüßt.

Beispiel:

1
World
Hello, World!

 */

public class Problem3 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);
        int length = Integer.parseInt(read.nextLine());

        for(int i = 0; i < length; i++){
            String name = read.nextLine();
            System.out.println("Hello, " + name + "!");
        }

    }

}


