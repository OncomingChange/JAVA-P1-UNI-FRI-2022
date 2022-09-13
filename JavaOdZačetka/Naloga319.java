package JavaOdZačetka;

import java.util.*;

public class Naloga319 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();

        int nakljucno;

        do {
            nakljucno = random.nextInt(b) + 1;
    } while (a > nakljucno);
    System.out.println(nakljucno);
    }
}
