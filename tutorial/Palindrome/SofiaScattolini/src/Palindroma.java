import java.util.Scanner;

public class Palindroma {

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserire la parola/numeri da controllare: ");
        String word = scanner.nextLine();


        boolean isPalindroma = isPalindroma(word);
        if(isPalindroma)
            System.out.println("La frase/parola è palindroma");
        else
            System.out.println("La frase/parola non è palindroma");
        }

        public static boolean isPalindroma(String word){

        if(word==null)
            return false;

        if(word.length()<2)
            return true;


        boolean palindroma = true;
        int start =0;
        int end = word.length()-1;

        for(; start < end; start++, end-- ) {
            if (word.charAt(start) != word.charAt(end)) {
                palindroma = false;
                break;
            }
        }
        return palindroma;
    }




}

