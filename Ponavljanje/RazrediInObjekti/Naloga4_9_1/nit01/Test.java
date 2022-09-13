package Naloga4_9;


public class Test {
    public static void main(String[] args) {
    Prastevila prastevila = new Prastevila();
    System.out.println(prastevila.vrniTrenutno());
    prastevila.nastaviTrenutno(37);
    System.out.println(prastevila.vrniTrenutno());
    prastevila.nastaviTrenutno(11);
    System.out.println(prastevila.vrniTrenutno());
    System.out.println(prastevila.vrniTrenutno());
    }
}
