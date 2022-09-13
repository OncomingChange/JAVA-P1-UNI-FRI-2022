import java.util.*;

public class I26NajboljseSeme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        // na ta način ne moremo sprejeti števil večjih od 10^17, zato se znebimo enic in upamo na najboljše :)
        if (n == 18) {
            n--;
        }
        
        long primerjava = 0L;
        int seme = 0;

        for (int i = a; i <= b; i++) {
            Random rand = new Random(i);
            long stevilo = 0L;
            for (int k = n; k >= 1; k--) {
                stevilo += (long) Math.pow(10, k) * rand.nextInt(10);
            }
            if (stevilo > primerjava) {
                primerjava = stevilo;
                seme = i;
            }
        }
        System.out.print(seme);
    }
}
