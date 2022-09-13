import java.util.Scanner;

public class I116VozniRed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int začetnaUra = sc.nextInt();
        int začetnaMin = sc.nextInt();
        int končnaUra = sc.nextInt();
        int končnaMin = sc.nextInt();
        int interval = sc.nextInt();

        int trenutnaMin = začetnaMin;
        int trenutnaUra = začetnaUra;

        int obhodi = ((končnaUra - začetnaUra) * 60 + (končnaMin - začetnaMin)) / interval;
        
        System.out.printf("%02d:%02d%n", začetnaUra, začetnaMin);
        for (int i = 1; i <= obhodi; i++) {
            trenutnaMin += interval;
            while (trenutnaMin >= 60) {
                trenutnaMin -= 60;
                trenutnaUra++;
            }
            System.out.printf("%02d:%02d%n", trenutnaUra, trenutnaMin);
        }
    }
}
