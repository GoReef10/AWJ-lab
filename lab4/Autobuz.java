public class Autobuz {
    public static int calculeazaZileIntarzieri(int[][] intarziate) {
        int nrIntarzieri = 0;
        for(int i = 0; i < 52; i++)
            for(int j = 0; j < 7; j++)
                if(intarziate[i][j] > 1)
                    nrIntarzieri++;
        return nrIntarzieri;
    }

    public static void main(String[] args) {
        int[][] intarziate = new int[52][7];

        for (int sapt = 0; sapt < 52; sapt++) {
            for (int zi = 0; zi < 7; zi++) {
                intarziate[sapt][zi] = (int)(Math.random() * 5); // random 0–4 delays
            }
        }
        System.out.println(calculeazaZileIntarzieri(intarziate));
    }
}
