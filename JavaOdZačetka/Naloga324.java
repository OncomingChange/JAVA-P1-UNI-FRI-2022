package JavaOdZačetka;

import java.util.Scanner;

public class Naloga324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stariDelitelj = 0;
        int stDeliteljev = 0;
        int trenutniDeljenec = 0;

        // preverjamo vsako število od 1 do n

        for (int i = 1; i <= n; i++) {
            stDeliteljev = 0;
            trenutniDeljenec = i;

            // preverjamo število deliteljev vsakega števila

            for (int k = 1; k <= trenutniDeljenec; k++) {

                // štejemo delitelje trenutnega števila

                if (trenutniDeljenec % k == 0) {
                    stDeliteljev++;
                }
            }
            if (stDeliteljev > stariDelitelj) {
                stariDelitelj = stDeliteljev;
                System.out.println(i);
            }
        } 
    }
}
