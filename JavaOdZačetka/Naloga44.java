package JavaOdZačetka;

import java.util.Scanner;

public class Naloga44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stariDelitelj = 0;


        // preverjamo vsako število od 1 do n

        for (int i = 1; i <= n; i++) {
            int stDeliteljev = 0;
            int trenutniDeljenec = i;

            // preverjamo število deliteljev vsakega števila

            stDeliteljev = preizkus(trenutniDeljenec, stDeliteljev);
            if (stDeliteljev > stariDelitelj) {
                stariDelitelj = stDeliteljev;
                System.out.println(i);
            }
        } 
    }

    public static int preizkus(int trenutniDeljenec, int stDeliteljev) {
        for (int k = 1; k <= trenutniDeljenec; k++) {

            // štejemo delitelje trenutnega števila

            if (trenutniDeljenec % k == 0) {
                stDeliteljev++;
            }
        }
        return stDeliteljev;
    }
}