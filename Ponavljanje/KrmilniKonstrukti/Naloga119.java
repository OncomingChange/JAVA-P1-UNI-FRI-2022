package KrmilniKonstrukti;
import java.util.*;

public class Naloga119 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int vrstice = sc.nextInt();
            int stolpci = sc.nextInt();
            int xyPolja = sc.nextInt();
            String minus = " -";
            String presledek = "  ";
            String zvezdica = " *";
            int stevec = 0;

            System.out.print("+");
            System.out.print(minus.repeat(stolpci * xyPolja));
            System.out.println(" +");

            for (int i = 1; i <= vrstice * xyPolja; i++) {
                System.out.print("|");
                for (int j = 1; j <= stolpci; j++) {
                    if (stevec % 2 != 0) {
                        if (j % 2 == 0) {
                            System.out.print(presledek.repeat(xyPolja));
                        }
                        else {
                            System.out.print(zvezdica.repeat(xyPolja));
                        }
                    }
                    else {
                        if (j % 2 == 0) {
                            System.out.print(zvezdica.repeat(xyPolja));
                        }
                        else {
                            System.out.print(presledek.repeat(xyPolja));
                        }
                    }
                }
                System.out.println(" |");
                if (i % xyPolja == 0) {
                    stevec++;
                }
            }
            System.out.print("+");
            System.out.print(minus.repeat(stolpci * xyPolja));
            System.out.print(" +");
        }
    }
}
