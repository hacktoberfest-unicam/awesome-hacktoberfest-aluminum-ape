import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        int decimal = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        decimal = input.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println( decimal + " in binary -> " + binary);
    }
}