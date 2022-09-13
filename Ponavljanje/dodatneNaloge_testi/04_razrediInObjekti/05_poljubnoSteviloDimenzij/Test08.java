
import java.util.Random;

public class Test08 {

    public static void main(String[] args) {
        // delali bomo s tabelo 3 x 4 x 2
        int a = 3, b = 4, c = 2;  

        System.out.println("Inicializacija:");
        Ptabela p = new Ptabela(new int[]{a, b, c});
        System.out.println(p.toString());
        System.out.println("----------");

        System.out.println("Polnjenje z elementi od -99 do 99:");
        Random random = new Random(12345);
        for (int i = 0;  i < a;  i++) {
            for (int j = 0;  j < b;  j++) {
                for (int k = 0;  k < c;  k++) {
                    p.nastavi(new int[]{i, j, k}, random.nextInt(199) - 99);
                }
            }
        }
        System.out.println(p.toString());
        System.out.println("----------");

        System.out.println("Elementi in podtabele:");
        System.out.println("p[2][0][1] = " + p.vrni(new int[]{2, 0, 1}));
        System.out.println("p[2][1] = " + p.podtabela(new int[]{2, 1}).toString());
        System.out.println("p[1] = " + p.podtabela(new int[]{1}).toString());
        System.out.println("p = " + p.podtabela(new int[]{}).toString());
    }
}
