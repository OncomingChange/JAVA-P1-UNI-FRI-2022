import java.util.*;

public class Naloga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //naredi tabelo z besedami in številom klicev besed
        Map<String, Integer> besede = new HashMap<>();
        while (sc.hasNext()) {
            String beseda = sc.next();
            if (besede.containsKey(beseda)) {
                besede.replace(beseda, besede.get(beseda) + 1);
            }
            else {
            besede.put(beseda, 1);
            }
        }

        //uredi tabelo glede na število klicev besed oziroma leksikografsko
        List<Beseda> besede2 = new ArrayList<>();
        for (Map.Entry<String, Integer> par : besede.entrySet()) {
            besede2.add(new Beseda(par.getKey(), par.getValue()));
        }

        besede2.sort(Beseda.primerjalnikPoKlicihInLeksikografsko());
        //izpiši tabelo v obliki System.out.printf("%s (%d)%n", beseda, št. klicev);
        for (Beseda par: besede2) {
            System.out.print(par.toString());
        }
    }
}