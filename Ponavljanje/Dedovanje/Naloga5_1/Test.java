import java.util.*;

public class Test {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int Z = sc.nextInt();
            int R = sc.nextInt();
            int D = sc.nextInt();
            int P = sc.nextInt();
            int T = sc.nextInt();
            Posiljka.setter(Z, R, D, P, T);

            int n = sc.nextInt();
            Posiljka[] seznam = new Posiljka[n];
            
            for (int i = 0; i < seznam.length; i++) {
                switch (sc.next()) {
                    case "navadnoPismo":
                    seznam[i] = new NavadnoPismo(sc.next(), sc.next(), sc.nextInt());
                    break;
                    case "priporocenoPismo":
                    seznam[i] = new PriporocenoPismo(sc.next(), sc.next(), sc.nextInt(), sc.next());
                    break;
                    case "telegram":
                    seznam[i] = new Telegram(sc.next(), sc.next());
                    break;
                }
            }

            int ukaz = sc.nextInt();

            switch (ukaz) {
                case 1:
                ukaz1(n, seznam);
                break;
                case 2:
                ukaz2(n, seznam);
                break;
                case 3:
                ukaz3(n, seznam);
                break;
            }
        }
    }

    public static void ukaz1(int n, Posiljka[] seznam) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%s", seznam[i].toString());
        }
    }

    public static void ukaz2(int n, Posiljka[] seznam) {
        int maxCena = 0;
        int indeksMaks = 0;
        for (int i = 0; i < n; i++) {
            if (seznam[i].cena() > maxCena) {
                maxCena = seznam[i].cena();
                indeksMaks = i;
            }
        }
        System.out.printf("%s", seznam[indeksMaks].toString());
    }

    public static void ukaz3(int n, Posiljka[] seznam) {
        for (int i = 0; i < n; i++) {
            if (seznam[i] instanceof PriporocenoPismo) {
                String naslovnik = seznam[i].vrniNaslovnik();
                String posiljatelj = ((PriporocenoPismo) seznam[i]).vrniPosiljatelja();
                int razdalja = ((PriporocenoPismo) seznam[i]).vrniRazdaljo();
                System.out.print(new PriporocenoPismo(posiljatelj, "povratnica", razdalja, naslovnik).toString());
            }
        }
    }
}
