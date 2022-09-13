package JavaOdZačetka;
import java.util.Scanner;

public class Naloga313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stVnosov = 0;
        int vsota = 0;

        do {
            System.out.print("Vnesite število: ");
            int vnos = sc.nextInt();
            stVnosov = stVnosov + 1;
            vsota = vsota + vnos;
            System.out.println(vsota);
        } while (stVnosov < 5 && vsota <= 42); 
    }
    
}
