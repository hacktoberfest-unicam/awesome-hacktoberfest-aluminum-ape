package tutorial.Palindrome.CarmineMarchesani_Palindrome;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = "", reverse = "";
        System.out.println("Insert a string: ");
        string = input.nextLine();
        string = string.toLowerCase();

        for (int i = string.length() - 1; i >= 0; i--)
            reverse = reverse + string.charAt(i);

        if(string.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}