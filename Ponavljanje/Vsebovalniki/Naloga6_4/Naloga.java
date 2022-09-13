import java.util.*;

public class Naloga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        List<String> vrstica1 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            vrstica1.add(i, sc.next());
        }
        vrstica1.sort(null);

        int n = sc.nextInt();
        List<String> vrstica2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            vrstica2.add(i, sc.next());
        }
        vrstica2.sort(null);

        vrstica1.removeAll(vrstica2);


        ArrayList<String> newList = new ArrayList<>();
  
        for (String element: vrstica1) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
}
