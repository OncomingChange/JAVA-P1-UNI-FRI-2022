package KrmilniKonstrukti;
import java.util.Scanner;

public class Naloga11 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int stevilo = sc.nextInt();
            System.out.print(Math.abs(stevilo));
        }
    }
}