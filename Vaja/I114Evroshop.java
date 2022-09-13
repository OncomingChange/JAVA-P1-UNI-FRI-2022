import java.util.Scanner;

public class I114Evroshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int enEvro = 0;
        int dvaEvra = 0;
        do {
            int kovanec = sc.nextInt();
            if (kovanec == 1) {
                enEvro++;
            }
            else {
                enEvro--;
                dvaEvra++;
            }
        } while(enEvro >= 0);
        System.out.print("BANKROT");
    }
}
