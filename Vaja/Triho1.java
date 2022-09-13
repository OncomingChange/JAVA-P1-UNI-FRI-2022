import java.util.Scanner;

public class Triho1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prvo število: ");
        int prvo = scanner.nextInt();
        System.out.println("Drugo število: ");
        int drugo = scanner.nextInt();
        
        if (prvo > drugo) System.out.println("1");
        else if (prvo == drugo) System.out.println("0");
        else System.out.println("-1");
    }
    
}
