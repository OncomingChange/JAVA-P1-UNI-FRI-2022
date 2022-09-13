
public class Test10 {

    public static void main(String[] args) {
        Filozof[] filozofi = new Filozof[26];
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
        filozofi[10] = new Filozof("K");
        filozofi[11] = new Filozof("L");
        filozofi[12] = new Filozof("M");
        filozofi[13] = new Filozof("N");
        filozofi[14] = new Filozof("O");
        filozofi[15] = new Filozof("P");
        filozofi[16] = new Filozof("Q");
        filozofi[17] = new Filozof("R");
        filozofi[18] = new Filozof("S");
        filozofi[19] = new Filozof("T");
        filozofi[20] = new Filozof("U");
        filozofi[21] = new Filozof("V");
        filozofi[22] = new Filozof("W");
        filozofi[23] = new Filozof("X");
        filozofi[24] = new Filozof("Y");
        filozofi[25] = new Filozof("Z");

        filozofi[0].nastaviSoseda(filozofi[19], filozofi[8]);
        filozofi[1].nastaviSoseda(filozofi[4], filozofi[9]);
        filozofi[2].nastaviSoseda(filozofi[25], filozofi[17]);
        filozofi[3].nastaviSoseda(filozofi[8], filozofi[23]);
        filozofi[4].nastaviSoseda(filozofi[6], filozofi[1]);
        filozofi[5].nastaviSoseda(filozofi[9], filozofi[19]);
        filozofi[6].nastaviSoseda(filozofi[24], filozofi[4]);
        filozofi[7].nastaviSoseda(filozofi[20], filozofi[12]);
        filozofi[8].nastaviSoseda(filozofi[0], filozofi[3]);
        filozofi[9].nastaviSoseda(filozofi[1], filozofi[5]);
        filozofi[10].nastaviSoseda(filozofi[23], filozofi[22]);
        filozofi[11].nastaviSoseda(filozofi[18], filozofi[16]);
        filozofi[12].nastaviSoseda(filozofi[7], filozofi[13]);
        filozofi[13].nastaviSoseda(filozofi[12], filozofi[20]);
        filozofi[14].nastaviSoseda(filozofi[17], filozofi[18]);
        filozofi[15].nastaviSoseda(filozofi[21], filozofi[21]);
        filozofi[16].nastaviSoseda(filozofi[11], filozofi[25]);
        filozofi[17].nastaviSoseda(filozofi[2], filozofi[14]);
        filozofi[18].nastaviSoseda(filozofi[14], filozofi[11]);
        filozofi[19].nastaviSoseda(filozofi[5], filozofi[0]);
        filozofi[20].nastaviSoseda(filozofi[13], filozofi[7]);
        filozofi[21].nastaviSoseda(filozofi[15], filozofi[15]);
        filozofi[22].nastaviSoseda(filozofi[10], filozofi[24]);
        filozofi[23].nastaviSoseda(filozofi[3], filozofi[10]);
        filozofi[24].nastaviSoseda(filozofi[22], filozofi[6]);
        filozofi[25].nastaviSoseda(filozofi[16], filozofi[2]);

        for (int i = 0;  i < filozofi.length;  i++) {
            System.out.println(filozofi[i].steviloFilozofov());
        }
    }
}
