package PStA;
 /*

Grüß aus Paris

Schreiben Sie ein Programm, welches eine feste Anzahl an Namen einliest, und diese dann begrüßt.

Beispiele:

Ein Adressat Eingabe:

1
World
Ausgabe:

Hello, World!
Mehrere Adressaten Eingabe:

2
Hans
DAMPF
Ausgabe:

Hello, Hans!
Hello, DAMPF!

  */
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int length = Integer.parseInt(read.nextLine());
        String[] name = new String[length];
        for(int i = 0; i < length; i++) {
            name[i] = read.nextLine();
        }

        for(int i = 0; i < length; i++) {
            System.out.println("Hello, " + name[i] + "!");
        }
    }
}
