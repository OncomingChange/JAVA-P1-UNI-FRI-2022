import java.util.*;

public class I32DigitalneCrtice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] tabelaStevil = new int[n];
        int maxStevilo = 0;
        int maxSteviloCrtic = 0;
        for (int i = 0; i < n; i++) {
            int stevilo = sc.nextInt();
            tabelaStevil[i] = stevilo;
        }

        for (int j = 0; j < n; j++) {
            int stCrtic = stCrtic(tabelaStevil[j]);
            if (stCrtic > maxSteviloCrtic) {
                maxSteviloCrtic = stCrtic;
                maxStevilo = tabelaStevil[j];
            }
        }

        System.out.println(maxStevilo);
    }

    public static int stCrtic(int stevilo) {
        int[] tabela = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int stCrtic = 0;
        for (int delitelj = (int) Math.pow(10, 9); delitelj > 0; delitelj /= 10) {
            int veckratnik = stevilo / delitelj;
            if (veckratnik != 0) {
                stCrtic += tabela[veckratnik];
                stevilo -= delitelj * veckratnik;
            }
            else if (veckratnik == 0 && stCrtic != 0) {
                stCrtic += tabela[0];
            }
        }
        return stCrtic;
    }
}
