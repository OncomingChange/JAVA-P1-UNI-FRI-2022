import java.util.Scanner;

public class I19Postevanka1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int števec = 0;

        for (int i = 1; i <= b; i++) {
            števec = a * i;
            System.out.println(števec);
        }
    }
}
