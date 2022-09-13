package KrmilniKonstrukti;
import java.util.Scanner;

public class Naloga12 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int prvoSt = sc.nextInt();
            int drugoSt = sc.nextInt();

            if (prvoSt > drugoSt) {
            System.out.println("1");
            }
            else if (prvoSt == drugoSt) {
            System.out.println("0");
            }
            else {
            System.out.println("-1");
            }
        }
    }
}
