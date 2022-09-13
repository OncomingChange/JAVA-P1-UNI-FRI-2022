import java.util.Scanner;

public class I117PiramidaStevil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int x = 1; x <= n - i; x++) {
                System.out.print(" ");
            }
            int y = i;
            for (int st = 1; st <= (2 * i - 1); st++) {
                int stevec = (y % 10);
                System.out.print(stevec);
                y++;
            }
            System.out.println();
        }
    }
}
