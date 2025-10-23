import java.util.Scanner;

public class Main {
    public static int validareSaptamana() {
        System.out.println("Introduceti saptamana");
        int alegere = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Introduceti un numar intre 1 si 4: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Trebuie sa introduceti un numar natural intre 1 si 4!");
                scanner.next();
            }
            alegere = scanner.nextInt();
            if (alegere < 1 || alegere > 4) {
                System.out.println("Numarul trebuie sa fie intre 1 si 4!");
            }
        } while (alegere < 1 || alegere > 4);
        return alegere;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TemperaturiMaximeLunare temp = new TemperaturiMaximeLunare();

        boolean run = true;
        while(run) {

            int alegere = 0;
            int saptamana = 0;

            System.out.println("""
                    [1] Introduceti temperaturi
                    [2] Afiseaza toate temperaturile
                    [3] Afiseaza temperaturile unei saptamani
                    [4] Afiseaza temperatura unei zile din saptamana
                    [5] Afiseaza cea mai calduroasa zi dintr-o saptamana
                    [6] Exit""");
            System.out.println("Tastati un numare de la 1 la 6 pentru a alege optiunea");

            do {
                System.out.print("Introduceti un numar intre 1 si 6: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Trebuie sa introduceti un numar intreg intre 1 si 6!");
                    scanner.next();
                }
                alegere = scanner.nextInt();
                if (alegere < 1 || alegere > 6) {
                    System.out.println("Numarul trebuie sa fie intre 1 si 6!");
                }
            } while (alegere < 1 || alegere > 6);

            switch (alegere) {
                case 1:
                    System.out.println("Ati selectat introducere temperaturi, introduceti datele (in total 28 de intrari)");
                    temp.introduceTemp();
                    break;
                case 2:
                    System.out.println("Ati selectat afisare temperaturi");
                    temp.afisareTemp();
                    break;
                case 3:
                    System.out.println("Ati selectat afisare temperaturi saptamana");

                    saptamana = validareSaptamana();
                    temp.afisareTempSapt(saptamana);
                    break;
                case 4:
                    System.out.println("Ati selectat afisare temperatura zilei dintr-o anumita saptamana");

                    saptamana = validareSaptamana();
                    int zi = 0;

                    System.out.println("Introduceti ziua");
                    do {
                        System.out.print("Introduceti ziua (1–7): ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Trebuie sa introduceti un numar natural intre 1 si 7!");
                            scanner.next();
                            System.out.print("Reincercati: ");
                        }
                        zi = scanner.nextInt();
                        if (zi < 1 || zi > 7) {
                            System.out.println("Numarul trebuie sa fie intre 1 si 7!");
                        }
                    } while (zi < 1 || zi > 7);
                    temp.afisareTempSaptZi(saptamana, zi);
                    break;
                case 5:
                    System.out.println("Ati selectat temperatura maxima din saptamana");

                    saptamana =  validareSaptamana();
                    System.out.println("Temperatura maxima: " + temp.afisareMaximTemp(saptamana));
                    break;
                case 6:
                    System.out.println("Inchidere program...");
                    run = false;
                    break;
            }
        }
    }
}
