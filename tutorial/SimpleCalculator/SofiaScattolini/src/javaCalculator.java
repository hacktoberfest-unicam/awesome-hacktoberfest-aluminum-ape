import java.util.Objects;
import java.util.Scanner;

public class javaCalculator {

    public static void main (String[] args){
        int num1, num2;
        String operation;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        num1 = scanner.nextInt();
        System.out.println("Inserisci il secondo numero: ");
        num2 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Inserisci l'operazione: ");
        operation = scanner1.nextLine();

        if (Objects.equals(operation, "+"))
            System.out.println("Soluzione: " + (num1 + num2));
        if  (Objects.equals(operation, "-"))
            System.out.println("Soluzione: " + (num1 - num2));
        if (Objects.equals(operation, "/"))
            System.out.println("Soluzione: " + (num1 / num2));
        if (Objects.equals(operation, "*"))
            System.out.println("Soluzione: " + (num1 * num2));
    }
}
