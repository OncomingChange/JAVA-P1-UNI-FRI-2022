package KrmilniKonstrukti;
import java.util.Scanner;

public class Naloga16 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int x = a - b;
            int y = b - c;
            int z = a - c;
            if (x * y > 0) {
                System.out.println(b);
            }
            else if (x * z > 0) {
                System.out.println(c);
            }
            else {
                System.out.println(a);
            }
        }
    }
}