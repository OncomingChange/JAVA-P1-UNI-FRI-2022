package Tabele;
import java.util.Scanner;

public class cNaloga2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] zaporedje = new int[n];
        int[] črtice = new int[n];

        izpolniTabelo(sc, zaporedje);
        System.out.print(zaporedje[največČrtic(zaporedje, črtice)]);
    }

    public static void izpolniTabelo(Scanner sc, int[] tabela) {
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = sc.nextInt();
        }
    }

    public static int največČrtic(int[] števila, int[] črtice) {
        int indeks = 0;
        int največČrtic = 0;
        for (int i = 0; i < števila.length; i++) {
            if (številoČrtic(števila[i]) > največČrtic) {
                največČrtic = številoČrtic(števila[i]);
                indeks = i;
            }
        }
        return indeks;
    }

    public static int številoČrtic(int število) {
        int številoČrtic = 0;
        int[] vrednosti = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        for (int i = (int) Math.pow(10, 9); i >= 1; i /= 10) {
            if (število / i != 0) {
                številoČrtic += vrednosti[število / i];
                število -= (število / i) * i;
            }
            else if (število / i == 0 && številoČrtic != 0) {
                številoČrtic += vrednosti[0];
            }
        }
        return številoČrtic;
    }
}
