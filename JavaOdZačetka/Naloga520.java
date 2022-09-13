package JavaOdZačetka;

public class Naloga520 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4, 5};
        System.out.println(primerjaj(a, b));
    }

    public static int primerjaj(int[] a, int[] b) {
        if (a.length == b.length) {
            if (a == b) {
                return 1;
            }
            else {
                for (int i = 0; i < a.length && i < b.length; i++) {
                    if (a[i] == b[i]) {
                    }
                    else {
                        return 0;
                    }
                }
                return 2;
            }
        }
        else {
            return 0;
        }
    }
}
