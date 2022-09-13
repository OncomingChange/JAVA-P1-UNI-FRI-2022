package Tabele;
import java.util.Scanner;
public class cNaloga11 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            boolean[] tabelaKlicev = new boolean[n + 1];
            rekurzija(a, b, n, tabelaKlicev);
            
            int številoKlicev = 0;
            for (int i = 0; i <= n; i++) {
                if (tabelaKlicev[i]) {
                    številoKlicev++;
                }
            }
            System.out.print(številoKlicev);
        }
    }

    public static void rekurzija(int a, int b, int n, boolean[] tabelaKlicev) {
        if (tabelaKlicev[n]) {
            return;
        }
        else {
            tabelaKlicev[n] = true;
            rekurzija(a, b, (int) Math.floor(n/a), tabelaKlicev);
            rekurzija(a, b, (int) Math.floor(n/b), tabelaKlicev);
        }
    }
}
