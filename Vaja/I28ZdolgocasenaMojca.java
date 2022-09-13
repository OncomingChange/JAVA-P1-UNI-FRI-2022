import java.util.*;

public class I28ZdolgocasenaMojca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt();

        Random random = new Random(s);

        for (int i = 1; i <= d; i++) {
            int vsota = 0;
            System.out.printf("%d. dan:%n", i);
            int met = 0;
            while (!prastevilo(vsota)) {
                vsota = 0;
                met++;
                System.out.printf("    %d. met:", met);
                for (int j = 1; j <= k; j++) {
                    int stPik = random.nextInt(6) + 1;
                    vsota += stPik;
                    System.out.printf(" %d", stPik);
                }
                System.out.printf(" | vsota = %d%n", vsota);
            }
        }
    }

    public static boolean prastevilo(int vsota) {
        if (vsota == 0 || vsota == 1 || vsota % 2 == 0 && vsota != 2) {
            return false;
        }
        else {
            for (int i = 3; i < vsota; i += 2) {
                if (vsota % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
