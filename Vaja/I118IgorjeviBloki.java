import java.util.Scanner;

public class I118IgorjeviBloki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 1; i <= a || i <= b || i <= c; i++) {
            if (a <= b && b <= c) {
                if (i <= a) {
                    for (int n = 1; n <= a; n++) {
                        System.out.print(a);
                    }
                    System.out.print(" ");
                }
                else {
                    for (int n = 1; n <= (a + 1); n++) {
                        System.out.print(" ");
                    }
                }
                if (i <= b) {
                    for (int n = 1; n <= b; n++) {
                        System.out.print(b);
                    }
                    System.out.print(" ");
                }
                else {
                    for (int n = 1; n <= (b + 1); n++) {
                        System.out.print(" ");
                    }
                }
                if (i <= c) {
                    for (int n = 1; n <= c; n++) {
                        System.out.print(c);
                    }
                }
                System.out.println();
            }
            else if (a <= c && c <= b) {
                if (i <= a) {
                    for (int n = 1; n <= a; n++) {
                         System.out.print(a);
                    }
                    System.out.print(" ");
                }
                else {
                    for (int n = 1; n <= (a + 1); n++) {
                        System.out.print(" ");
                    }
                }
                if (i <= b) {
                    for (int n = 1; n <= b; n++) {
                        System.out.print(b);
                    }
                    System.out.print(" ");
                }
                else {
                    for (int n = 1; n <= (b + 1); n++) {
                        System.out.print(" ");
                    }
                }
                if (i <= c) {
                    for (int n = 1; n <= c; n++) {
                        System.out.print(c);
                        }
                }
                System.out.println("_");
            }
            else if (b <= a && a <= c) {
                if (i <= a) {
                    for (int n = 1; n <= a; n++) {
                        System.out.print(a);
                    }
                    System.out.print(" ");
                }
                else {
                    for (int n = 1; n <= (a + 1); n++) {
                        System.out.print(" ");
                    }
                }
                if (i <= b) {
                    for (int n = 1; n <= b; n++) {
                        System.out.print(b);
                    }
                    System.out.print(" ");
                }
                else {
                    for (int n = 1; n <= (b + 1); n++) {
                        System.out.print(" ");
                    }
                }
                if (i <= c) {
                    for (int n = 1; n <= c; n++) {
                        System.out.print(c);
                    }
                }
                System.out.println();
                
            }
            else if (b <= c && c <= a) {
                if (i <= a) {
                    for (int n = 1; n <= a; n++) {
                        System.out.print(a);
                    }
                    System.out.print(" ");
                }
                else {
                    for (int n = 1; n <= (a + 1); n++) {
                        System.out.print(" ");
                    }
                }
                if (i <= b) {
                    for (int n = 1; n <= b; n++) {
                        System.out.print(b);
                    }
                    System.out.print(" ");
                }
                else if (i <= c) {
                    for (int n = 1; n <= (b + 1); n++) {
                        System.out.print(" ");
                    }
                }
                if (i <= c) {
                    for (int n = 1; n <= c; n++) {
                        System.out.print(c);
                    }
                }
                System.out.println();
            }
            else {
                if (i <= a) {
                    for (int n = 1; n <= a; n++) {
                        System.out.print(a);
                    }
                    System.out.print(" ");
                }
                else {
                    for (int n = 1; n <= (a + 1); n++) {
                        System.out.print(" ");
                    }
                }
                if (i <= b) {
                    for (int n = 1; n <= b; n++) {
                        System.out.print(b);
                    }
                    System.out.print(" ");
                }
                else if (i <= a) {
                    for (int n = 1; n <= (b + 1); n++) {
                        System.out.print(" ");
                    }
                }
                if (i <= c) {
                    for (int n = 1; n <= c; n++) {
                        System.out.print(c);
                    }
                }
                System.out.println();
            }
        }
    }
}
