package KrmilniKonstrukti;
import java.util.Scanner;

public class Naloga114 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int enEvro = 0;
            do {
                int kovanec = sc.nextInt();
                if (kovanec == 1) {
                    enEvro++;
                }
                else {
                    enEvro--;
                }
            } while(enEvro >= 0);
        }
        
        System.out.print("BANKROT");
    }
}
