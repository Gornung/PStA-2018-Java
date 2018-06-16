package PStA;

/*

Störe meine Kreise nicht

Schreiben Sie ein Programm, das testet ob sich zwei Kreise überschneiden. Als Input dienen die Koordinaten der beiden Kreise sowie ihr Radius. Anschließend soll ausgegeben werden, ob sich die beiden Kreise schneiden, nicht schneiden, oder berühren. Alle Eingaben sind Ganzzahlen, jede Zeile beschreibt einen Kreis als X und Y Koordinate sowie Radius. Bedenken Sie, dass ein Kreis auch komplett in einem anderen eingeschlossen sein kann, und dass Koordinaten negativ sein können.

Beispiele:

Eingabe:

10 10 3
10 6 1
Ausgabe:

Die Kreise sind tangierend.
Eingabe:

0 0 1
0 1 1
Ausgabe:

Die Kreise schneiden sich.
Eingabe:

1 2 3
2 2 1
Ausgabe:

Die Kreise schneiden sich nicht.

 */

import java.util.Scanner;

public class Problem8 {

    private static String schnitt(String k1, String k2){
        String[] k1s = k1.split("[ ]+");
        String[] k2s = k2.split("[ ]+");
        int[] k1i = new int[3];
        int[] k2i = new int[3];

        for(int i = 0; i < 3; i++){
            k1i[i] = Integer.parseInt(k1s[i]);
            k2i[i] = Integer.parseInt(k2s[i]);
        }

        double d = distance(k1i, k2i);
        int radiusSum = k1i[2] + k2i[2];
        int radiusDif = Math.abs(k1i[2] - k2i[2]);

        if(radiusDif > d || radiusSum < d){
            return "Die Kreise schneiden sich nicht.";
        }else if(radiusDif == d || radiusSum == d){
            return  "Die Kreise sind tangierend.";
        }
        return "Die Kreise schneiden sich.";
    }

    private static double distance(int[] p1, int[] p2){
        int deltaX = p1[0] - p2[0];
        int deltaY = p1[1] - p2[1];
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kreis1 = sc.nextLine();
        String kreis2 = sc.nextLine();
        System.out.println(schnitt(kreis1, kreis2));
    }
}


