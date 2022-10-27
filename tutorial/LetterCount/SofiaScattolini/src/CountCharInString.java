import java.util.Scanner;

public class CountCharInString {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la stringa: ");
        String string = scanner.nextLine().toLowerCase();

        int count =0;
        int numeroVocali =0;
        int numeroSpazi =0;
        int numeroConsonanti=0;
        for(int i=0; i<string.length(); i++){
           if(string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' ||
                   string.charAt(i)=='o' || string.charAt(i)=='u')
               numeroVocali++;
           else if(string.charAt(i)==' ')
               numeroSpazi++;
           else
               numeroConsonanti++;

            count++;
        }


        System.out.println("Numero caratteri : " +count + "\n Numero vocali : " + numeroVocali +
                "\n Numero spazi: "+ numeroSpazi + "\n Numero consonanti: "+ numeroConsonanti);
    }




}
