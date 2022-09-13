import java.util.Scanner;

public class I314PravilniTrikotniki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        int[][] koordinateTočk = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int xY = 0; xY < 2; xY++) {
                koordinateTočk[i][xY] = sc.nextInt();
            }
        }

        izpisKombinacij(koordinateTočk, d, n);
    }

    public static void izpisKombinacij(int[][] koordinateTočk, int d, int n) {
        int stTrikotnikov = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    double a = dolžinaStranice(koordinateTočk[i][0], koordinateTočk[j][0], koordinateTočk[i][1], koordinateTočk[j][1]);
                    double b = dolžinaStranice(koordinateTočk[i][0], koordinateTočk[k][0], koordinateTočk[i][1], koordinateTočk[k][1]);
                    double c = dolžinaStranice(koordinateTočk[j][0], koordinateTočk[k][0], koordinateTočk[j][1], koordinateTočk[k][1]);

                    double maxStranica = (a > b && a > c) ? a : (b > c) ? b : c;
                    double minStranica = (a < b && a < c) ? a : (b < c) ? b : c;

                    if (maxStranica - minStranica < (Math.pow(10, -d) * minStranica)) {
                        System.out.printf("%d %d %d%n", i, j, k);
                        stTrikotnikov++;
                    }
                    if (i == koordinateTočk.length - 3 && j == i + 1 && k == j + 1 && stTrikotnikov == 0) {
                        System.out.print("BREZ");
                    }

                }
            }
        }
    }

    public static double dolžinaStranice(int x1, int x2, int y1, int y2) {
        double dolžinaStranice = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
        return dolžinaStranice;
    }
}
