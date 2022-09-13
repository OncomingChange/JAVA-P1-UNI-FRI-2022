package JavaOdZačetka;

import java.util.Scanner;

public class Naloga336 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ocena = sc.nextInt();

        System.out.println((ocena == 5) ? "odlično" : ((ocena == 4) ? "prav dobro" : 
        ((ocena == 3) ? "dobro" : ((ocena == 2) ? "zadostno" : ((ocena == 1) ? 
        "nezadostno" : "neveljavna ocena")))));
    }
}
