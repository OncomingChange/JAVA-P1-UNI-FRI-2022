
import java.util.Random;

public class Test07 {

    public static void main(String[] args) {
        // delali bomo s tabelo 7 x 6
        int a = 7, b = 6;

        System.out.println("Inicializacija:");
        Ptabela p = new Ptabela(new int[]{a, b});
        System.out.println(p.toString());
        System.out.println("----------");

        System.out.println("Polnjenje z elementi od -99 do 99:");
        Random random = new Random(12345);
        for (int i = 0;  i < a;  i++) {
            for (int j = 0;  j < b;  j++) {
                p.nastavi(new int[]{i, j}, random.nextInt(199) - 99);
            }
        }
        System.out.println(p.toString());
        System.out.println("----------");

        System.out.println("Elementi in podtabele:");
        System.out.println("p[3][4] = " + p.vrni(new int[]{3, 4}));
        System.out.println("p[6] = " + p.podtabela(new int[]{6}).toString());
        System.out.println("p = " + p.podtabela(new int[]{}).toString());
    }
}
