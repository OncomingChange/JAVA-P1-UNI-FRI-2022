import java.util.Scanner;

public class I115Smucanje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prviCas = sc.nextInt();
        int trenutniCas;
        int drugiCas = 0;
        int stTekmovalca = 0;
        if (prviCas == 0) {
            trenutniCas = Integer.MAX_VALUE;
            stTekmovalca = 1;
        }
        else {
            drugiCas = sc.nextInt();
            trenutniCas = prviCas + drugiCas;
            stTekmovalca = 1;
        }
        for (int i = 2; i <= n; i++) {
            prviCas = sc.nextInt();
            if (prviCas == 0) {
            }
            else {
                drugiCas = sc.nextInt();
                if (drugiCas != 0) {
                    int noviCas = prviCas + drugiCas;
                    if (noviCas < trenutniCas) {
                        stTekmovalca = i;
                        trenutniCas = noviCas;
                    }
                }
                else {
                }
            }
        }
        if ((n >= 2 && stTekmovalca == 1) || stTekmovalca == 1 && (prviCas == 0 || drugiCas ==0)) {
            System.out.print("NIHCE");
        }
        else {
        System.out.println(stTekmovalca);
        System.out.println(trenutniCas);
        }
    }
}
