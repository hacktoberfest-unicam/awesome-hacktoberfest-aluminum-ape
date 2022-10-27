import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        int a = sc.nextInt();
        System.out.println("Iserisci il secondo numero:");
        int b = sc.nextInt();
        Calculator calculator = new Calculator();
        System.out.print("""
                Inserisci l'operazione che vuoi fare:1. Somma
                2. Differenza
                3. Moltiplicazione
                4. Divisione.
                
                """);
        int o = sc.nextInt();
        double result = 0;
        switch (o) {
            case 1 -> {
                result = calculator.somma(a, b);
                System.out.println("La somma e': " + result);
            }
            case 2 -> {
                result = calculator.differenza(a, b);
                System.out.println("La differenza e' : " + result);
            }
            case 3 -> {
                result = calculator.moltiplicazione(a, b);
                System.out.println("La moltiplicazione e' : " + result);
            }
            case 4 -> {
                result = calculator.divisione(a, b);
                System.out.println("La divisione e' : " + result);
            }
        }
    }
}