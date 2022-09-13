package JavaOdZačetka;

import java.util.Scanner;

import javax.lang.model.util.ElementFilter;

public class Naloga318 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Koliko tekmovalcev tekmuje? ");
        int stSkakalcev = scanner.nextInt();
        int maxLenght = 0;
        int secondLenght = 0;
        int initial = 0;
        int number = 1;

        for (int st = 1; st <= stSkakalcev; st++) {
            if (st == 1) {
                System.out.print("Vnesite dolžino skoka " + st + ". skakalca. ");
                maxLenght = scanner.nextInt();
                number = st;
            }
            else {
                System.out.print("Vnesite dolžino skoka " + st + ". skakalca. ");
                secondLenght = scanner.nextInt();
                if (initial < secondLenght && secondLenght < maxLenght) {
                    initial = secondLenght;
                    number = st;
                } 
                else if (secondLenght < initial) {
                }
                else {
                    int a = secondLenght;
                    secondLenght = maxLenght;
                    maxLenght = a;
                }
            }
        }
        System.out.print("Drugi najboljši je " + number + ". skakalec (" + secondLenght + ").");
    }
}
