
public class Test04 {

    public static void main(String[] args) {
        Filozof[] filozofi = new Filozof[10];
        filozofi[0] = new Filozof("A");
        filozofi[1] = new Filozof("B");
        filozofi[2] = new Filozof("C");
        filozofi[3] = new Filozof("D");
        filozofi[4] = new Filozof("E");
        filozofi[5] = new Filozof("F");
        filozofi[6] = new Filozof("G");
        filozofi[7] = new Filozof("H");
        filozofi[8] = new Filozof("I");
        filozofi[9] = new Filozof("J");

        filozofi[7].nastaviSoseda(filozofi[0], filozofi[9]);
        filozofi[9].nastaviSoseda(filozofi[7], filozofi[4]);
        filozofi[0].nastaviSoseda(filozofi[3], filozofi[7]);
        filozofi[8].nastaviSoseda(filozofi[5], filozofi[3]);
        filozofi[1].nastaviSoseda(filozofi[6], filozofi[2]);
        filozofi[6].nastaviSoseda(filozofi[4], filozofi[1]);
        filozofi[4].nastaviSoseda(filozofi[9], filozofi[6]);
        filozofi[2].nastaviSoseda(filozofi[1], filozofi[5]);
        filozofi[5].nastaviSoseda(filozofi[2], filozofi[8]);
        filozofi[3].nastaviSoseda(filozofi[8], filozofi[0]);

        for (int i = 0;  i < filozofi.length;  i++) {
            for (int j = 0;  j < filozofi.length;  j++) {
                System.out.print(filozofi[i].jeLeviSosedOd(filozofi[j]) ? "+" : "-");
                System.out.print(filozofi[i].jeDesniSosedOd(filozofi[j]) ? "+" : "-");
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0;  i < filozofi.length;  i++) {
            izpisiSoseda(filozofi[i]);
        }
    }

    private static void izpisiSoseda(Filozof filozof) {
        Filozof[] soseda = filozof.vrniSoseda();
        System.out.printf("%s/%s%n", soseda[0].vrniIme(), soseda[1].vrniIme());
    }
}
