import java.util.Scanner;

public class IzpitEna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // število glav, ki jih ima vsaka branjevka
        int s = sc.nextInt();
        // število kupcev
        int k = sc.nextInt();

        int branjevka = 1;
        int trenutneGlave = s;
        for (int i = 1; i <= k; i++) {
            int številoGlav = sc.nextInt();
            if (trenutneGlave - številoGlav >= 0) {
                trenutneGlave -= številoGlav;
            }
            else {
                trenutneGlave = s - številoGlav;
                branjevka++;
            }
        }
        System.out.print(branjevka);
    }
}
