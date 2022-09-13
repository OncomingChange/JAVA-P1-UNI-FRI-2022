import java.util.Scanner;

public class AbsVred1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesite število: ");
        int število = scanner.nextInt();
        System.out.println(Math.abs(število));
    }
}