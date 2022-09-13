import java.util.Scanner;

public class I23MedianaTrojice {
    public static void main(String[] args){

        // scrapped koda, nevem kako na lažji način do rezultatov s temi metodami...

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int stevecA = 0;
        int stevecB = 0;
        int stevecC = 0;

        if (max(a, b) == a) {
            stevecA++;
        }
        else {
            stevecB++;
        }

        if (max(a, c) == a) {
            stevecA++;
        }
        else {
            stevecC++;
        }

        if (max(b, c) == b) {
            stevecB++;
        }
        else {
            stevecC++;
        }

    }

    public static int max(int x, int y) {
        int max = 0;
        if (x >= y) {
            max = x;
        }
        else {
            max = y;
        }
        return max;
    }

    public static int min(int x, int y) {
        int min = 0;
        if (x <= y) {
            min = x;
        }
        else {
            min = y;
        }
        return min;
    }
}
