import java.util.*;

public class I16MedianaTrojice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= b && b <= c) {
            System.out.print(b);
        }
        else if (a <= c && c <= b) {
            System.out.print(c);
        }
        else if (b <= a && a <= c) {
            System.out.print(a);
        } 
        else if (b <= c && c <= a) {
            System.out.print(c);
        }
        else if (c <= a && a <= b) {
            System.out.print(a);
        } 
        else if (c <= b && b <= a) {
            System.out.print(b);
        }
    }
}
