import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dichiarazione variabili
        Scanner scanner = new Scanner(System.in);
        String s;

        // Lettura della parola da stdin
        do {
            System.out.println("Inserisci una parola (no spazi): ");
            s = scanner.nextLine();
        }while(s.contains(" "));

        // Verifica e stampa del risultato
        if(isPalindrome(s))
            System.out.println("La parola e' palindroma");
        else
            System.out.println("La parola non e' palindroma");

    }

    private static boolean isPalindrome(String s)
    {
        char[] v = s.toCharArray();

        for(int i = 0; i<v.length/2; i++)
            if(v[i] != v[v.length-1-i])
                return false;

        return true;
    }
}