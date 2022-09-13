import java.util.Scanner;

public class ČasRaz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //vnašanje števk
        int ura1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int ura2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        //računanje s števkami #1
        int urak = Math.abs(ura2 - ura1);
        int mink = Math.abs(min2 - min1);
        //pogoji
        if (min1 > min2) {
            urak = urak - 1;
            mink = (60 - mink);
        }
        //računanje s števkami #2
        int minkeninke = (mink % 10);
        int minkdesetinke = (mink / 10);
        System.out.println(urak + ":" + minkdesetinke + minkeninke);
    }
}