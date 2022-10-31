import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // Dichiarazione variabili
        Scanner scanner = new Scanner(System.in); // Inizializzazione scanner
        double a, b, c;

        // Lettura dei valori da stdin
        System.out.println("Inserisci il coefficiente a: ");
        if(scanner.hasNextDouble())
        {
            a = scanner.nextDouble();

            if(a == 0)
                return;
        }
        else
            return;

        System.out.println("Inserisci il coefficiente b: ");
        if(scanner.hasNextDouble())
            b = scanner.nextDouble();
        else
            return;

        System.out.println("Inserisci il coefficiente c: ");
        if(scanner.hasNextDouble())
            c = scanner.nextDouble();
        else
            return;

        // Calcolo dell'equazione
        if(delta(a, b, c) > 0)
            System.out.println("I risultati dell'equazione sono " + (-b + Math.sqrt(delta(a, b, c)))/2*a + " e " + (-b - Math.sqrt(delta(a, b, c)))/2*a);
        else if(delta(a, b, c) == 0)
            System.out.println("Il risultato è " + (-b/2*a));
        else
            System.out.println("L'equazione non ha soluzioni nei numeri reali");
    }

    private static double delta(double a, double b, double c)
    {
        return (b*b)-(4*a*c);
    }
}