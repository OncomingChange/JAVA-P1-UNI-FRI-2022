
public class Test01 {

    public static void main(String[] args) {
        Object[] tabela = {5, -2, 6, 3, 10};
        OvojnikTabele ovojnik = new OvojnikTabele(tabela);
        for (Object obj: ovojnik) {
            System.out.println(obj);
        }
    }
}
