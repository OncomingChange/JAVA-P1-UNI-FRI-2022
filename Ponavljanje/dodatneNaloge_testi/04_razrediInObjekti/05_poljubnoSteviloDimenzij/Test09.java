
import java.util.Random;

public class Test09 {

    public static void main(String[] args) {
        // delali bomo s tabelo 4 x 2 x 3 x 5
        int a = 4, b = 2, c = 3, d = 5;  

        System.out.println("Inicializacija:");
        Ptabela p = new Ptabela(new int[]{a, b, c, d});
        System.out.println(p.toString());
        System.out.println("----------");

        System.out.println("Polnjenje z elementi od -999 do 999:");
        Random random = new Random(12345);
        for (int i = 0;  i < a;  i++) {
            for (int j = 0;  j < b;  j++) {
                for (int k = 0;  k < c;  k++) {
                    for (int l = 0;  l < d;  l++) {
                        p.nastavi(new int[]{i, j, k, l}, random.nextInt(1999) - 999);
                    }
                }
            }
        }
        System.out.println(p.toString());
        System.out.println("----------");

        System.out.println("Elementi in podtabele:");
        System.out.println("p[1][1][0][4] = " + p.vrni(new int[]{1, 1, 0, 4}));
        System.out.println("p[3][1][2] = " + p.podtabela(new int[]{3, 1, 2}).toString());
        System.out.println("p[0][0] = " + p.podtabela(new int[]{0, 0}).toString());
        System.out.println("p[2] = " + p.podtabela(new int[]{2}).toString());
        System.out.println("p = " + p.podtabela(new int[]{}).toString());
    }
}
