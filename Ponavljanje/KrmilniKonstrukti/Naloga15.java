package KrmilniKonstrukti;
import java.util.Scanner;
public class Naloga15 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = b - a;
            if (b - a == 0) {
                System.out.println(a);
            }
            else {
                int d = 0;
                int stevec = 1;
                while (c > 0) {
                    stevec++;
                    d = c;
                    c = b - stevec * a;
                }
                if (d <= Math.abs(c)) {
                    System.out.println((stevec - 1) * a);
                }
                else {
                    System.out.println(stevec * a);
                }
            }
        }
    }
}
