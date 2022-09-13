package JavaOdZačetka;

import java.util.Scanner;

public class Naloga334 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String jezik = sc.nextLine();

        if (jezik.equals("sl")) {
            System.out.println("pet");
        }
        else if (jezik.equals("en")) {
            System.out.println("five");
        }
        else if (jezik.equals("de")) {
            System.out.println("funf");
        }
        else if (jezik.equals("it")) {
            System.out.println("cinq");
        }
        else if (jezik.equals("pl")) {
            System.out.println("piec");
        }
        else {
            System.out.println("Neveljaven jezik");
        }
    }
}
