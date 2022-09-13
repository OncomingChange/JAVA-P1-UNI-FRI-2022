import java.util.Scanner;

public class I18ZaporedjeZvezdic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int zvezdice = sc.nextInt();

        for (int n = 1; n <= zvezdice; n++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
