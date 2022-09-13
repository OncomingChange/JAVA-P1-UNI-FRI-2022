package Metode;
import java.util.*;

public class bNaloga8 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int seme = sc.nextInt();
            int k = sc.nextInt();
            int d = sc.nextInt();
            Random rand = new Random(seme);

            for (int i = 1; i <= d; i++) {
                System.out.printf("%d. dan:%n", i);
                meti(k, rand);
            }
        }
    }

    public static void meti (int k, Random rand) {
        boolean iskanjePraštevila = true;
        int števecMetov = 1;

        while (iskanjePraštevila) {
            int vsotaKock = 0;
            System.out.printf("    %d. met: ", števecMetov);
            for(int j = 1; j <= k; j++) {
                int stPik = rand.nextInt(6) + 1;
                System.out.print(stPik + " ");
                vsotaKock += stPik;
            }
            System.out.printf("| vsota = %d%n", vsotaKock);
            iskanjePraštevila = praštevilo (vsotaKock);
            števecMetov++;
        }
    }

    public static boolean praštevilo (int število) {
        int števecDeliteljev = 0;
        if (število == 1) {
            return true;
        }
        for (int j = 2; j <= Math.sqrt(število); j++) {
            if (število % j == 0) {
                števecDeliteljev++;
                return true;
            }
        }
        if (števecDeliteljev == 0) {
            return false;
        }
        return true;
    }
}
