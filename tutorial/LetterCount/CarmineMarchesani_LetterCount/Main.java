package tutorial.LetterCount.CarmineMarchesani_LetterCount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insert a string: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        LetterCounter letters = new LetterCounter(word);
        System.out.println("Nr. of consonants: "+  letters.getConsonants());
        System.out.println("Nr. of vowels: " + letters.getVowels());
        System.out.println("Nr. of blanks: " + letters.getBlanks());
    }
}
