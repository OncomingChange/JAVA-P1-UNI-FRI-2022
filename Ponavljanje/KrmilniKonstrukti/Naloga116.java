package KrmilniKonstrukti;
import java.util.Scanner;

public class Naloga116 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int startingHour = sc.nextInt();
            int startingMinutes = sc.nextInt();
            int finishingHour = sc.nextInt();
            int finishingMinutes = sc.nextInt();
            int intervalMinutes = sc.nextInt();
            int currentHour = startingHour;
            int currentMinutes = startingMinutes;

            for (; (currentHour < finishingHour) || (currentHour == finishingHour && currentMinutes <= finishingMinutes);) { 
                System.out.printf("%02d:%02d%n", currentHour, currentMinutes);
                int addedHours = (currentMinutes + intervalMinutes) / 60;
                currentMinutes += intervalMinutes;
                if (currentMinutes >= 60) {
                    currentMinutes %= 60;
                    currentHour += addedHours;
                }
            }
        }
    }
}
