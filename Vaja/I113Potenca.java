import java.util.Scanner;

public class I113Potenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int vrednost = a;

        if (b == 0) {
            System.out.print(1);
        }
        else if (b == 1) {
            System.out.print(a);
        }
        else {
            for (int i = 2; i <= b; i++) {
                vrednost *= a;
            }
            System.out.println(vrednost);
        }
    }
}