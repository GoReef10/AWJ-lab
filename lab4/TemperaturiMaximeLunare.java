import java.util.Scanner;

public class TemperaturiMaximeLunare {
    double[][] temperaturi = new double[4][7];

    public void introduceTemp() {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 7; j++) {
                temperaturi[i][j] = scanner.nextDouble();
            }
        }
    }

    public void afisareTemp() {
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 7; j++) {
                System.out.println(temperaturi[i][j] + " ");
            }
        }
    }

    public void afisareTempSapt(int saptamana) {
        for(int i = 0; i < 7; i++) {
            System.out.println(temperaturi[saptamana-1][i]);
        }
    }

    public void afisareTempSaptZi(int saptamana, int zi) {
            System.out.println(temperaturi[saptamana-1][zi-1]);
    }

    public double afisareMaximTemp(int saptamana) {
        double max = Double.MIN_VALUE;
        for(int j = 0; j < 7; j++) {
            if(temperaturi[saptamana-1][j] > max) {
                max = temperaturi[saptamana-1][j];
            }
        }
        return max;
    }
}
