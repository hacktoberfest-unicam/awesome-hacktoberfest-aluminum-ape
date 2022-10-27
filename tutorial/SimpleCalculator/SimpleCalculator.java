import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        boolean exit = false;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("inserire primo numero: ");
            Double n1 = input.nextDouble();

            System.out.print("inserire secondo numero: ");
            Double n2 = input.nextDouble();

            System.out.print("Scegliere un operazione: \n1-Somma\n2-Sottrazione\n3-Moltiplicazione\n4-Divisione\n5-Esci\nScelta: ");
            Integer operation = input.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Somma: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Sottrazione: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Moltiplicazione: " + (n1 * n2));
                    break;
                case 4:
                    if (n1 == 0 && n2 == 0)
                        System.out.println("Divisione indeterminata");
                    else if (n1 == 0)
                        System.out.println("Divisione: 0");
                    else if (n2 == 0)
                        System.out.println("Divisione impossibile");
                    else
                        System.out.println("Divisione " + (n1 / n2));
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Operazione non valida");
            }
        }while(!exit);
    }
}
