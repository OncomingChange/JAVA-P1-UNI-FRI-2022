import java.util.Scanner;

public class I111PostevankaIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int števec = 0;

        for (int i = 1; (števec + a) <= b; i++) {
            števec = a * i;
            System.out.println(a + " * " + i + " = " + števec);
        }
    }
}