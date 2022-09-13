import java.util.*;
public class Test {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Lik[] telesa = new Lik[n];

            for (int i = 0; i < n; i++) {
                int telo = sc.nextInt();
                switch (telo) {
                    case 1:
                    telesa[i] = new Kvader(sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                    case 2:
                    telesa[i] = new Kocka(sc.nextInt());
                    break;
                    case 3:
                    telesa[i] = new Krogla(sc.nextInt());
                    break;
                }
            }

            tabelaPoProstornini(telesa);

            for (Lik lik: telesa) {
                System.out.println(lik.toString());
            }
        }
    }

    public static void tabelaPoProstornini(Lik[] telesa) {
        for (int i = 1; i < telesa.length; i++) {
            Lik element = telesa[i];
            int j = i;
            while (j > 0 && element.prostornina() > telesa[j - 1].prostornina()) {
                telesa[j] = telesa[j - 1];
                j--;
            }
            telesa[j] = element;
        }
    }
}
