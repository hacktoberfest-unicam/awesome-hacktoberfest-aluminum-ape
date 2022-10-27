import java.util.Scanner;

public class Convertitor {

    public static void main(String[] args){
        int x, resto;
        StringBuilder risultato= new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la cifra da convertire");
        x = scanner.nextInt();

        while (x>0){
            resto = x%2;
            x/=2;
            risultato.insert(0, resto);
        }

        System.out.println("la cifra in notazione binaria è: "+ risultato);
    }
}
