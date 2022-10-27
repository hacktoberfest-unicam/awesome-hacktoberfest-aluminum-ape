import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inizializzazione stdin
        Scanner scanner = new Scanner(System.in);
        int n;

        // Lettura numero interno n in b10
        do{
            System.out.println("Inserisci un numero in decimale: ");
            n = scanner.nextInt();
        }while (n < 0);

        // Conversione in b2 e stampa del risultato
        System.out.println(decToBin(n));
    }

    private static String decToBin(int n)
    {
        String s = "";

        while(n > 0)
        {
            int r = n%2;
            s = r + s;
            n = n/2;
        }

        return s;
    }
}