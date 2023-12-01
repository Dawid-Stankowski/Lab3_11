import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int rozmiar = 20;

        // Wypełnenie jednowymiarowej tablicy
        int[] jednowymiarowa = wypelnijJednowymiarowa(rozmiar);
        System.out.print("Jednowymiarowa tablica: ");
        wyswietlTablice(jednowymiarowa);

        System.out.println(); // Nowa linia dla czytelności

        // Wypełnienie dwuwymiarowej tablicy
        int[][] dwuwymiarowa = wypelnijDwuwymiarowa(rozmiar);
        System.out.println("Dwuwymiarowa tablica:");
        wyswietlTablice(dwuwymiarowa);
    }
    private static int[] wypelnijJednowymiarowa(int rozmiar) {
        int[] tablica = new int[rozmiar];
        Random rand = new Random();

        for (int i = 0; i < rozmiar; i++) {
            tablica[i] = rand.nextInt(21); // Losowa liczba całkowita z przedziału [0, 20]
        }

        return tablica;
    }


    private static int[][] wypelnijDwuwymiarowa(int rozmiar) {
        int[][] tablica = new int[rozmiar][rozmiar];
        Random rand = new Random();

        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                tablica[i][j] = rand.nextInt(21); // Losowa liczba całkowita z przedziału [0, 20]
            }
        }

        return tablica;
    }
    private static void wyswietlTablice(int[] tablica) {
        for (int element : tablica) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void wyswietlTablice(int[][] tablica) {
        for (int[] wiersz : tablica) {
            for (int element : wiersz) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
