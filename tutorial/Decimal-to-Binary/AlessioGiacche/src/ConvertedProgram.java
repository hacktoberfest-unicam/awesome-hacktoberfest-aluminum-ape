import java.util.Scanner;

public class ConvertedProgram {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number to convert: ");
        int number = sc.nextInt();
        while (number > 0){
            int rest = number % 2;
            number /=2;
            result.insert(0, rest);
        }
        System.out.println("Converted number: " + result);
    }
}