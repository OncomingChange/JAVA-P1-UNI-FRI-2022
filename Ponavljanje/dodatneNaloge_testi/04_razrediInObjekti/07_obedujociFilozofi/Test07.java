
public class Test07 {

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

        filozofi[0].nastaviSoseda(filozofi[8], filozofi[6]);
        filozofi[1].nastaviSoseda(filozofi[3], filozofi[5]);
        filozofi[2].nastaviSoseda(filozofi[6], filozofi[3]);
        filozofi[3].nastaviSoseda(filozofi[2], filozofi[1]);
        filozofi[4].nastaviSoseda(filozofi[7], filozofi[8]);
        filozofi[5].nastaviSoseda(filozofi[1], filozofi[9]);
        filozofi[6].nastaviSoseda(filozofi[0], filozofi[2]);
        filozofi[7].nastaviSoseda(filozofi[9], filozofi[4]);
        filozofi[8].nastaviSoseda(filozofi[4], filozofi[0]);
        filozofi[9].nastaviSoseda(filozofi[5], filozofi[7]);

        System.out.println(filozofi[0].primiLevo());
        System.out.println(filozofi[7].primiDesno());
        System.out.println(filozofi[4].primiLevo());
        System.out.println(filozofi[3].primiLevo());
        System.out.println(filozofi[3].primiDesno());
        System.out.println(filozofi[7].primiLevo());
        System.out.println(filozofi[5].primiDesno());
        System.out.println(filozofi[0].primiDesno());
        System.out.println(filozofi[5].primiLevo());
        System.out.println(filozofi[6].primiDesno());
        System.out.println(filozofi[1].primiDesno());
        System.out.println(filozofi[8].primiLevo());
        System.out.println(filozofi[4].primiLevo());
        System.out.println(filozofi[6].primiLevo());
        System.out.println(filozofi[2].primiLevo());
        System.out.println(filozofi[1].primiDesno());
        System.out.println(filozofi[6].primiLevo());
        System.out.println(filozofi[1].primiDesno());
        System.out.println(filozofi[8].primiDesno());
        System.out.println(filozofi[0].primiDesno());
        System.out.println("---");

        for (int i = 0;  i < filozofi.length;  i++) {
            System.out.println(filozofi[i].kolikoPalicicDrzi());
        }
        System.out.println("---");

        System.out.println(Filozof.steviloJedcev(filozofi));
    }
}
