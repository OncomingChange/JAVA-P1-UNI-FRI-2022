import java.util.Scanner;

public class I24StetjeKlicev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        System.out.print(funkcija(a, b, n));
    }

    public static int funkcija(int a, int b, int n) {
        int stevec = 0;
        if (n != 0) {
            stevec += funkcija (a, b, n / a);
            stevec += funkcija (a, b, n / b);
        }
            stevec++;
        return stevec;
    }
}
