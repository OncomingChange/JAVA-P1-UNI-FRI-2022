public class Druga {
    public static int stolpecZNajvecPrevladujoceZelenimi(int[][][] slika){
        int maxStolpec = 0;
        int maxPik = 0;
        for (int j = 0; j < slika[0].length; j++) {
            int g = 0;
            for (int i = 0; i < slika.length; i++) {
                if (slika[i][j][1] > slika[i][j][0] && slika[i][j][1] > slika[i][j][2]) {
                    g++;
                }
            }
            if (g > maxPik) {
                maxPik = g;
                maxStolpec = j;
            }
        }
        return maxStolpec;
    } 
}
