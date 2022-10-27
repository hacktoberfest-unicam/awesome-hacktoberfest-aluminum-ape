import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int zaino = 0;
        int pesoA = 0;
        int pesoB = 0;
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Inserisci il peso che lo zaino puo' sopportare: ");
            zaino = scanner.nextInt();
        }while(zaino < 3);
        do {
            check = false;
            System.out.print("Inserisci il peso dei blocchi piccoli: ");
            pesoA = scanner.nextInt();
            if(pesoA >= (zaino/2) || pesoA < 0) {
                check = true;
            }
        }while(check);
        do {
            check = false;
            System.out.print("Inserisci il peso dei blocchi grandi: ");
            pesoB = scanner.nextInt();
            if(pesoB <= pesoA || pesoB > zaino) {
                check = true;
            }
        }while(check);

        for(int index = 0; index < zaino; index++) {
            for(int index2 = 1; index2 < zaino; index2++) {
                if((pesoA*index) + (pesoB*index2) == zaino) {
                    System.out.println("numero blocchi piccoli: " + index);
                    System.out.println("numero blocchi grandi: " + index2);
                }
            }
        }

    }

}
