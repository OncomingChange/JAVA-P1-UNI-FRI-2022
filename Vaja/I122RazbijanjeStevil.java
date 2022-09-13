import java.util.Scanner;

public class I122RazbijanjeStevil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        for (long delitelj = (long) Math.pow(10, 18); delitelj >= 1; delitelj /= 10) {
            long rezultat = m / delitelj;
            if (rezultat != 0) {
                m -= delitelj * rezultat;
                int stevec = 1;
                for (long delitelj2 = (long) Math.pow(10, 18); delitelj2 >= 1 && stevec <= rezultat; delitelj2 /= 10) {
                    long rezultat2 = n / delitelj2;
                    if (rezultat2 != 0) {
                        n -= delitelj2 * rezultat2;
                        System.out.print(rezultat2);
                        stevec++;
                    }
                }
                System.out.println();
            }
        }
    }
}
