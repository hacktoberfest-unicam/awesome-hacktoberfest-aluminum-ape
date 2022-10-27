import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il nome:\n");
        String nome  = sc.nextLine();
        CountString string = new CountString(nome);
        System.out.println("Hai scelto il seguente nome: " + string.getNome());
        System.out.println("Il tuo nome ha lunghezza: " + string.getNameLenght());
        System.out.printf("Nome composto da: " + string.getVocali() + "vocali");
        System.out.println("Nome composto da: " + string.getSpace() + "spazi.");
    }
}