package KrmilniKonstrukti;
import java.util.Scanner;
public class Naloga14 {
    public static void main(String[] args){
         try (Scanner sc = new Scanner(System.in)) {
            int h1 = sc.nextInt();
             int m1 = sc.nextInt();
             int h2 = sc.nextInt();
             int m2 = sc.nextInt();

             int razlikaUr = h2 - h1;
             int razlikaMinut = m2 - m1;
             int razlikaCasov = razlikaUr * 60 + razlikaMinut;
             int ostanekCasovUr = razlikaCasov / 60;
             int ostanekCasovMin = razlikaCasov % 60;
             System.out.printf("%d:%02d%n", ostanekCasovUr, ostanekCasovMin);
        }
    }
}