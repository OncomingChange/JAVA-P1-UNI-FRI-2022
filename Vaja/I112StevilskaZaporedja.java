import java.util.Scanner;

public class I112StevilskaZaporedja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int stevec = Integer.MIN_VALUE;

        if (k == 0 || ((a > b) && (k > 0)) || ((a < b) && (k < 0))) {
            System.out.print("NAPAKA");
        }
        else if (a < b) {
            for (int i = 0; (stevec + k) <= b; i++) {
                stevec = a + k * i;
                System.out.println(stevec);
            }
        }
        else if (a == b) {
            System.out.println(a);
        }
        else if (a > b) {
            for (int i = 0; (stevec + k) >= b; i++) {
                stevec = a + k * i;
                System.out.println(stevec);
            }
        }
    }
}
