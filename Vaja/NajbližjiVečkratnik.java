import java.util.Scanner;

public class NajbližjiVečkratnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        int c = 0;
        int d = 0;

        for (int n = 1; (c + a) < b; n++) {
            c = a * n;
        }
        d = c + a;
        int x = c - b;
        int y = d - b;
        if (Math.abs(x) > Math.abs(y)) {
            System.out.print(d);
        }
        else {
            System.out.print(c);
        }
    }
}