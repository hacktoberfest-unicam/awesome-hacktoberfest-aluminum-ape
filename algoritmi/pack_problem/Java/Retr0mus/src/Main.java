import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dichiarazione delle variabili
        Scanner scanner = new Scanner(System.in); // Inizializzazione scanner
        int pack, a, b;
        int na = 0, nb = 0;

        // Lettura dati da stdin
        do {
            System.out.println("Inserisci la massa in kg del pack: ");
            pack = scanner.nextInt();
        }while(pack <= 0);

        do {
            System.out.println("Inserisci la massa in kg dei blocchi A: ");
            a = scanner.nextInt();
        }while(a <= 0);

        do {
            System.out.println("Inserisci la massa in kg dei blocchi B (> A): ");
            b = scanner.nextInt();
        }while(b <= 0 || b <= a);

        // Elaborazione del risultato
        if(pack % a == 0)
            na = pack/a;
        else
        {
            int i = 1;

            while(((pack/a)-i)*a + b*i < pack)
            {
                i++;
            }

            na = (pack/a)-i;
            nb = i;
        }

        // Stampa del risultato
        System.out.println("{" + na + "|" + nb + "}");
    }
}
