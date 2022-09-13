
public class Test02 {

    public static void main(String[] args) {
        Object[] tabela = {"Danes", "je", "lep", "dan"};
        OvojnikTabele ovojnik = new OvojnikTabele(tabela);
        for (Object obj: ovojnik) {
            System.out.println(obj);
        }
    }
}
