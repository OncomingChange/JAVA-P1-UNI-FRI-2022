import java.util.*;

public class I27VrazeverniBoris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();
        
        Random rand = new Random(s);

        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
            int lihe = 0;
            int stMetov = 0;
            if (nedelja(i)) {
                System.out.print(" (N):");
                while (lihe < 5) {
                    int stPik = rand.nextInt(6) + 1;
                    System.out.printf(" %d", stPik);
                    if (liho(stPik)) {
                        lihe++;
                    }
                    stMetov++;
                }
                System.out.printf(" [%d]%n", stMetov);
            }
            else {
                System.out.print(" (D):");
                while (lihe < 3) {
                    int stPik = rand.nextInt(6) + 1;
                    System.out.printf(" %d", stPik);
                    if (liho(stPik)) {
                        lihe++;
                    }
                    stMetov++;
                }
                System.out.printf(" [%d]%n", stMetov);
            }
        }
    }

    public static boolean nedelja(int n) {
        return (n % 7 == 0);
    }

    public static boolean liho(int n) {
        return (n % 2 != 0);
    }
}
