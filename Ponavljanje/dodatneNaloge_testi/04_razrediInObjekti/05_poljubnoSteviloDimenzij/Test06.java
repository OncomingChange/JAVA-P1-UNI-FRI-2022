
import java.util.Random;

public class Test06 {

    public static void main(String[] args) {
        // delali bomo s tabelo dol"zine 10
        int a = 10;

        System.out.println("Inicializacija:");
        Ptabela p = new Ptabela(new int[]{a});
        System.out.println(p.toString());
        System.out.println("----------");

        System.out.println("Polnjenje z elementi od -9999 do 9999:");
        Random random = new Random(1234567);
        for (int i = 0;  i < a;  i++) {
            p.nastavi(new int[]{i}, random.nextInt(19999) - 9999);
        }
        System.out.println(p.toString());
        System.out.println("----------");

        System.out.println("Elementi in podtabele:");
        System.out.println("p[0] = " + p.vrni(new int[]{0}));
        System.out.println("p[7] = " + p.vrni(new int[]{7}));
        System.out.println("p[9] = " + p.vrni(new int[]{9}));
        System.out.println("p = " + p.podtabela(new int[]{}).toString());
    }
}
